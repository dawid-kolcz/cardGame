package com.home;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private IDeck deck;
    private final List<IPlayer> players = new ArrayList<>();

    public Game(){
        players.add(new Player("CPU1"));
        players.add(new Player("CPU2"));
    }

    public void setDeckImp(IDeckFactory factory){
        deck = factory.createDeck();
    }

    public void run(){
        dealCards();

        boolean playerLost = false;
        while(!playerLost){


            for (IPlayer p : players) {
                if(!p.hasMoreCards()) playerLost = true;
            }
        }
    }

    private void dealCards(){
        while (deck.isEmpty()){
            try {
                players.get(0).dealCard(deck.dealCard());
                players.get(1).dealCard(deck.dealCard());
            }
            catch (DeckIsEmptyException e){
                System.out.println(e.getMessage());
            }
        }
    }
}