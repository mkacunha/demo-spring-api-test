package com.mkacunha.demospringapitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/one")
    public String get() {
        return "API One > ok";
    }

}
