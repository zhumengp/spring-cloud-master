package org.com.zhump.mssp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspOrganization;
import org.com.zhump.mssp.entity.MsspOrganizationExample;

public interface MsspOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int countByExample(MsspOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int deleteByExample(MsspOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int insert(MsspOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int insertSelective(MsspOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    List<MsspOrganization> selectByExample(MsspOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    MsspOrganization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") MsspOrganization record, @Param("example") MsspOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByExample(@Param("record") MsspOrganization record, @Param("example") MsspOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByPrimaryKeySelective(MsspOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mssp_organization
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    int updateByPrimaryKey(MsspOrganization record);
}