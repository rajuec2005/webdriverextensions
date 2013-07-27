package org.andidev.webdriverextension.junitrunner.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface JavascriptEnabled {
    public BooleanOption value() default BooleanOption.ANY;
}
