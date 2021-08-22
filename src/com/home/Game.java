package com.home;

import java.util.List;

public class Game {
    private List<IPlayer> players;
    private IDeck deck;

    public Game(){

    }

    public void setDeckImp(IDeckFactory factory){
        deck = factory.createDeck();
    }

    public void run(){

    }
}
