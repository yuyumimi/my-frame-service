package com.yumi.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author yuyu
 * @Date 2019/3/4 9:29
 * @Version 1.0
 **/
@RestController
public class HiController {

    @GetMapping(value = "/hi/{msg}")
    public String sayHi(@PathVariable String msg){

        return "hi "+msg;
    }
}
