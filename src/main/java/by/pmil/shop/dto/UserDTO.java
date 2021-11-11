package by.pmil.shop.dto;


import by.pmil.shop.utils.ConstraintsMessageManager;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    @NotBlank
    @Size(min = 3, max = 30, message = ConstraintsMessageManager.NAME_ERROR)
    private String name;
}
