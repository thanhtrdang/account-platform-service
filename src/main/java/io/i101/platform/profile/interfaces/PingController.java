package io.i101.platform.profile.interfaces;

import io.i101.platform.profile.application.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PingController {
    @Autowired
    private PingService pingService;

    @GetMapping("/ping")
    public Mono<String> ping() {
        return pingService.ping();
    }
}