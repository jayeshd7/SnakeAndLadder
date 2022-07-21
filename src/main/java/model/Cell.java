package model;

import lombok.Getter;

public class Cell {

    @Getter
    private final int position;
    private Move move = new DefaultMove();

    public Cell(int position, Move move) {
        this.position = position;
        this.move = move;
    }

    public Cell(int position) {
        this.position = position;
    }

    public int nextPosition(){
        int nextPosition = move.getNextPosition();
        if(nextPosition == 0){
            return nextPosition;
        }
        return nextPosition;
    }
}
