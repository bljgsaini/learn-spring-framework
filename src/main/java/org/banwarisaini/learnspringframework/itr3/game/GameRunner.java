package org.banwarisaini.learnspringframework.itr3.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        System.out.println("using constructor");
        this.game = game;
    }

    public void run() {
        game.up();
        game.right();
        game.left();
        game.down();
    }
}
