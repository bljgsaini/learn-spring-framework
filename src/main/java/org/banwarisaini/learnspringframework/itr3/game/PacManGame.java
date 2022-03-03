package org.banwarisaini.learnspringframework.itr3.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
    @Override
    public void up(){
        System.out.println("jump PacMan");
    }
    @Override
    public void down(){
        System.out.println("lay down");
    }
    @Override
    public void left(){
        System.out.println("stop");
    }
    @Override
    public void right(){
        System.out.println("faster");
    }

}
