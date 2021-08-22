package com.home;

import java.util.Stack;

public class Player implements IPlayer{
    private final Stack<ICard> cards = new Stack<>();
    private final Stack<ICard> discardedCards = new Stack<>();
    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public ICard drawCard() {
        if (cards.isEmpty()) return null;
        return cards.pop();
    }

    @Override
    public void dealCard(ICard card) {
        cards.push(card);
    }

    @Override
    public boolean hasMoreCards() {
        return !cards.empty();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addDiscardedCard(ICard card) {
        discardedCards.add(card);
    }

    @Override
    public void useDiscardedCards() {
        if(cards.isEmpty()){
            for (ICard c: discardedCards) {
                cards.push(c);
            }
        }
    }
}
