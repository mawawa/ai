package com.nano.AI.nanoAI.mlabalaba;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private Sack sack;
    private final int player;

    public Player(int playerNumber){
        this.player = playerNumber;
        sack = new Sack(this);
    }

    public Stone takeStone() {
        System.out.println(sack.stones.toString());
        return sack.getStone();
    }
}
