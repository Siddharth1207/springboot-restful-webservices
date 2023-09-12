package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDTO Model Information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    // User first name should not be null or empty
   @Schema(description = "USER FIRST NAME")
    @NotEmpty(message = "User first name should not be null or empty")
    private String firstName;

    // User last name should not be null or empty
    @Schema(description = "USER Last NAME")
    @NotEmpty(message = "User last name should not be null or empty")
    private String lastName;

    // User email should not be null or empty
    // Email address should be valid
    @Schema(description = "USER Email NAME")
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
