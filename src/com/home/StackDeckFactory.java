package com.home;

public class StackDeckFactory implements IDeckFactory{

    @Override
    public IDeck createDeck() {
        return new StackDeck();
    }
}
