package com.home;

import java.util.Collections;
import java.util.Stack;

public class StackDeck implements IDeck{
    private final Stack<ICard> deck = new Stack<>();

    public StackDeck(){
        generateDeck();
    }

    private void generateDeck(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++) {
                deck.push(new Card(CardFace.values()[j], CardColor.values()[i]));
            }
        }
    }

    @Override
    public ICard dealCard() throws DeckIsEmptyException {
        if(deck.isEmpty()) throw new DeckIsEmptyException();
        return deck.pop();
    }

    @Override
    public void shuffleDeck() {
        if(deck.isEmpty()){
            generateDeck();
        }
        Collections.shuffle(deck);
    }

    @Override
    public boolean isEmpty(){
        return deck.isEmpty();
    }
}
