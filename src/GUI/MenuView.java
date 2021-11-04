import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class MenuView extends JFrame implements ActionListener {
    GridBagConstraints constraints = new GridBagConstraints();
    /**
     * The JFrame components and variables that are necessary for this class.
     */
    private JPanel menu = new JPanel();
    private JLabel theme;
    private JLabel names;
    private JTextField player_names;
    private JButton save;
    private JButton start;
    private JLabel player1;
    private JLabel player2;
    private JLabel player3;
    private JLabel player4;
    private JLabel player5;
    private JLabel player6;
    private JLabel player7;
    private JLabel player8;
    private JLabel player9;
    private JLabel player10;
    private JButton backButton;
    public ArrayList<String> playerIDs;

    public MenuView() {

        //Initial the variables to the initial state.
        playerIDs = new ArrayList<>();

        //Initial the JFrame Components.
        //menu = new JPanel();
        menu.setLayout(new GridBagLayout());
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.BOTH;
        theme = new JLabel("Please add the name of the player");
        /* theme.setFont(new Font("Times New Roman", Font.BOLD,30));
        theme.setBounds(250,100,600,50); */
        //addElement(theme, 0, 0);
        addElement(theme, 0,0);
        this.setContentPane(menu);
    }

    public static void main(String[] args) {
        JFrame frame = new MenuView();
        frame.setSize(1000, 1000);
        frame.setContentPane(new MenuView());
        frame.setVisible(true);
    }
    
    void addElement(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        menu.add(component, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
