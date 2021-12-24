package com.gyjian.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${initCount:1}")
    private int count;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get2")
    public int get2() {
        return count;
    }
}