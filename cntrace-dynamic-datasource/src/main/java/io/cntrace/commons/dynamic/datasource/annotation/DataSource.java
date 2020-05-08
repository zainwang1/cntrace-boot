/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * 中国追溯链.com
 *
 * 版权所有，侵权必究！
 */

package io.cntrace.commons.dynamic.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
