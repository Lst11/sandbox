package com.aws.sandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * InitController.
 *
 * @author alena.stanisheuskaya
 */
@RestController
public class InitController {

    @GetMapping(value = "/init")
    public String getResponse() {
        return "Sandbox started!";
    }
}
