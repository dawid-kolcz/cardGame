package com.home;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();
        Card card = new Card(CardFace.Five, CardColor.Club);
        game.run();

        System.out.println(card.printCard());
    }
}
