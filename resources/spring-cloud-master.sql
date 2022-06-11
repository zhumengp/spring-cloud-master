/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.18 : Database - zhump_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zhump_blog` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `mboss`;

/*Table structure for table `branch_table` */

DROP TABLE IF EXISTS `branch_table`;

CREATE TABLE `branch_table` (
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(128) NOT NULL,
  `transaction_id` bigint(20) DEFAULT NULL,
  `resource_group_id` varchar(32) DEFAULT NULL,
  `resource_id` varchar(256) DEFAULT NULL,
  `branch_type` varchar(8) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `client_id` varchar(64) DEFAULT NULL,
  `application_data` varchar(2000) DEFAULT NULL,
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`branch_id`),
  KEY `idx_xid` (`xid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `dsp_advert_areas` */

DROP TABLE IF EXISTS `dsp_advert_areas`;

CREATE TABLE `dsp_advert_areas` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `PROVINCE` varchar(32) NOT NULL DEFAULT '' COMMENT '省',
  `CITY` varchar(32) NOT NULL DEFAULT '' COMMENT '市区',
  `REGION_CODE` varchar(64) DEFAULT '',
  `ADDRESS` varchar(255) NOT NULL DEFAULT '' COMMENT '地址',
  `COORDINATE` varchar(100) NOT NULL DEFAULT '' COMMENT '坐标经纬度，经度和纬度逗号分隔，格式：116.34528°,39.21028°',
  `SCOPE` bigint(20) NOT NULL DEFAULT '0' COMMENT '周边范围，单位：米',
  `TYPE` int(2) DEFAULT '0' COMMENT '地区类型 1：地区选项2：半径画圈3：小区导入',
  `CROWD_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2443 DEFAULT CHARSET=utf8 COMMENT='广告地域标签表';

/*Table structure for table `dsp_advert_areas_audit` */

DROP TABLE IF EXISTS `dsp_advert_areas_audit`;

CREATE TABLE `dsp_advert_areas_audit` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `PROVINCE` varchar(32) NOT NULL DEFAULT '' COMMENT '省',
  `CITY` varchar(32) NOT NULL DEFAULT '' COMMENT '市区',
  `REGION_CODE` varchar(64) DEFAULT '',
  `ADDRESS` varchar(255) NOT NULL DEFAULT '' COMMENT '地址',
  `COORDINATE` varchar(100) NOT NULL DEFAULT '' COMMENT '坐标经纬度，经度和纬度逗号分隔，格式：116.34528°,39.21028°',
  `SCOPE` bigint(20) NOT NULL DEFAULT '0' COMMENT '周边范围，单位：米',
  `TYPE` int(2) DEFAULT '0' COMMENT '地区类型 1：地区选项2：半径画圈3：小区导入',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告地域标签表';

/*Table structure for table `dsp_advert_creative` */

DROP TABLE IF EXISTS `dsp_advert_creative`;

CREATE TABLE `dsp_advert_creative` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NAME` varchar(64) NOT NULL DEFAULT '' COMMENT '创意广告名称',
  `CORP_CODE` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主id',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `CONTENT` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `TEMPLATE_ID` int(10) NOT NULL DEFAULT '0' COMMENT '模板id',
  `REPLY_DESC` varchar(300) NOT NULL DEFAULT '' COMMENT '回复描述',
  `ORG_ID` int(11) NOT NULL DEFAULT '0' COMMENT '组织机构编码',
  `HOT` tinyint(2) NOT NULL DEFAULT '0' COMMENT '热门分类 0代表不热门,1代表是热门',
  `TAG_NAME` varchar(64) NOT NULL DEFAULT '' COMMENT '标签名称',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='创意广告素材表';

/*Table structure for table `dsp_advert_label` */

DROP TABLE IF EXISTS `dsp_advert_label`;

CREATE TABLE `dsp_advert_label` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `LABEL_ID` int(11) NOT NULL DEFAULT '0' COMMENT '标签id',
  `TAG_VALUE_TYPE` int(10) NOT NULL DEFAULT '1' COMMENT '标签值类型：1-子标签；2-数字范围',
  `MIN_VALUE` bigint(20) NOT NULL DEFAULT '0' COMMENT '最小值',
  `MAX_VALUE` bigint(20) NOT NULL DEFAULT '0' COMMENT '最大值',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `CROWD_ID` bigint(18) DEFAULT NULL COMMENT '人群包ID',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='广告标签';

/*Table structure for table `dsp_advert_label_audit` */

DROP TABLE IF EXISTS `dsp_advert_label_audit`;

CREATE TABLE `dsp_advert_label_audit` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `LABEL_ID` int(11) NOT NULL DEFAULT '0' COMMENT '标签id',
  `TAG_VALUE_TYPE` int(10) NOT NULL DEFAULT '1' COMMENT '标签值类型：1-子标签；2-数字范围',
  `MIN_VALUE` bigint(20) NOT NULL DEFAULT '0' COMMENT '最小值',
  `MAX_VALUE` bigint(20) NOT NULL DEFAULT '0' COMMENT '最大值',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='广告标签';

/*Table structure for table `dsp_advert_material` */

DROP TABLE IF EXISTS `dsp_advert_material`;

CREATE TABLE `dsp_advert_material` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `TYPE` int(2) NOT NULL DEFAULT '0' COMMENT '素材类型：1-图片；2-视频；3-音频；',
  `CORP_CODE` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主id',
  `INIT_NAME` varchar(255) NOT NULL DEFAULT '' COMMENT '原文件名',
  `NEW_NAME` varchar(255) NOT NULL DEFAULT '' COMMENT '新文件名',
  `FILE_FORMAT` varchar(255) NOT NULL DEFAULT '' COMMENT '文件格式',
  `URL` varchar(255) NOT NULL DEFAULT '' COMMENT '文件地址',
  `PATH` varchar(255) NOT NULL DEFAULT '' COMMENT '文件服务器上绝对路径',
  `SIZE` bigint(20) NOT NULL DEFAULT '0' COMMENT '文件大小',
  `DURATION` bigint(20) NOT NULL DEFAULT '0' COMMENT '文件时长',
  `CALSSIFY` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '素材分类',
  `USER_ID` bigint(18) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `MATERIAL_SWITCH` int(2) NOT NULL DEFAULT '0' COMMENT '开关',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ORG_ID` bigint(20) NOT NULL COMMENT '组织机构ID',
  `URL_S` varchar(255) NOT NULL COMMENT '小号文件地址',
  `PATH_S` varchar(255) NOT NULL COMMENT '小号服务器绝对路径',
  `SIZE_S` bigint(20) NOT NULL COMMENT '小号文件大小',
  `URL_M` varchar(255) NOT NULL COMMENT '中号文件地址',
  `PATH_M` varchar(255) NOT NULL COMMENT '中号服务器绝对路径',
  `SIZE_M` bigint(20) NOT NULL COMMENT '中号文件大小',
  `URL_L` varchar(255) NOT NULL COMMENT '大号文件地址',
  `PATH_L` varchar(255) NOT NULL COMMENT '大号服务器绝对路径',
  `SIZE_L` bigint(20) NOT NULL COMMENT '大号文件大小',
  `DURATION_M` bigint(20) NOT NULL DEFAULT '0' COMMENT '中号文件时长',
  `ASYTASKID` bigint(20) NOT NULL DEFAULT '0' COMMENT '异步任务编号',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='广告素材表';

/*Table structure for table `dsp_advert_task` */

DROP TABLE IF EXISTS `dsp_advert_task`;

CREATE TABLE `dsp_advert_task` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `CORP_CODE` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主',
  `AD_THEME` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主题',
  `AD_TYPE` int(20) NOT NULL DEFAULT '0' COMMENT '广告类型id',
  `TOTAL_COUNT` bigint(20) NOT NULL DEFAULT '0' COMMENT '总投放限制',
  `DAILY_LIMIT` bigint(20) NOT NULL DEFAULT '0' COMMENT '日投放限制',
  `EFFECT_DATE` int(8) NOT NULL DEFAULT '20000101' COMMENT '生效日期',
  `EXPIRY_DATE` int(8) NOT NULL DEFAULT '20000101' COMMENT '失效日期',
  `START_TIME` varchar(32) NOT NULL DEFAULT '00:00' COMMENT '开始时间',
  `END_TIME` varchar(32) NOT NULL DEFAULT '00:00' COMMENT '结束时间',
  `SEND_TYPE` int(8) NOT NULL DEFAULT '1' COMMENT '投放类型 1：短信广告；2短转富；3富信',
  `CONTENT_LENGTH` varchar(64) NOT NULL DEFAULT '20' COMMENT '短信长度,默认20',
  `AD_CONTENT` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `REAL_END_TIME` timestamp NOT NULL DEFAULT '2000-01-01 13:00:00' COMMENT '实际失效时间',
  `AD_STATE` int(8) NOT NULL DEFAULT '0' COMMENT '广告状态0-进行中1已暂停2已结束',
  `REST_COUNT` bigint(20) NOT NULL DEFAULT '0' COMMENT '剩余次数',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `CREAT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `PUSH_TIME` varchar(500) DEFAULT '' COMMENT '投放时间，多选时段。',
  `AUDIT_STATE` int(2) DEFAULT '0' COMMENT '审核状态：0-待审核（默认值），1-审核中，2-审核通过，3-审核不通过',
  `TEMPLATE_ID` varchar(64) DEFAULT '' COMMENT '模板  T 代表预置模板 C 创意模板',
  `ISP_ALLOW` varchar(3) NOT NULL DEFAULT '101' COMMENT '运营商限制',
  `CAN_REPEAT` tinyint(4) NOT NULL DEFAULT '0' COMMENT '允许相同号码重复投放：0-不允许，1-允许',
  `CHECK_TIME` timestamp NULL DEFAULT NULL COMMENT 'ABOSS审核时间',
  `CHECK_REMARK` varchar(500) DEFAULT NULL COMMENT 'ABOSS审核不通过时，填入原因；',
  `KEY_WORD` varchar(256) NOT NULL DEFAULT '' COMMENT '包含该关键字的短信才能给广告',
  `USER_ID` bigint(20) DEFAULT NULL COMMENT '当前用户操作id',
  `REST_REFUND` int(11) NOT NULL DEFAULT '0' COMMENT '剩余数量是否已退回账户;0.未退回；1.已退回',
  `ASSIGN_TYPE` int(11) DEFAULT NULL COMMENT '定向匹配方式：0-系统人群包；1-第三方人群包；',
  `REPLY_DESC` varchar(300) NOT NULL DEFAULT '' COMMENT '回复描述',
  `copy_ad_id` varchar(32) NOT NULL DEFAULT '' COMMENT '标记复制的那个广告任务的ad_id',
  `PARAM_DESC` text NOT NULL COMMENT '动参描述，记录多个动参的顺序与类型，json数组格式',
  `ORG_ID` int(11) NOT NULL DEFAULT '0' COMMENT '机构ID，关联lf_organization表id',
  `QUALITY_IDS` varchar(260) DEFAULT '' COMMENT '资质id列表逗号隔开(英文)',
  `MARKET` int(2) DEFAULT '0' COMMENT '0:不限;1-再营销；2-排除营销',
  `IS_OPTIMIZE` int(11) NOT NULL DEFAULT '0' COMMENT '优先投放 0 否 1 是',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UN_AD_ID` (`AD_ID`) USING BTREE,
  KEY `EFFECT_DATE_INDEX` (`EFFECT_DATE`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='广告任务主表';

/*Table structure for table `dsp_advert_task_audit` */

DROP TABLE IF EXISTS `dsp_advert_task_audit`;

CREATE TABLE `dsp_advert_task_audit` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `AD_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '广告id',
  `CORP_CODE` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主',
  `AD_THEME` varchar(64) NOT NULL DEFAULT '' COMMENT '广告主题',
  `AD_TYPE` int(20) NOT NULL DEFAULT '0' COMMENT '广告类型id',
  `TOTAL_COUNT` bigint(20) NOT NULL DEFAULT '0' COMMENT '总投放限制',
  `DAILY_LIMIT` bigint(20) NOT NULL DEFAULT '0' COMMENT '日投放限制',
  `EFFECT_DATE` int(8) NOT NULL DEFAULT '20000101' COMMENT '生效日期',
  `EXPIRY_DATE` int(8) NOT NULL DEFAULT '20000101' COMMENT '失效日期',
  `START_TIME` varchar(32) NOT NULL DEFAULT '00:00' COMMENT '开始时间',
  `END_TIME` varchar(32) NOT NULL DEFAULT '00:00' COMMENT '结束时间',
  `SEND_TYPE` int(8) NOT NULL DEFAULT '1' COMMENT '投放类型 1：短信广告；2短转富；3富信',
  `CONTENT_LENGTH` varchar(64) NOT NULL DEFAULT '20' COMMENT '短信长度,默认20',
  `AD_CONTENT` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `REAL_END_TIME` timestamp NOT NULL DEFAULT '2000-01-01 13:00:00' COMMENT '实际失效时间',
  `AD_STATE` int(8) NOT NULL DEFAULT '0' COMMENT '广告状态0-进行中1已暂停2已结束',
  `REST_COUNT` bigint(20) NOT NULL DEFAULT '0' COMMENT '剩余次数',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `CREAT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `PUSH_TIME` varchar(500) DEFAULT '' COMMENT '投放时间，多选时段。',
  `AUDIT_STATE` int(2) DEFAULT '0' COMMENT '审核状态：0-待审核（默认值），1-审核中，2-审核通过，3-审核不通过',
  `TEMPLATE_ID` varchar(64) DEFAULT '' COMMENT '模板  T 代表预置模板 C 创意模板',
  `ISP_ALLOW` varchar(3) NOT NULL DEFAULT '101' COMMENT '运营商限制',
  `CAN_REPEAT` tinyint(4) NOT NULL DEFAULT '0' COMMENT '允许相同号码重复投放：0-不允许，1-允许',
  `CHECK_TIME` timestamp NULL DEFAULT NULL COMMENT 'ABOSS审核时间',
  `CHECK_REMARK` varchar(500) DEFAULT NULL COMMENT 'ABOSS审核不通过时，填入原因；',
  `KEY_WORD` varchar(256) NOT NULL DEFAULT '' COMMENT '包含该关键字的短信才能给广告',
  `USER_ID` bigint(20) DEFAULT NULL COMMENT '当前用户操作id',
  `REST_REFUND` int(11) NOT NULL DEFAULT '0' COMMENT '剩余数量是否已退回账户;0.未退回；1.已退回',
  `ASSIGN_TYPE` int(11) DEFAULT NULL COMMENT '定向匹配方式：0-系统人群包；1-第三方人群包；',
  `REPLY_DESC` varchar(300) NOT NULL DEFAULT '' COMMENT '回复描述',
  `copy_ad_id` varchar(32) NOT NULL DEFAULT '' COMMENT '标记复制的那个广告任务的ad_id',
  `PARAM_DESC` text NOT NULL COMMENT '动参描述，记录多个动参的顺序与类型，json数组格式',
  `ORG_ID` int(11) NOT NULL DEFAULT '0' COMMENT '机构ID，关联lf_organization表id',
  `QUALITY_IDS` varchar(260) DEFAULT '' COMMENT '资质id列表逗号隔开(英文)',
  `MARKET` int(2) DEFAULT '0' COMMENT '0:不限;1-再营销；2-排除营销',
  `IS_OPTIMIZE` int(11) NOT NULL DEFAULT '0' COMMENT '优先投放 0 否 1 是',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UN_AD_ID` (`AD_ID`) USING BTREE,
  KEY `EFFECT_DATE_INDEX` (`EFFECT_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告任务变更审核表';

/*Table structure for table `dsp_crowd_package` */

DROP TABLE IF EXISTS `dsp_crowd_package`;

CREATE TABLE `dsp_crowd_package` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NAME` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '包名称',
  `DESCIPTION` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '包描述',
  `CONTENT` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '包内容，以JSON包存储',
  `CATEGORY` int(2) NOT NULL DEFAULT '0' COMMENT '包类别 1:锦囊标签,2:锦囊区域,3:数盘标签',
  `STATUS` int(2) DEFAULT '0' COMMENT '分析状态，1;分析中 2:分析完成 3：分析失败',
  `ORG_ID` bigint(18) NOT NULL DEFAULT '0' COMMENT '机构ID',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `TYPE` int(2) NOT NULL DEFAULT '0' COMMENT '包类型：1:锦囊标签，2:定点，3:3公里 4：5公里 5：自定义分析',
  `REMAKR` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '失败描述',
  `D_AD_ID` int(11) NOT NULL DEFAULT '-1' COMMENT '分析完成洞察任务ID',
  `CORP_CODE` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '广告主code',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='人群包';

/*Table structure for table `global_table` */

DROP TABLE IF EXISTS `global_table`;

CREATE TABLE `global_table` (
  `xid` varchar(128) NOT NULL,
  `transaction_id` bigint(20) DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  `application_id` varchar(32) DEFAULT NULL,
  `transaction_service_group` varchar(32) DEFAULT NULL,
  `transaction_name` varchar(128) DEFAULT NULL,
  `timeout` int(11) DEFAULT NULL,
  `begin_time` bigint(20) DEFAULT NULL,
  `application_data` varchar(2000) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`xid`),
  KEY `idx_gmt_modified_status` (`gmt_modified`,`status`),
  KEY `idx_transaction_id` (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `lock_table` */

DROP TABLE IF EXISTS `lock_table`;

CREATE TABLE `lock_table` (
  `row_key` varchar(128) NOT NULL,
  `xid` varchar(96) DEFAULT NULL,
  `transaction_id` bigint(20) DEFAULT NULL,
  `branch_id` bigint(20) NOT NULL,
  `resource_id` varchar(256) DEFAULT NULL,
  `table_name` varchar(32) DEFAULT NULL,
  `pk` varchar(36) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`row_key`),
  KEY `idx_branch_id` (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `mssp_organization` */

DROP TABLE IF EXISTS `mssp_organization`;

CREATE TABLE `mssp_organization` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PID` bigint(18) NOT NULL COMMENT '父级ID',
  `NAME` varchar(64) NOT NULL DEFAULT '' COMMENT '机构名称',
  `REMARK` varchar(128) NOT NULL DEFAULT '' COMMENT '机构备注备注',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `mssp_permission` */

DROP TABLE IF EXISTS `mssp_permission`;

CREATE TABLE `mssp_permission` (
  `id` bigint(18) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `system_id` bigint(10) unsigned NOT NULL COMMENT '所属系统',
  `pid` bigint(10) DEFAULT NULL COMMENT '所属上级',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `type` int(4) DEFAULT NULL COMMENT '类型(1:目录,2:菜单,3:按钮)',
  `permission_value` varchar(50) DEFAULT NULL COMMENT '权限值',
  `uri` varchar(100) DEFAULT NULL COMMENT '路径',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `status` int(4) DEFAULT NULL COMMENT '状态(0:禁止,1:正常)',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orders` bigint(20) DEFAULT NULL COMMENT '排序',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限';

/*Table structure for table `mssp_role` */

DROP TABLE IF EXISTS `mssp_role`;

CREATE TABLE `mssp_role` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NAME` varchar(64) NOT NULL DEFAULT '' COMMENT '角色名称',
  `REMARK` varchar(128) NOT NULL DEFAULT '' COMMENT '备注',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `mssp_role_permission` */

DROP TABLE IF EXISTS `mssp_role_permission`;

CREATE TABLE `mssp_role_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `role_id` bigint(18) NOT NULL COMMENT '角色编号',
  `permission_id` bigint(18) unsigned NOT NULL COMMENT '权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色权限关联表';

/*Table structure for table `mssp_system` */

DROP TABLE IF EXISTS `mssp_system`;

CREATE TABLE `mssp_system` (
  `id` bigint(18) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `banner` varchar(150) DEFAULT NULL COMMENT '背景',
  `theme` varchar(50) DEFAULT NULL COMMENT '主题',
  `basepath` varchar(100) DEFAULT NULL COMMENT '根目录',
  `status` int(4) DEFAULT NULL COMMENT '状态(-1:黑名单,1:正常)',
  `name` varchar(20) DEFAULT NULL COMMENT '系统名称',
  `title` varchar(20) DEFAULT NULL COMMENT '系统标题',
  `description` varchar(300) DEFAULT NULL COMMENT '系统描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `orders` bigint(20) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='系统';

/*Table structure for table `mssp_user` */

DROP TABLE IF EXISTS `mssp_user`;

CREATE TABLE `mssp_user` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NAME` varchar(64) DEFAULT NULL COMMENT '用户名',
  `ACCOUNT_NAME` varchar(128) DEFAULT NULL COMMENT '账户名',
  `PASSWORD` varchar(128) DEFAULT NULL COMMENT '密码',
  `PHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `LOCKED` int(2) DEFAULT NULL COMMENT '锁(1:正常 2:锁住)',
  `SEX` int(2) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `mssp_user_organization` */

DROP TABLE IF EXISTS `mssp_user_organization`;

CREATE TABLE `mssp_user_organization` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` bigint(18) unsigned NOT NULL COMMENT '用户编号',
  `organization_id` bigint(18) unsigned NOT NULL COMMENT '组织编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户组织关联表';

/*Table structure for table `mssp_user_role` */

DROP TABLE IF EXISTS `mssp_user_role`;

CREATE TABLE `mssp_user_role` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `USER_ID` bigint(18) DEFAULT NULL COMMENT '用户ID',
  `ROLE_ID` bigint(18) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `resources` */

DROP TABLE IF EXISTS `resources`;

CREATE TABLE `resources` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `permissions_url` varchar(255) DEFAULT NULL,
  `permissions_value` varchar(64) DEFAULT NULL,
  `type` int(2) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `role_info` */

DROP TABLE IF EXISTS `role_info`;

CREATE TABLE `role_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `role_resources` */

DROP TABLE IF EXISTS `role_resources`;

CREATE TABLE `role_resources` (
  `role_id` bigint(20) DEFAULT NULL,
  `resources_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `system_log` */

DROP TABLE IF EXISTS `system_log`;

CREATE TABLE `system_log` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `platform` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `undo_log` */

DROP TABLE IF EXISTS `undo_log`;

CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `context` varchar(128) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  `ext` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `salt` varchar(64) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `head_img` varchar(255) DEFAULT NULL,
  `login_num` int(11) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  `login_time` timestamp NULL DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `locked` int(2) DEFAULT NULL COMMENT '用户锁 0不正常 1 正常',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `zipkin_annotations` */

DROP TABLE IF EXISTS `zipkin_annotations`;

CREATE TABLE `zipkin_annotations` (
  `trace_id_high` bigint(20) NOT NULL DEFAULT '0' COMMENT 'If non zero, this means the trace uses 128 bit traceIds instead of 64 bit',
  `trace_id` bigint(20) NOT NULL COMMENT 'coincides with zipkin_spans.trace_id',
  `span_id` bigint(20) NOT NULL COMMENT 'coincides with zipkin_spans.id',
  `a_key` varchar(255) NOT NULL COMMENT 'BinaryAnnotation.key or Annotation.value if type == -1',
  `a_value` blob COMMENT 'BinaryAnnotation.value(), which must be smaller than 64KB',
  `a_type` int(11) NOT NULL COMMENT 'BinaryAnnotation.type() or -1 if Annotation',
  `a_timestamp` bigint(20) DEFAULT NULL COMMENT 'Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp',
  `endpoint_ipv4` int(11) DEFAULT NULL COMMENT 'Null when Binary/Annotation.endpoint is null',
  `endpoint_ipv6` binary(16) DEFAULT NULL COMMENT 'Null when Binary/Annotation.endpoint is null, or no IPv6 address',
  `endpoint_port` smallint(6) DEFAULT NULL COMMENT 'Null when Binary/Annotation.endpoint is null',
  `endpoint_service_name` varchar(255) DEFAULT NULL COMMENT 'Null when Binary/Annotation.endpoint is null',
  UNIQUE KEY `trace_id_high` (`trace_id_high`,`trace_id`,`span_id`,`a_key`,`a_timestamp`) COMMENT 'Ignore insert on duplicate',
  KEY `trace_id_high_2` (`trace_id_high`,`trace_id`,`span_id`) COMMENT 'for joining with zipkin_spans',
  KEY `trace_id_high_3` (`trace_id_high`,`trace_id`) COMMENT 'for getTraces/ByIds',
  KEY `endpoint_service_name` (`endpoint_service_name`) COMMENT 'for getTraces and getServiceNames',
  KEY `a_type` (`a_type`) COMMENT 'for getTraces',
  KEY `a_key` (`a_key`) COMMENT 'for getTraces',
  KEY `trace_id` (`trace_id`,`span_id`,`a_key`) COMMENT 'for dependencies job'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED;

/*Table structure for table `zipkin_dependencies` */

DROP TABLE IF EXISTS `zipkin_dependencies`;

CREATE TABLE `zipkin_dependencies` (
  `day` date NOT NULL,
  `parent` varchar(255) NOT NULL,
  `child` varchar(255) NOT NULL,
  `call_count` bigint(20) DEFAULT NULL,
  UNIQUE KEY `day` (`day`,`parent`,`child`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED;

/*Table structure for table `zipkin_spans` */

DROP TABLE IF EXISTS `zipkin_spans`;

CREATE TABLE `zipkin_spans` (
  `trace_id_high` bigint(20) NOT NULL DEFAULT '0' COMMENT 'If non zero, this means the trace uses 128 bit traceIds instead of 64 bit',
  `trace_id` bigint(20) NOT NULL,
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `debug` bit(1) DEFAULT NULL,
  `start_ts` bigint(20) DEFAULT NULL COMMENT 'Span.timestamp(): epoch micros used for endTs query and to implement TTL',
  `duration` bigint(20) DEFAULT NULL COMMENT 'Span.duration(): micros used for minDuration and maxDuration query',
  UNIQUE KEY `trace_id_high` (`trace_id_high`,`trace_id`,`id`) COMMENT 'ignore insert on duplicate',
  KEY `trace_id_high_2` (`trace_id_high`,`trace_id`,`id`) COMMENT 'for joining with zipkin_annotations',
  KEY `trace_id_high_3` (`trace_id_high`,`trace_id`) COMMENT 'for getTracesByIds',
  KEY `name` (`name`) COMMENT 'for getTraces and getSpanNames',
  KEY `start_ts` (`start_ts`) COMMENT 'for getTraces ordering and range'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
