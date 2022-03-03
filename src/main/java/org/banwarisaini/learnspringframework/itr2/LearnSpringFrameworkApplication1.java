package org.banwarisaini.learnspringframework.itr2;

import org.banwarisaini.learnspringframework.itr2.game.GameRunner;
import org.banwarisaini.learnspringframework.itr2.game.MarioGame;
import org.banwarisaini.learnspringframework.itr2.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LearnSpringFrameworkApplication1 {
    public static void main(String[] args) {

        //SpringApplication.run(LearnSpringFrameworkApplication2.class, args);

        MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        GameRunner runner = new GameRunner(game);

        runner.run();
    }
}
