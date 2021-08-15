package com.home;

import java.util.List;

public class Game {
    private List<IPlayer> players;
    private IDeck deck;

    public Game(IDeckFactory deckFactory){
        deck = deckFactory.createDeck();
    }

    public void run(){

    }
}
