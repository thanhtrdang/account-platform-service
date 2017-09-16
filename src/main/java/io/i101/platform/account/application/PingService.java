package io.i101.platform.account.application;

import reactor.core.publisher.Mono;

public interface PingService {
    Mono<String> ping();
}
