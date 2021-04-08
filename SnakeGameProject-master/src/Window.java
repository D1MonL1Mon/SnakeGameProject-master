import javax.swing.*;
import java.io.IOException;

public class Window extends JFrame {

    public Window() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(368, 384);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }
}
