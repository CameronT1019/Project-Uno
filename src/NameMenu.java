import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameMenu extends JFrame implements ActionListener {

    JLabel nameLabel;
    JTextField nameTextField;
    JButton submitButton;
    JButton cancelButton;

    public NameMenu() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Name Menu");
        this.setLayout(null);
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        nameLabel = new JLabel();
        nameLabel.setText("Enter your name:");
        nameLabel.setBounds(50, (480/2)-75, 150, 20);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setForeground(Color.white);

        nameTextField = new JTextField();
        nameTextField.setBounds(195, (480/2)-75, 300, 25);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 16));

        submitButton = new JButton();
        submitButton.setText("SUBMIT");
        submitButton.setFocusPainted(false);
        submitButton.addActionListener(this);
        submitButton.setBounds((640/2)+25, (480/2)-25, 100, 25);
        submitButton.setBackground(Color.white);
        submitButton.setForeground(Color.black);

        cancelButton = new JButton();
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(this);
        cancelButton.setFocusPainted(false);
        cancelButton.setBounds((640/2)-125, (480/2)-25, 100, 25);
        cancelButton.setBackground(Color.white);
        cancelButton.setForeground(Color.black);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 500);
        panel.setLayout(null);
        panel.setBackground(Color.black);

        this.add(panel);
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(submitButton);
        panel.add(cancelButton);
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelButton) {
            this.dispose();
            new MainMenu();
        }

        if (e.getSource() == submitButton) {
            if (nameTextField.getText().equals("")) {
                new GameMenu("Player");
            } else {
                new GameMenu(nameTextField.getText());
            }
            this.dispose();
        }
    }
}
