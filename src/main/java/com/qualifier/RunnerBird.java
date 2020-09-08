package com.qualifier;

import com.qualifier.service.Bird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RunnerBird implements CommandLineRunner {

    //  O @Qualifier define qual implementaçao(Hawk ou Penguin) da interface(Bird) será usada na criação da instância.
    @Autowired
    @Qualifier("penguin")
    private Bird bird;

    // Usando o nome do objeto de referência da implementação 'hawk' para implementar a interface 'bird'
    @Autowired
    private Bird hawk;

    @Override
    public void run(String... args) throws Exception {
        log.info("==> Bird action: " + bird.action());

        log.info("==> Bird action: " + hawk.action());
    }
}
