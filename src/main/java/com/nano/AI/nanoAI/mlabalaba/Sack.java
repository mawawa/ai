package com.nano.AI.nanoAI.mlabalaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Sack {
    Stack<Stone> stones;
    public Sack(Player player){
        stones = new Stack<>();
        for(int i = 0;i < 12; i ++ ){
            stones.add(new Stone(player));
        }
    }

    public Stone getStone() {
        return stones.pop();
    }
}
