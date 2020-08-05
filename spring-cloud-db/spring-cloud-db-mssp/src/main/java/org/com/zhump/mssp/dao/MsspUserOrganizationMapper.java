package org.com.zhump.mssp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspUserOrganization;
import org.com.zhump.mssp.entity.MsspUserOrganizationExample;

public interface MsspUserOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int countByExample(MsspUserOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int deleteByExample(MsspUserOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int insert(MsspUserOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int insertSelective(MsspUserOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    List<MsspUserOrganization> selectByExample(MsspUserOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    MsspUserOrganization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") MsspUserOrganization record, @Param("example") MsspUserOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByExample(@Param("record") MsspUserOrganization record, @Param("example") MsspUserOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByPrimaryKeySelective(MsspUserOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_user_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByPrimaryKey(MsspUserOrganization record);
}