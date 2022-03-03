package org.banwarisaini.learnspringframework.itr1.game;

public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.right();
        game.left();
        game.down();
    }
}
