package com.home;

public interface IDeck {
    ICard dealCard() throws DeckIsEmptyException;
    void shuffleDeck();
    boolean isEmpty();
}
