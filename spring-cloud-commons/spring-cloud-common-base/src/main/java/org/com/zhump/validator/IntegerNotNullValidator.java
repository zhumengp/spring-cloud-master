package org.com.zhump.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

/**
 * 校验数字大小
 * Created by shuzheng on 2017/2/18.
 */
public class IntegerNotNullValidator extends ValidatorHandler<Long> implements Validator<Long> {

    private int min;

    private int max;

    private String fieldName;

    public IntegerNotNullValidator(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean validate(ValidatorContext context, Long integer) {
        if (null == integer || integer.longValue() == 0 || "" == integer+"") {
            context.addError(ValidationError.create(String.format("%s不能为空！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(integer));
            return false;
        }
        return true;
    }


}
