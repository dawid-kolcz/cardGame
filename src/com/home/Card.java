package com.home;

import java.util.Objects;

public class Card implements Comparable<Card>, ICard{
    private CardFace face;
    private CardColor color;

    public Card(CardFace face, CardColor color) {
        this.face = face;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return face == card.face && color == card.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, color);
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.face.getValue(), o.face.getValue());
    }

    @Override
    public String printCard() {
        String card = face.getValue() < 11 ? String.valueOf(face.getValue()) : face.name().substring(0, 1);

        switch (color){
            case Club:
                card += '\u2663';
                break;
            case Heart:
                card += '\u2665';
                break;
            case Spade:
                card += '\u2660';
                break;
            case Diamond:
                card += '\u2666';
                break;
        }
        return card;
    }

    @Override
    public int getValue() {
        return face.getValue();
    }
}
