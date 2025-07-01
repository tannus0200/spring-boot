package tannusit.spring_boot_sgate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SigninRespDto {
    private String status;
    private String message;

}
