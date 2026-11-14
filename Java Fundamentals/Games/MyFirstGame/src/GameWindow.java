import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow() {

        setTitle("My First Java Game");
        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        add(new GamePanel());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}