package io.i101.platform.account.interfaces;

import com.greghaskins.spectrum.Spectrum;
import io.i101.platform.account.application.PingService;
import lombok.val;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(Spectrum.class)
public class PingControllerTests {
    @Mock
    private PingService pingService;
    @InjectMocks
    private PingController pingController;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    {
        describe("ping", () -> {
            beforeEach(() -> {
                given(pingService.ping()).willReturn(Mono.just("pong pong pong"));
            });

            it("should return pong pong pong", () -> {
                val pongMono = pingController.ping();
                val pingResult = "pong pong pong";

                StepVerifier.create(pongMono)
                        .expectNext(pingResult)
                        .expectComplete()
                        .verify();

                verify(pingService).ping();
            });
        });
    }
}