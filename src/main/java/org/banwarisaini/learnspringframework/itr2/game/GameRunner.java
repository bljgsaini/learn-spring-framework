package org.banwarisaini.learnspringframework.itr2.game;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.right();
        game.left();
        game.down();
    }
}
