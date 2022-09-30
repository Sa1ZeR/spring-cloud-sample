package me.sa1zer.microsample.eurekaclient.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("hello");
    }
}
