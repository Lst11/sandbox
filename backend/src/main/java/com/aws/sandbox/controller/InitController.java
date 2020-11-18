package com.aws.sandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * InitController.
 *
 * @author alena.stanisheuskaya
 */
@RestController
@RequestMapping(value = "/init")
public class InitController {

    @GetMapping
    public String getResponse() {
        return "Sandbox started!";
    }

    @GetMapping(value = "list")
    public List<String> findAllTest() {
        return Arrays.asList("Hello", "Sandbox");
    }
}
