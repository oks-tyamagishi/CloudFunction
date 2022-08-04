package com.example;

import com.example.model.Greeting;
import com.microsoft.azure.functions.ExecutionContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@FunctionalSpringBootTest
public class HelloTest {

    @Autowired
    private Hello hello;

    @Test
    public void test() {
        Mono<Greeting> result = hello.apply(Mono.just(("foo")));
        assertThat(result.block().getMessage()).isEqualTo("Complete!\n");
    }

    @Test
    public void start() {
        HelloHandler handler = new HelloHandler(DemoApplication.class);
        Greeting result = handler.execute("0 */1 * * * *", new ExecutionContext() {
            @Override
            public Logger getLogger() {
                return Logger.getLogger(HelloTest.class.getName());
            }

            @Override
            public String getInvocationId() {
                return "id1";
            }

            @Override
            public String getFunctionName() {
                return "hello";
            }
        });
        handler.close();
        assertThat(result.getMessage()).isEqualTo("Complete!\n");
    }
}