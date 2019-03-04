package com.yumi.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName HiService
 * @Description TODO
 * @Author yuyu
 * @Date 2019/3/4 9:44
 * @Version 1.0
 **/
@FeignClient(value = "my-provider")
public interface HiService {
    @GetMapping(value = "/hi/{msg}")
    String sayHi(@PathVariable String msg);
}
