package org.banwarisaini.learnspringframework.itr1;

import org.banwarisaini.learnspringframework.itr1.game.GameRunner;
import org.banwarisaini.learnspringframework.itr1.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LearnSpringFrameworkApplication {
    public static void main(String[] args) {
        //SpringApplication.run(LearnSpringFrameworkApplication.class, args);

        MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        GameRunner runner = new GameRunner(game);

        runner.run();

    }
}
