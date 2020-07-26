package org.com.zhump.dsp.entity;

import java.util.Date;

public class DspAdvertCrowd {
    private Long id;

    private String adId;

    private Long crowdId;

    private Date createTime;

    private Integer advertCrowdType;

    private Date updateTime;

    private String taskId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId == null ? null : adId.trim();
    }

    public Long getCrowdId() {
        return crowdId;
    }

    public void setCrowdId(Long crowdId) {
        this.crowdId = crowdId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAdvertCrowdType() {
        return advertCrowdType;
    }

    public void setAdvertCrowdType(Integer advertCrowdType) {
        this.advertCrowdType = advertCrowdType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }
}