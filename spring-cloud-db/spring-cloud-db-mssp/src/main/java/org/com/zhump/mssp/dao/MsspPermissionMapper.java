package org.com.zhump.mssp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspPermission;
import org.com.zhump.mssp.entity.MsspPermissionExample;

public interface MsspPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int countByExample(MsspPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int deleteByExample(MsspPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int insert(MsspPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int insertSelective(MsspPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    List<MsspPermission> selectByExample(MsspPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    MsspPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") MsspPermission record, @Param("example") MsspPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByExample(@Param("record") MsspPermission record, @Param("example") MsspPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByPrimaryKeySelective(MsspPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_permission
     *
     * @mbggenerated Sat Aug 22 15:49:28 CST 2020
     */
    int updateByPrimaryKey(MsspPermission record);
}