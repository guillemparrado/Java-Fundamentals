package cat.barcelonactiva.itacademy.Annotations.Ex2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeToJson {
    String directory();
}