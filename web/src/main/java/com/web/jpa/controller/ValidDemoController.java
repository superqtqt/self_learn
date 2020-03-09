package com.web.jpa.controller;

import com.web.jpa.entry.ValidEntry;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/demo")
@Api(value = "jps的例子")
public class ValidDemoController {

    @PostMapping
    public ValidEntry add(@RequestBody @Valid ValidEntry demo){
        return demo;
    }
    @GetMapping("/{id}")
    public ValidEntry get(@PathVariable String id){
        return new ValidEntry();
    }

}
