package com.home;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game(new QueueDeckFactory());

        game.run();
    }
}
