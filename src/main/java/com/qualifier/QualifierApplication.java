package com.qualifier;

import com.qualifier.service.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class QualifierApplication implements CommandLineRunner {

//  Como a classe Cat esta com a notação @Primary, ela será usada como padrão na implementação da interface.
    @Autowired
    private Animal animal;

    @Autowired
    public void setAnimal(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public static void main(String[] args) {
        SpringApplication.run(QualifierApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("==> Animal action: " + animal.action());
    }
}
