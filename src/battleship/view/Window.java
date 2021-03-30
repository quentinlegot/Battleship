package battleship.view;

import battleship.model.Game;
import battleship.model.player.Player;

import javax.swing.*;

public class Window extends View {

    private JFrame frame;

    public Window(Game game) {
        super(game);
        this.frame = new JFrame("Battleship");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void setShips(Player player) {

    }

    @Override
    public void displayBoard() {

    }
}
