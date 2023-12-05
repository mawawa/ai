package com.nano.AI.nanoAI.mlabalaba;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stone {
    Position position;
    Player owner;
    public Stone(Player player){
        this.owner = player;
    }
}
