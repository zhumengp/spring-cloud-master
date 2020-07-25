package com.zhump.dsp.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class DspAdvertTask implements Serializable {

    private static final long serialVersionUID = 2805094404469002498L;
    /**主键*/
    private Integer id;
    /**任务ID*/
    private String adId;
    /**广告主编码*/
    private String corpCode;
    /**主题*/
    private String adTheme;
    /***/
    private Integer adType;
    /**总投放数*/
    private Long totalCount;
    /**日限额*/
    private Long dailyLimit;
    /**投放开始时间*/
    private Integer effectDate;
    /**投放结束时间*/
    private Integer expiryDate;
    /**投放开始时间段*/
    private String startTime;
    /**投放结束时间段*/
    private String endTime;
    /**短信类型， 富贴富*/
    private Integer sendType;
    /**内容长度*/
    private String contentLength;
    /**短信类型， 富贴富*/
    private Date realEndTime;

    private Integer adState;

    private Long restCount;

    private Date updateTime;

    private Date creatTime;

    private String pushTime;

    private Integer auditState;

    private String templateId;

    private String ispAllow;

    private Byte canRepeat;

    private Date checkTime;

    private String checkRemark;

    private String keyWord;

    private Long userId;

    private Integer restRefund;

    private Integer assignType;

    private String replyDesc;

    private String copyAdId;

    private Integer orgId;

    private String qualityIds;

    private Integer market;

    private Integer isOptimize;


}