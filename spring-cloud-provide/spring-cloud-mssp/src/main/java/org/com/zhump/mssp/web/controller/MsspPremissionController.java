package org.com.zhump.mssp.web.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspPermission;
import org.com.zhump.mssp.entity.MsspPermissionExample;
import org.com.zhump.mssp.service.IMsspPermissionService;
import org.com.zhump.mssp.web.dto.MsspPremissionAddDTO;
import org.com.zhump.mssp.web.dto.MsspPremissionEditDTO;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.com.zhump.validator.NotNullValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/resource")
@Api(value = "MSSP - MsspPremissionController",tags = {"资源管理模块"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MsspPremissionController {

    @Resource
    private IMsspPermissionService msspPermissionService;

    /**
     * 列表查询
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "资源列表")
    public BaseResult list(){
        MsspPermissionExample example  = new MsspPermissionExample();
        List<MsspPermission> msspPermissions = msspPermissionService.selectByExample(example);
        return Result.ok(msspPermissions);
    }

    /**
     * 新增
     * @param msspPremissionAddDto
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增资源")
    public BaseResult add(@RequestBody MsspPremissionAddDTO msspPremissionAddDto){
        ComplexResult result = FluentValidator.checkAll()
                                                .on(msspPremissionAddDto.getName(), new NotNullValidator("资源名称"))
                                                .on(msspPremissionAddDto.getIcon(), new NotNullValidator("图标"))
                                                .on(msspPremissionAddDto.getPermissionValue(), new NotNullValidator("权限名"))
                                                .doValidate()
                                                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        MsspPermission msspPermission = new MsspPermission();
        BeanUtils.copyProperties(msspPremissionAddDto,msspPermission);
        int i = msspPermissionService.insertSelective(msspPermission);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

    /**
     * 编辑
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增资源")
    public BaseResult edit(@RequestBody MsspPremissionEditDTO msspPremissionEditDto){
        ComplexResult result = FluentValidator.checkAll()
                .on(msspPremissionEditDto.getName(), new NotNullValidator<String>("资源名称"))
                .on(msspPremissionEditDto.getIcon(), new NotNullValidator<String>("图标"))
                .on(msspPremissionEditDto.getPermissionValue(), new NotNullValidator<String>("权限名"))
                .on(msspPremissionEditDto.getPid(),new NotNullValidator<Integer>("父级编号"))
                .on(msspPremissionEditDto.getSystemId(),new NotNullValidator<Integer>("系统编号"))
                .on(msspPremissionEditDto.getId(),new NotNullValidator<Integer>("资源ID"))
                .on(msspPremissionEditDto.getOrders(),new NotNullValidator<>("排序编号"))
                .on(msspPremissionEditDto.getType(),new NotNullValidator<Byte>("类型"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        MsspPermission msspPermission = new MsspPermission();
        BeanUtils.copyProperties(msspPremissionEditDto,msspPermission);
        MsspPermissionExample example = new MsspPermissionExample();
        example.createCriteria().andIdEqualTo(msspPremissionEditDto.getId());
        int i = msspPermissionService.updateByExampleSelective(msspPermission,example);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

    /**
     * 删除
     */
    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation(httpMethod = "DELETE",value = "删除资源")
    public BaseResult delete(@PathVariable(value = "id")Integer id){
        if (id == null){
            throw new IllegalArgumentException("ID不能为空");
        }
        MsspPermissionExample example = new MsspPermissionExample();
        example.createCriteria().andIdEqualTo(id);
        int i = msspPermissionService.deleteByExample(example);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

}
