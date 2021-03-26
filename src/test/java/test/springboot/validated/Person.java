package test.springboot.validated;

import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * @author laijunlin
 * @date 2021-03-25 13:55
 */
@Validated
public class Person {

    @NotNull
    private String userName;

}
