package by.pmil.shop.utils;

import org.apache.logging.log4j.core.util.Patterns;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AllArgUsersDTO {
    @NotBlank
    @Size(min = 3, max = 30, message = ConstraintsMessageManager.NAME_ERROR)
    private String name;

    @NotEmpty
    @NotBlank(message = ConstraintsMessageManager.PICTURE_ERROR)
    private String picture;

    @NotBlank
    @Size(min = 9, message = ConstraintsMessageManager.NUMBER_USER_ERROR)
    private String number;
}
