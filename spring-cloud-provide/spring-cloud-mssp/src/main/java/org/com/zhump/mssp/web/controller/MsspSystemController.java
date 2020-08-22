package org.com.zhump.mssp.web.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspSystem;
import org.com.zhump.mssp.entity.MsspSystemExample;
import org.com.zhump.mssp.service.IMsspSystemService;
import org.com.zhump.mssp.web.dto.MsspSystemAddDTO;
import org.com.zhump.mssp.web.dto.MsspSystemEditDTO;
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
@RequestMapping(value = "/system")
@Api(value = "MSSP - MsspSystemController",tags = {"系统管理模块"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MsspSystemController {

    @Resource
    IMsspSystemService msspSystemService;

    /**
     * 列表查询
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "系统列表")
    public BaseResult list(){
        MsspSystemExample example  = new MsspSystemExample();
        List<MsspSystem> msspSystems = msspSystemService.selectByExample(example);
        return Result.ok(msspSystems);
    }

    /**
     * 新增
     * @param msspSystemAddDto
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增系统")
    public BaseResult add(@RequestBody MsspSystemAddDTO msspSystemAddDto){
        ComplexResult result = FluentValidator.checkAll()
                .on(msspSystemAddDto.getName(), new NotNullValidator<>("资源名称"))
                .on(msspSystemAddDto.getIcon(), new NotNullValidator<>("图标"))
                .on(msspSystemAddDto.getOrders(), new NotNullValidator<>("排序"))
                .on(msspSystemAddDto.getStatus(),new NotNullValidator<>("状态"))
                .on(msspSystemAddDto.getTheme(),new NotNullValidator<>("主题"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        MsspSystem msspSystem = new MsspSystem();
        BeanUtils.copyProperties(msspSystemAddDto,msspSystem);
        int i = msspSystemService.insertSelective(msspSystem);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

    /**
     * 编辑
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "编辑系统")
    public BaseResult edit(@RequestBody MsspSystemEditDTO msspSystemEditDto){
        ComplexResult result = FluentValidator.checkAll()
                .on(msspSystemEditDto.getId(),new NotNullValidator<>("系统ID"))
                .on(msspSystemEditDto.getName(), new NotNullValidator<>("资源名称"))
                .on(msspSystemEditDto.getIcon(), new NotNullValidator<>("图标"))
                .on(msspSystemEditDto.getOrders(), new NotNullValidator<>("排序"))
                .on(msspSystemEditDto.getStatus(),new NotNullValidator<>("状态"))
                .on(msspSystemEditDto.getTheme(),new NotNullValidator<>("主题"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        MsspSystem msspSystem = new MsspSystem();
        BeanUtils.copyProperties(msspSystemEditDto,msspSystem);
        MsspSystemExample example = new MsspSystemExample();
        example.createCriteria().andIdEqualTo(msspSystem.getId());
        int i = msspSystemService.updateByExampleSelective(msspSystem,example);
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
        MsspSystemExample example = new MsspSystemExample();
        example.createCriteria().andIdEqualTo(id);
        int i = msspSystemService.deleteByExample(example);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }
}
