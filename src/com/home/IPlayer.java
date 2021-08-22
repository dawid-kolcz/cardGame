package com.home;

public interface IPlayer {
    ICard drawCard();
    void dealCard(ICard card);
    boolean hasMoreCards();
    String getName();
    void setName(String name);
}
