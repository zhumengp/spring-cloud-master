package org.com.zhump.mssp.service;

import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;

import java.util.List;
/**
* Title:IMsspUserService
* Description:TODO 描述一下这个类是干嘛的
* @author zhump
* @version 1.0.0
* @date 2021/6/8 23:25
*/
public interface IMsspUserService {

    /**
    * Title:
    * Description:TODO 描述一下这个方法是干嘛的
    * @author zhump
    * @version 1.0.0
    * @date 2021/6/8 23:23
    */
    int countByExample(MsspUserExample example);
    int deleteByExample(MsspUserExample example);
    boolean deleteByPrimaryKey(Long id);
    int insertSelective(MsspUser record);
    List<MsspUser> selectByExample(MsspUserExample example);
    MsspUser selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") MsspUser record, @Param("example") MsspUserExample example);
    int updateByPrimaryKeySelective(MsspUser record);

    /**
     * 根据用户和密码获取用户信息
     */



}
