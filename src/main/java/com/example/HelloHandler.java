package com.example;

import com.example.model.Greeting;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

public class HelloHandler extends FunctionInvoker<String, Greeting> {

    public HelloHandler(Class<?> configurationClass) {
        super(configurationClass);
    }

    @FunctionName("hello")
    public Greeting execute(
            @TimerTrigger(name = "timerTriggerTest"
                    , schedule = "0 */1 * * * *") String timerInfo,
            ExecutionContext context) {

        context.getLogger().info("execute called");
        return handleRequest("Complete!", context);
    }
}