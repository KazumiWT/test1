import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Authentification {

    private JFrame frmAuthentification;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Authentification window = new Authentification();
                    window.frmAuthentification.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Authentification() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAuthentification = new JFrame();
        frmAuthentification.getContentPane().setBackground(SystemColor.info);
        frmAuthentification.setTitle("Authentification");
        frmAuthentification.setBounds(100, 100, 631, 496);
        frmAuthentification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAuthentification.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(326, 181, 151, 19);
        frmAuthentification.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nom d'utilisateur");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel.setBounds(148, 183, 135, 13);
        frmAuthentification.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Mot de passe");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1.setBounds(148, 227, 135, 13);
        frmAuthentification.getContentPane().add(lblNewLabel_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(328, 225, 149, 19);
        frmAuthentification.getContentPane().add(passwordField);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Se douvenir de mon mot e passe");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNewCheckBox.setBackground(SystemColor.info);
        chckbxNewCheckBox.setBounds(231, 275, 272, 21);
        frmAuthentification.getContentPane().add(chckbxNewCheckBox);

        JButton btnNewButton = new JButton("Connexion");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(231, 339, 166, 31);
        frmAuthentification.getContentPane().add(btnNewButton);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Watanabe\\Desktop\\Image20240920120048.png"));
        lblNewLabel_2.setBounds(269, 32, 128, 123);
        frmAuthentification.getContentPane().add(lblNewLabel_2);
    }
}
