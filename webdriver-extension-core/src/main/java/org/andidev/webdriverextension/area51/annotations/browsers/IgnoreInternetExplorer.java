package org.andidev.webdriverextension.area51.annotations.browsers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.andidev.webdriverextension.area51.enums.BooleanOption;
import org.openqa.selenium.Platform;

@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreInternetExplorer {
    public String version() default "";
    public Platform platform() default Platform.ANY;
    public BooleanOption javascriptEnabled() default BooleanOption.ANY;
    public String desiredCapabilities() default "";
}
