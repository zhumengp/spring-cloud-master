package org.com.zhump.dsp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ApiModel
public class AdvertTaskAddDTO {

    /**投放场景，多选流量主，以逗号隔开*/
    @ApiModelProperty(value = "多选流量主")
    private String corpIds;
    /**广告任务基本数据*/
    private AdvertTask advertTask;
    /**包类别 1:锦囊标签,2:锦囊区域,3:数盘标签*/
    @ApiModelProperty(value = "定向类型")
    private Integer pacCatgory;
    /**包json*/
    @ApiModelProperty(value = "包json")
    private String packageJson;
    /**接口参数*/
    @ApiModelProperty(value = "唯品会参数")
    private String vipShopParams;


    @Getter
    @Setter
    public static class AdvertTask{
        @ApiModelProperty(value = "广告主题")
        private String adTheme;
        @ApiModelProperty(value = "总投放额")
        private Long totalCount;
        @ApiModelProperty(value = "日限额")
        private Long dailyLimit;
        @ApiModelProperty(value = "投放开始时间")
        private Integer effectDate;
        @ApiModelProperty(value = "投放结束时间")
        private Integer expiryDate;
        @ApiModelProperty(value = "投放结束时间")
        private Integer sendType;
        @ApiModelProperty(value = "投放时间段")
        private String pushTime;
        @ApiModelProperty(value = "审核状态")
        private Integer auditState;
        @ApiModelProperty(value = "模板ID")
        private String templateId;
        @ApiModelProperty(value = "指令")
        private String replyDesc;
        @ApiModelProperty(value = "复用ID")
        private String copyAdId;
        @ApiModelProperty(value = "流量主编码")
        private String qualityIds;
        @ApiModelProperty(value = "是否营销")
        private Integer market;
        @ApiModelProperty(value = "广告内容")
        private String adContent;
        @ApiModelProperty(value = "人群包ID")
        private String crowdId;
    }




}
