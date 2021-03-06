package org.com.zhump.dsp.web.advertFactory;


import lombok.extern.log4j.Log4j2;
import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;
import org.springframework.stereotype.Service;

/**
 * 锦囊标签
 */
@Service("AdvertTaskTipsTag")
@Log4j2
public class AdvertTaskTipsTag extends AbstractAdvertTask {


    @Override
    public boolean add(AdvertTaskAddDTO advertTaskAdd) {
        return false;
    }
}
