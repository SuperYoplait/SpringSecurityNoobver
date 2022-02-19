package com.securiy.security.Security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/security")
public class RegistrationController {


    @GetMapping("form")
    public String registration() {


        
    
        return "security/registrationfrom";
    }
}
