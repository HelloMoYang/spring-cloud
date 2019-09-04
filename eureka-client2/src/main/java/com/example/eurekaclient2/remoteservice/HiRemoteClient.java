package com.example.eurekaclient2.remoteservice;


import com.example.eurekaclient2.remoteservice.impl.HiRemoteClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "provider",fallback = HiRemoteClientHystrix.class)
public interface HiRemoteClient {

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(name = "param") String username);
}
