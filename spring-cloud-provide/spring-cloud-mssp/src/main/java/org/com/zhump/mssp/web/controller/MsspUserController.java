package org.com.zhump.mssp.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspUserService;
import org.com.zhump.mssp.web.dto.MsspUserDTO;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/user")
@Api(value = "MSSP - MsspUserController",tags = {"用户管理控制层"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
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
    public BaseResult<MsspUser> getByUserId(@PathVariable(value = "userId") Long userId){
        MsspUser user = msspUserService.selectByPrimaryKey(userId);
        return Result.ok(user);
    }

    /**
     * 新增用户信息
     * @param msspUserDTO 新增参数
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增用户")
    public BaseResult insert(@RequestBody  MsspUserDTO msspUserDTO){
        MsspUser recod = new MsspUser();
        BeanUtils.copyProperties(msspUserDTO,recod);
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
    @RequestMapping(value = "/delete/{userId}",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "删除用户")
    public BaseResult delete(@PathVariable(value = "userId") Long userId){
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
    @ApiOperation(httpMethod = "GET",value = "删除用户")
    public BaseResult list(){
        MsspUserExample example = new MsspUserExample();
        List<MsspUser> msspUsers = msspUserService.selectByExample(example);
        return Result.ok(msspUsers);
    }

}
