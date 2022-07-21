package model;

import exception.InvalidPositionException;
import lombok.Getter;

public abstract class Move {
    @Getter
    protected int nextPosition;

    public Move(int nextPosition) {
        this.nextPosition = nextPosition;
    }

    abstract boolean isValidPosition(int nextPosition) throws InvalidPositionException;
}
