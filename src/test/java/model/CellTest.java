package model;

import exception.InvalidPositionException;
import org.junit.Assert;
import org.junit.Test;

public class CellTest {
    @Test
    public void testValidMove() throws InvalidPositionException {
        Cell cell = new Cell(12, new Snake(4));
        Snake move = new Snake(4);
//        Assert.assertEquals(move, cell.getMove());
    }

    @Test
    public void testGreenSnake() {
        Cell cell = new Cell(11, new Snake(1));
        Assert.assertEquals(1, cell.nextPosition());

    }
}
