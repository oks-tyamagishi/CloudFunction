package com.example;

import com.example.entity.TShippingPackage;
import com.example.entity.TShippingPackageExample;
import com.example.model.Greeting;
import com.example.repository.TShippingPackageMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Function;

public class Hello implements Function<Mono<String>, Mono<Greeting>> {

    Logger logger = LoggerFactory.getLogger(Hello.class);

    @Autowired
    private TShippingPackageMapper mapper;

    @Override
    public Mono<Greeting> apply(Mono<String> mono) {
        TShippingPackageExample cc = new TShippingPackageExample();
        cc.createCriteria().andCreateDatetimeIsNotNull();
        List<TShippingPackage> packs = mapper.selectByExample(cc);
        logger.debug("Package Qty: "+ packs.size());
        return mono.map(user -> new Greeting("Complete!\n"));
    }
}