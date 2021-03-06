package com.dhy.springboot.grpc.client.controller;

import com.dhy.springboot.grpc.client.service.GrpcClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther:lvaolin
 * @Date: 2019/3/7 11:44
 */
@RestController
public class GrpcClientController {
    @Resource
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "jack") String name) {
        return grpcClientService.sendMessage(name);
    }
}
