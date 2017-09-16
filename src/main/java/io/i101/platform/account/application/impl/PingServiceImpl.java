package io.i101.platform.account.application.impl;

import io.i101.platform.account.application.PingService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PingServiceImpl implements PingService {
    @Override
    public Mono<String> ping() {
        return Mono.just("pong");
    }
}