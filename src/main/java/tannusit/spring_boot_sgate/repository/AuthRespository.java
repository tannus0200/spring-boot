package tannusit.spring_boot_sgate.repository;


import org.springframework.stereotype.Repository;
import tannusit.spring_boot_sgate.dto.SigninReqDto;
import tannusit.spring_boot_sgate.dto.SignupReqDto;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AuthRespository {
    private  final Map<String, String> userDb = new HashMap<>();

    public AuthRespository() {
        userDb.put("test@example.com", "박홍석");
            }
    public int findByEmail(String email) {
        if(userDb.containsKey(email)){
            return 0;
        } else {
            return 1;
        }
    }

    public int addUser(SignupReqDto signupReqDto) {
        userDb.put(signupReqDto.getEmail(), signupReqDto.getUsername());
        return 1;
    }

}