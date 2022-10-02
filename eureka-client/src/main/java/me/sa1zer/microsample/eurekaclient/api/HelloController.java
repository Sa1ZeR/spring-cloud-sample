package me.sa1zer.microsample.eurekaclient.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main/")
public class HelloController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok(String.format("hello from %s micro-service", id));
    }
}
