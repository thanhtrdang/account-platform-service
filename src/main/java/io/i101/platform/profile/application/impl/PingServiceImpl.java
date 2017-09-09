package io.i101.platform.profile.application.impl;

import io.i101.platform.profile.application.PingService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PingServiceImpl implements PingService {
    @Override
    public Mono<String> ping() {
        return Mono.just("pong");
    }
}