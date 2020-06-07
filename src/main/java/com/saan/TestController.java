package com.saan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class TestController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello Docker !!";
    }

}
