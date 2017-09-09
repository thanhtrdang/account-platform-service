package io.i101.platform.profile.application;

import reactor.core.publisher.Mono;

public interface PingService {
    Mono<String> ping();
}
