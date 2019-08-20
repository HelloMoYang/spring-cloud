package com.example.eurekaclient2.remoteservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service
@FeignClient(name = "client-8762")
public interface HiRemoteClient {

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(name = "param") String username);
}
