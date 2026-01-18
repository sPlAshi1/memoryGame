package com.example.memory_game;

public class card {
    private int id;
    private int imageResId;
    private boolean isFaceUp;

    public card(int id, int imageResId) {
        this.id = id;
        this.imageResId = imageResId;
        this.isFaceUp = false;
    }
}
