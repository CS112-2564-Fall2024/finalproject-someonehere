package edu.miracosta.cs112.finalproject.finalproject;

public abstract class Character {
    private int movePixels;
    private int dash;
    protected int HP;

    /**
     * Create a Character from a subclass */
    protected Character() {
    }

    /** GETTERS
     *
     * @return how much that character moves
     */
    public int getMove () {
        return this.movePixels;
    }

    /**
     *
     * @return character using dash
     */
    public int getDash () {
        return this.dash;
    }

    /**
     *
     * @return character's HP
     */
    public int getHP () {
        return this.HP;
    }


    /** SETTERS
     *
     * @param movePixels
     */
    public void setMove (int movePixels) {
        this.movePixels = movePixels;
    }

    /**
     *
     * @param movePixels
     */
    public void setDash (int movePixels) {
        this.dash = movePixels * 2;
    }

    /**
     *
     * @param HP
     */
    public void setHP (int HP) {
        if (HP >= 0)
            this.HP = HP;
    }
}
