package view;

import javax.swing.*;
import java.awt.*;

public class ShowPanel extends JPanel {

    private Color background;

    public ShowPanel() {

        super();
        background = new Color(38,38,38);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(background);
    }
}
