package com.zhump.dsp.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class DspAdvertTaskAudit {
    private Integer id;

    private String adId;

    private String corpCode;

    private String adTheme;

    private Integer adType;

    private Long totalCount;

    private Long dailyLimit;

    private Integer effectDate;

    private Integer expiryDate;

    private String startTime;

    private String endTime;

    private Integer sendType;

    private String contentLength;

    private Date realEndTime;

    private Integer adState;

    private Long restCount;

    private Timestamp updateTime;

    private Timestamp creatTime;

    private String pushTime;

    private Integer auditState;

    private String templateId;

    private String ispAllow;

    private Byte canRepeat;

    private Timestamp checkTime;

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