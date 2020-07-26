package org.com.zhump.dsp.entity;

public class DspAdvertTaskAuditWithBLOBs extends DspAdvertTaskAudit {
    private String adContent;

    private String paramDesc;

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent == null ? null : adContent.trim();
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }
}