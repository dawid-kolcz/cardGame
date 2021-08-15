package com.home;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDeck implements IDeck{
    Queue<Card> cards = new LinkedList<>();

    public QueueDeck(){
        for(int i = 0; i < 12; i++){
            for (int j = 0; j < 3; j++){
                cards.add(new Card(CardFace.values()[i], CardColor.values()[j]));
            }
        }
    }

    @Override
    public ICard drawCard() {
        return null;
    }

    @Override
    public void shuffleDeck() {

    }
}
