package com.qualifier.config;

import com.qualifier.service.Mammal;
import com.qualifier.service.impl.mammal.Dolphin;
import com.qualifier.service.impl.mammal.Man;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//Usando uma classe de configuração para definir implementações para uma interface
public class ConfigBean {

    public static final String MAN = "man";
    public static final String DOLPHIN = "Dolphin";


    @Bean
    @Primary
    public Mammal mammalBean1() {
        return new Man();
    }

    // Esta bean vai implementar a uma interface 'Mammal' com a implementação 'Dolphin'
    @Bean(DOLPHIN)
    public Mammal mammalBean2() {
        return new Dolphin();
    }
}
