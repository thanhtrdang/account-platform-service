package io.i101.platform.profile.application.impl;

import com.greghaskins.spectrum.Spectrum;
import lombok.val;
import org.junit.runner.RunWith;
import reactor.test.StepVerifier;

import static com.greghaskins.spectrum.Spectrum.describe;
import static com.greghaskins.spectrum.Spectrum.it;

@RunWith(Spectrum.class)
public class PingServiceImplSpecs {{
    describe("ping", () -> {
        it("should return pong", () -> {
            val pingService = new PingServiceImpl();
            val pongMono = pingService.ping();
            val pingResult = "pong";

            StepVerifier.create(pongMono)
                    .expectNext(pingResult)
                    .expectComplete()
                    .verify();
        });
    });
}}