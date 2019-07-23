package com.thtf.annotation;

import java.lang.annotation.*;

/**
*@author:lironghong
*
*@date:2019/7/22 17:15
*
*@descroption: JWT验证忽略注解
*/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtIgnore {
}
