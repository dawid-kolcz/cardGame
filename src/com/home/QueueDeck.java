package com.home;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDeck implements IDeck {
    private final Queue<Card> deck = new LinkedList<>();

    public QueueDeck() {

    }

    private void generateDeck() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                deck.add(new Card(CardFace.values()[i], CardColor.values()[j]));
            }
        }
    }

    @Override
    public ICard dealCard() throws DeckIsEmptyException {
        if (deck.isEmpty()) throw new DeckIsEmptyException("[Error] Deck is empty.");
        return deck.remove();
    }

    @Override
    public void shuffleDeck() {
        // TODO: Shuffling deck
    }

    @Override
    public boolean isEmpty() {
        return deck.isEmpty();
    }
}
