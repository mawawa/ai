package com.nano.AI.nanoAI.mlabalaba;

import lombok.Getter;
import lombok.Setter;

import java.util.EmptyStackException;
import java.util.Scanner;

@Getter
@Setter
public class Board implements Position {
    Stone[] positions = new Stone[24];
    Boolean isTaken;
    Player player1, player2, ai;
    Scanner input;
    Boolean noWinner = true;
    public Board(){
        //create a new board
        input = new Scanner(System.in);
        player1 = new Player(1);
        player2 = new Player(2);
        this.placeStone(player1.takeStone(), input.nextInt() );
        this.placeStone(player2.takeStone(),input.nextInt());

        //game loop
        while(noWinner){
            try {
                this.placeStone(player1.takeStone(), input.nextInt());
            }catch (EmptyStackException e){
                System.out.println("Time to move");
            }

            try{
                this.placeStone(player2.takeStone(),input.nextInt());
            }catch (EmptyStackException e){
                System.out.println("Time to move player 2.");
                noWinner = false;
            }
        }
    }

    public static void main(String [] args){
        new Board();
    }
    @Override
    public Position getPosition(Stone stone) {
        return stone.getPosition();
    }

    @Override
    public boolean placeStone(Stone stone, int position) {

        this.positions[position] = stone;
        stone.position = this;
        return true;
    }
}
