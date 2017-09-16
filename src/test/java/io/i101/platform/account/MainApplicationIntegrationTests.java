package io.i101.platform.account;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;

/**
 * Integration tests with full Spring Boot app context.
 * Naming for @Test method: [http method]_[context]_[request], e.g. GET /account/load => GET_profile_load
 *
 * Spring’s test framework will cache application contexts between tests.
 * Therefore, as long as your tests share the same configuration (no matter how it’s discovered),
 * the potentially time consuming process of loading the context will only happen once.
 *
 * https://docs.spring.io/spring-boot/docs/2.0.0.M3/reference/htmlsingle/#boot-features-testing
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
//@TestPropertySource
//@TestConfiguration
//@DataJpaTest
public class MainApplicationIntegrationTests {
    @LocalServerPort
    private int port;

    @Before
    public void setup() {
        RestAssured.port = port;
    }

	@Test
	public void GET_ping() {
	    get("/ping")
                .then()
                .statusCode(OK.value())
                .body(is("pong"));
	}
}