package com.yumi.consumer;

import com.yumi.consumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author yuyu
 * @Date 2019/3/4 10:07
 * @Version 1.0
 **/
@RestController
public class Controller {
    @Autowired
    private HiService hiService;

    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/hi/yuyu")
    public String sayHi(String msg) {
        return this.hiService.sayHi(msg+port);
    }
}
