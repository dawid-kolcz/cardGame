package com.home;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private IDeck deck;
    private final List<IPlayer> players = new ArrayList<>();

    public Game(){

    }

    public void addPlayer(String playerName){
        players.add(new Player(playerName));
    }

    public void setDeckImp(IDeckFactory factory){
        deck = factory.createDeck();
    }

    public void run(){
        dealCards();

        boolean playerLost = false;
        while(!playerLost){

            turn();

            for (IPlayer p : players) {
                if(!p.hasMoreCards()) playerLost = true;
            }
        }
    }

    private void turn() {
        List<ICard> drawnCards = new ArrayList<>();

        for(IPlayer p: players){
            drawnCards.add(p.drawCard());
        }

        int highest = drawnCards.get(0).getValue();
        for(int i = 1; i < drawnCards.size(); i++){
            if(highest < drawnCards.get(i).getValue()){
                highest = drawnCards.get(i).getValue();
            }
        }

        //TODO: Check if few players have the same card. Find player by the card value?
    }

    private void dealCards(){
        int index = 0;
        int playerCount = players.size();

        while (deck.isEmpty()){
            try {
                players.get(index).dealCard(deck.dealCard());
            }
            catch (DeckIsEmptyException e){
                System.out.println(e.getMessage());
            }
            index++;
            if(index > playerCount - 1) index = 0;
        }
    }
}