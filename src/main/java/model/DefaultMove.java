package model;

import exception.InvalidPositionException;

public class DefaultMove extends Move{


    public DefaultMove() {
        super(0);
    }

    @Override
    boolean isValidPosition(int cellPosition) throws InvalidPositionException {
        return false;
    }
}
