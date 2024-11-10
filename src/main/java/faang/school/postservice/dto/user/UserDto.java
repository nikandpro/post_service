package faang.school.postservice.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDto {
    @Min(0)
    private Long id;
    @NotBlank(message = "Title should not be blank")
    private String username;
    @Email(message = "Email must be in right format")
    private String email;
}
