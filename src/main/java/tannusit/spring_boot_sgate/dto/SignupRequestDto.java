package tannusit.spring_boot_sgate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    }
