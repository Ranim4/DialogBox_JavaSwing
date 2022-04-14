package javaSwing.DidYouKnowApp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Fenetre2 extends JFrame {
    private final JLabel titleLabel;
    private final JLabel factLabel;
    private final JPanel contentPane;
    // TODO conteneur de type JPanel
    private JPanel conteneur = new JPanel();
    // TODO Ajouter un bouton dans la feêtre
    private final JButton button;
    //= new JButton("Mon bouton");
    private JTextArea textArea;

    // TODO Constructeur de la fenêtre 2
    public Fenetre2(String title){
        // TODO Mettre un titre
        setTitle(title);

        Color greenColor = Color.decode("#51b46d");
        contentPane = new JPanel(new BorderLayout());
        Border padding = BorderFactory.createEmptyBorder(25, 25, 25, 25);
        contentPane.setBorder(padding);
        setContentPane(contentPane);
        contentPane.setBackground(greenColor);

        titleLabel = new JLabel("Le saviez-vous ?");
        add(titleLabel, BorderLayout.NORTH);
        titleLabel.setForeground(new Color(255, 255, 255, 128));

        factLabel = new JLabel("10 000 enseignants changent de métier chaque année;");
        add(factLabel, BorderLayout.CENTER);
        factLabel.setForeground(Color.WHITE);

        button = new JButton("Montrer un autre fait".toUpperCase());
        add(button, BorderLayout.SOUTH);
        button.setForeground(greenColor);
        button.setMargin(new Insets(12, 12, 12, 12));
        button.setFocusPainted(false);
        button.setBackground(Color.WHITE);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String fact = RandomFacts.getRandomFacts();
                factLabel.setText(fact);

                Color color = ColorPalette.getRandomColor();
                contentPane.setBackground(color);
                button.setForeground(color);
            }
        });
        List<Image> icons = new ArrayList<>();
        ImageIcon icon16 = new ImageIcon(getClass().getResource("/Ressource/icon16x16.png"));
        ImageIcon icon32 = new ImageIcon(getClass().getResource("/Ressource/icon32x32.png"));
        ImageIcon icon64 = new ImageIcon(getClass().getResource("/Ressource/icon64x64.png"));
        ImageIcon icon128 = new ImageIcon(getClass().getResource("/Ressource/icon128x128.png"));
        icons.add(icon16.getImage());
        icons.add(icon32.getImage());
        icons.add(icon64.getImage());
        icons.add(icon128.getImage());
        setIconImages(icons);

        Font font = new Font("Comic sans ms", Font.PLAIN, 19);
        titleLabel.setFont(font);
        factLabel.setFont(font);
        button.setFont(font.deriveFont(Font.BOLD, 15));

        // TODO Modifier la taille
        setSize(600, 600);
        // TODO non modifiable par l'utilisateur
        setResizable(false);
        // TODO Un click sur croix entraine fermeture de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO centrer la fenêtre par rapport à l'écran de l'ordinateur
        setLocationRelativeTo(null);
        setVisible(true);
        // TODO ajout bouton sur le conteneur
    }

}
