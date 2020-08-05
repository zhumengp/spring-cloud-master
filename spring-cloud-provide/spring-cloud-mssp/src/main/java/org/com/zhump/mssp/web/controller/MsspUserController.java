package org.com.zhump.mssp.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.service.IMsspUserService;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Log4j2
@RequestMapping(value = "/user")
@Api(value = "MSSP - MsspUserController",tags = {"用户管理控制层"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MsspUserController {


    @Resource
    private IMsspUserService msspUserService;

    /**
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getByUserId/{userId}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据用户ID查询详情",response = MsspUser.class)
    @ApiImplicitParam(name = "userId",value = "用户ID")
    public BaseResult<MsspUser> getByUserId(@PathVariable(value = "userId") Long userId){
        try {
            MsspUser user = msspUserService.getByUserId(userId);
            return Result.ok(user);
        }catch (Exception e){
            log.error("内部错误",e);
            return Result.error();
        }
    }
}
