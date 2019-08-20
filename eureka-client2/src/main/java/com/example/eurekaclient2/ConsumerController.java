package com.example.eurekaclient2;

import com.example.eurekaclient2.remoteservice.HiRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HiRemoteClient remoteClient;

    @GetMapping(value = "/remote-test")
    public String getRemote(@RequestParam(name = "name") String name){
        return remoteClient.hello(name);
    }
}
