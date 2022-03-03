package org.banwarisaini.learnspringframework.itr3;

import org.banwarisaini.learnspringframework.itr3.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("package org.banwarisaini.learnspringframework.itr3")
public class LearnSpringFrameworkApplication2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(LearnSpringFrameworkApplication2.class, args);
        // In application context MarioGame, GameRunner all will be there
        GameRunner runner = context.getBean(GameRunner.class);

        runner.run();
    }
}
