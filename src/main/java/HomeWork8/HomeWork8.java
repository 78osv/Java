package HomeWork8;

import HomeWork8.constant.Dot;
import HomeWork8.logic.Game;
import HomeWork8.player.Human;
import HomeWork8.player.PC;

import javax.swing.*;

public class HomeWork8 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Game(new Human(Dot.X.getDot()), new PC(Dot.O.getDot())));
    }
}
