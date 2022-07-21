import exception.GameOverException;
import exception.InvalidPlayerException;
import lombok.Getter;
import lombok.Setter;
import model.Board;
import model.Player;
import stragtegy.Dice;


import java.util.*;

public class Game {
    private final Board board;

    @Setter
    private Dice dice;

    @Getter @Setter
    private final Map<Integer, Player> res;
    private int winnerCount;

    @Getter @Setter
    private final Queue<Player> playerQueue;

    public Game(List<Player> playerList, Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.res = new HashMap<>();
        this.playerQueue = new ArrayDeque<>(playerList);
    }

    public Player getNextPlayerToPlay() throws GameOverException {
        if (playerQueue.size() <= 1)
            throw new GameOverException("Game is already over");
        return playerQueue.poll();
    }

    public void play(Player player) throws InvalidPlayerException {
        if (!checkReachToEnd(player)) {
            int nextPosition = board.moveToNextPosition(player.getPosition(), dice.rollDice());
            player.setPosition(nextPosition);
            updateGameStatus(player);
        } else throw new InvalidPlayerException("player already reach end of game");
    }

    private void updateGameStatus(Player player) {
        if (checkReachToEnd(player)) {
            res.put(++winnerCount, player);
            if (playerQueue.size() == 1) {
                res.put(++winnerCount, playerQueue.poll());
            }
        } else playerQueue.add(player);
    }

    private void declareResult(Map<Integer, Player> res) {
        res.forEach((k, v) -> System.out.println(v + " ranks " + k));
    }

    private boolean checkReachToEnd(Player player) {
        return player.getPosition() == 100;
    }
}
