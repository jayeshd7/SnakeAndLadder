package model;

import exception.InvalidPositionException;

public class Snake extends Move{
    private boolean canMove = true;

    public Snake(int nextPosition) {
        super(nextPosition);
    }

    @Override
    public boolean isValidPosition(int cellPosition) throws InvalidPositionException {
        if(cellPosition > nextPosition){
            return true;
        }
        else throw new InvalidPositionException("cell postion always greater than snake");
    }

    @Override
    public int getNextPosition() {
        int next = nextPosition;
        if (canMove) {
            nextPosition = 0;
            canMove = false;
        }
        return next;
    }
}
