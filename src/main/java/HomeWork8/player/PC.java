package HomeWork8.player;

import HomeWork8.constant.Dot;
import HomeWork8.logic.Game;

import javax.swing.*;
import java.util.Random;

public class PC extends Player {

    public PC(String dot) {
        super(dot);
    }

    @Override
    public void turn(JButton btn) {
        btn.setText(dot);
    }

    private JButton randomAI() {
        int row;
        int col;
        Random random = new Random();
        return null;
    }
}
