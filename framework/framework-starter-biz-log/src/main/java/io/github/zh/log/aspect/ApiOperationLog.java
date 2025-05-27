package io.github.zh.log.aspect;

import java.lang.annotation.*;

/**
 * ApiOperationLog
 *
 * @author 王青玄
 * @version v0.1 2025-05-27 10:39
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
