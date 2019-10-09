/**
 * @description
 * @author SunMin
 * @create 2019/10/9
 * @since 1.0.0
 */
package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value = "/hello")
    public String say(){
            return "hello fuck";
    }
}
