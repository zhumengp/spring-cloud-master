package org.com.zhump.mssp.service;

import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.result.BaseResult;

public interface IMsspAdvertTaskService {

    public BaseResult getByAdId(String ad_id);


}
