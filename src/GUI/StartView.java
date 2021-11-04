
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartView extends JPanel implements ActionListener {
    GridBagConstraints constraints = new GridBagConstraints();

    private ImageIcon uno_image;
    private JButton quit;
    private JButton playWithFriends;
    private JLabel label1;
    static JFrame f = new JFrame("UNO");
    JFrame frame1;

    public StartView() {
        setLayout(new GridBagLayout());
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        int x, y;

        // UNO IMAGE
        uno_image = new ImageIcon("./UnoCardImages/UnoCard.png");
        constraints.weightx = 1.0;
        constraints.gridheight = 3; // span two rows
        constraints.gridwidth = 2; // span two columns
        addElement(new JLabel(uno_image), x = 0, y = 0);

        constraints.gridheight = 1; // set row width back to one
        constraints.gridwidth = 1; // set column width back to one

        // PLAY WITH FRIENDS BUTTON
        constraints.weightx = 0.5; // make this half the size of the uno image size
        constraints.anchor = GridBagConstraints.CENTER; // center of space
        constraints.insets = new Insets(50, 50, 50, 50); // all around padding of 100 pixels 
        //addElement(new JButton("Play with Friends"), x = 3, y = 0);
        playWithFriends = new JButton("Play with Friends");
        playWithFriends.addActionListener(this);
        addElement(playWithFriends, 3, 0);

        // PLAY WITH BOTS BUTTON
        addElement(new JButton("Play with Bots"), x = 3, y = 1);

        // QUIT BUTTON
        //addElement(new JButton("Quit"), x = 3, y = 2);
        quit = new JButton("Quit");
        quit.addActionListener(this);
        addElement(quit, 3, 2);

    }

    void addElement(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        add(component, constraints);
    }

    public static void main(String[] args) {
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(1000, 1000);
        f.setLocation(1000, 1000);
        f.setContentPane(new StartView());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit) {
            //Directly quit the game.
            System.exit(0);
        } else if (e.getSource() == playWithFriends) {
            //Jumps to the next JFrame.
            frame1 = new MenuView();
            frame1.setSize(1000,1000);
            frame1.setVisible(true);
            // TODO FIGURE OUT WHY THIS AUTOMATICALLY CLOSES THE NEXT JFRAME
            //this.dispose();
          }
    }



    
}
