package org.com.zhump.mssp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspUserRole;
import org.com.zhump.mssp.entity.MsspUserRoleExample;

public interface MsspUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int countByExample(MsspUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int deleteByExample(MsspUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int insert(MsspUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int insertSelective(MsspUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    List<MsspUserRole> selectByExample(MsspUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    MsspUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") MsspUserRole record, @Param("example") MsspUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByExample(@Param("record") MsspUserRole record, @Param("example") MsspUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByPrimaryKeySelective(MsspUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_role
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByPrimaryKey(MsspUserRole record);
}