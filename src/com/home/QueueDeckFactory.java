package com.home;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDeckFactory implements IDeckFactory{

    @Override
    public IDeck createDeck() {
        return new QueueDeck();
    }
}
