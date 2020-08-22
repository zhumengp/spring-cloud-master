package org.com.zhump.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import org.apache.commons.lang3.StringUtils;

/**
 * 校验不为null
 * Created by shuzheng on 2017/2/18.
 */
public class NotNullValidator<T> extends ValidatorHandler<T> implements Validator<T> {

    private String fieldName;

    public NotNullValidator(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean validate(ValidatorContext context, T s) {
        if (null == s || "" == s) {
            context.addError(ValidationError.create(String.format("%s不能为空！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        return true;
    }

}
