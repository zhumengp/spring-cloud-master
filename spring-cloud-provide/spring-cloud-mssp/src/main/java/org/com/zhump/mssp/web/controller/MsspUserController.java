package org.com.zhump.mssp.web.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspUserService;
import org.com.zhump.mssp.web.dto.MsspUserAddDTO;
import org.com.zhump.mssp.web.dto.MsspUserEditDTO;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.com.zhump.validator.NotNullValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/user")
@Api(value = "MSSP - MsspUserController",tags = {"用户管理模块"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MsspUserController {


    @Resource
    private IMsspUserService msspUserService;


    /**
     *根据用户Id 查询用户信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getByUserId/{userId}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据用户ID查询详情",response = MsspUser.class)
    @ApiImplicitParam(name = "userId",value = "用户ID")
    public BaseResult getByUserId(@PathVariable(value = "userId") Long userId){
        log.info("查询用户数据ID：{}",userId);
        MsspUser user = msspUserService.selectByPrimaryKey(userId);
        return Result.ok(user);
    }

    /**
     * 新增用户信息
     * @param msspUserAddDto 新增参数
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增用户")
    public BaseResult insert(@ApiParam(name = "msspUserDto", value = "新增用户Dto")@RequestBody MsspUserAddDTO msspUserAddDto){
        ComplexResult re = FluentValidator.checkAll()
                .on(msspUserAddDto.getAccountName(), new NotNullValidator("账号"))
                .on(msspUserAddDto.getName(),new NotNullValidator("用户名"))
                .on(msspUserAddDto.getPassword(),new NotNullValidator("密码"))
                .on(msspUserAddDto.getPhone(),new NotNullValidator("手机号"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!re.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),re.getErrors());
        }
        //查询账号是否相同
        MsspUserExample example = new MsspUserExample();
        example.createCriteria().andAccountNameEqualTo(msspUserAddDto.getAccountName());
        List<MsspUser> msspUsers = msspUserService.selectByExample(example);
        if (msspUsers != null && msspUsers.size() > 0){
            return Result.wrap(ErrorEnum.MSSP10000002.getCode(),"账户名相同");
        }
        MsspUser recod = new MsspUser();
        BeanUtils.copyProperties(msspUserAddDto,recod);
        String md5 = DigestUtils.md5DigestAsHex((recod.getAccountName() + recod.getPassword()).getBytes());
        recod.setPassword(md5);
        int result = msspUserService.insertSelective(recod);
        if (result > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 删除用户
     * @param userId 用户ID
     */
    @RequestMapping(value = "/delete/{userId}",method = RequestMethod.DELETE)
    @ApiOperation(httpMethod = "DELETE",value = "删除用户")
    public BaseResult delete(@ApiParam(name = "userId",value = "用户ID") @PathVariable(value = "userId") Long userId){
        log.info("删除用户数据ID：{}",userId);
        int delete = msspUserService.deleteByPrimaryKey(userId);
        if (delete > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 查询用户信息
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "获取用户信息")
    public BaseResult list(){
        MsspUserExample example = new MsspUserExample();
        List<MsspUser> msspUsers = msspUserService.selectByExample(example);
        return Result.ok(msspUsers);
    }

    /**
     * 编辑用户
     */

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "编辑用户信息")
    public BaseResult edit(@RequestBody MsspUserEditDTO msspUserEditDto){
        if (msspUserEditDto.getId() == null){
            throw new IllegalArgumentException("ID不能为空");
        }
        ComplexResult re = FluentValidator.checkAll()
                .on(msspUserEditDto.getAccountName(), new NotNullValidator("账号"))
                .on(msspUserEditDto.getName(),new NotNullValidator("用户名"))
                .on(msspUserEditDto.getPassword(),new NotNullValidator("密码"))
                .on(msspUserEditDto.getPhone(),new NotNullValidator("手机号"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!re.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),re.getErrors());
        }
        MsspUser user = new MsspUser();
        BeanUtils.copyProperties(msspUserEditDto,user);
        int i = msspUserService.updateByPrimaryKeySelective(user);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

}
