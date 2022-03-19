package com.shy.netty.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shihaoyan
 * @date 2022/3/19 13:06
 * @since 1.0.0
 */
@RestController
@Slf4j
public final class CheckHealthController {

    @GetMapping("/")
    public String checkHealth() {
        log.info("系统启动成功！系统热加载启动成功！");
        return "ok";
    }
}
