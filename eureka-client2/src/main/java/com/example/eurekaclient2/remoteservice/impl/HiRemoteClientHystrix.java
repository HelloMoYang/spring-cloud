package com.example.eurekaclient2.remoteservice.impl;

import com.example.eurekaclient2.remoteservice.HiRemoteClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HiRemoteClientHystrix implements HiRemoteClient {

    @Override
    public String hello(@RequestParam String username) {
        return "hi ," + username + "! message send failed" ;
    }
}
