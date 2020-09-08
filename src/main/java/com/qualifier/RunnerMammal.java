package com.qualifier;

import com.qualifier.service.Mammal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

import static com.qualifier.config.ConfigBean.DOLPHIN;

@Slf4j
@Component
public class RunnerMammal implements CommandLineRunner {

    @Autowired
    private Mammal manMammal1;

    @Autowired
    @Qualifier(DOLPHIN)
    private Mammal manMammal2;

    @Override
    public void run(String... args) throws Exception {
        log.info("==> Mammal action: " + manMammal1.move());

        log.info("==> Mammal action: " + manMammal2.move());
    }
}
