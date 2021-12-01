import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColorMenu extends JFrame implements ActionListener {

    JButton redButton;
    JButton greenButton;
    JButton blueButton;
    JButton yellowButton;
    JLabel colorLabel;
    String colorChoice;
    GameMenu gameMenu;

    public ChangeColorMenu(GameMenu menu) {
        this.setTitle("Change Color");
        this.setLayout(null);
        this.setSize(420, 430);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        gameMenu = menu;

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 500);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        redButton = new JButton();
        redButton.setText("RED");
        redButton.setBounds(20-3, 100, 180, 130);
        redButton.setFocusPainted(false);
        redButton.setBackground(Color.RED);
        redButton.setOpaque(true);
        redButton.setBorderPainted(false);
        redButton.setForeground(Color.BLACK);
        redButton.setFont(new Font("Arial", Font.BOLD, 16));
        redButton.addActionListener(this);

        greenButton = new JButton();
        greenButton.setText("GREEN");
        greenButton.setBounds(210-3, 100, 180, 130);
        greenButton.setFocusPainted(false);
        greenButton.setBackground(Color.GREEN);
        greenButton.setOpaque(true);
        greenButton.setBorderPainted(false);
        greenButton.setForeground(Color.BLACK);
        greenButton.setFont(new Font("Arial", Font.BOLD, 16));
        greenButton.addActionListener(this);

        blueButton = new JButton();
        blueButton.setText("BLUE");
        blueButton.setBounds(20-3, 100+140, 180, 130);
        blueButton.setFocusPainted(false);
        blueButton.setBackground(Color.BLUE);
        blueButton.setForeground(Color.BLACK);
        blueButton.setOpaque(true);
        blueButton.setBorderPainted(false);
        blueButton.setFont(new Font("Arial", Font.BOLD, 16));
        blueButton.addActionListener(this);

        yellowButton = new JButton();
        yellowButton.setText("YELLOW");
        yellowButton.setBounds(210-3, 100+140, 180, 130);
        yellowButton.setFocusPainted(false);
        yellowButton.setBackground(Color.YELLOW);
        yellowButton.setForeground(Color.BLACK);
        yellowButton.setOpaque(true);
        yellowButton.setBorderPainted(false);
        yellowButton.setFont(new Font("Arial", Font.BOLD, 16));
        yellowButton.addActionListener(this);

        colorLabel = new JLabel();
        colorLabel.setText("Change Color");
        colorLabel.setForeground(Color.WHITE);
        colorLabel.setBounds(40, 15, 400, 50);
        colorLabel.setFont(new Font("Arial Black", Font.BOLD, 40));

        this.add(panel);
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);
        panel.add(yellowButton);
        panel.add(colorLabel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            colorChoice = "red";
        } else if (e.getSource() == blueButton) {
            colorChoice = "blue";
        } else if (e.getSource() == greenButton) {
            colorChoice = "green";
        } else if (e.getSource() == yellowButton) {
            colorChoice = "yellow";
        }
        gameMenu.callBack(colorChoice);
        this.dispose();
    }
}
