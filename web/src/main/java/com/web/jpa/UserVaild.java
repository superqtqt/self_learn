package com.web.jpa;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {UserVaild.UserValidator.class})
public @interface UserVaild {
    /**
     * 必须的属性
     * 显示 校验信息
     * 利用 {} 获取 属性值，参考了官方的message编写方式
     *
     * @see org.hibernate.validator 静态资源包里面 message 编写方式
     */
    String message() default "日期格式不匹配{dateFormat}";

    /**
     * 必须的属性
     * 用于分组校验
     */
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 非必须
     */
    String dateFormat() default "yyyy-MM-dd HH:mm:ss";

    class UserValidator implements ConstraintValidator<UserVaild, String> {

        /**
         * @param value 要校验的值
         * @param constraintValidatorContext
         * @return
         */
        @Override
        public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
            return false;
        }
    }
}
