package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    JButton okButton;

    About() {
        setBounds(600, 200, 700, 600);
        setLayout(null);
        
         getContentPane().setBackground(new Color(220, 245, 245)); 


        // Header image
        ImageIcon headerIcon = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image headerImage = headerIcon.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon scaledHeaderIcon = new ImageIcon(headerImage);
        JLabel headerLabel = new JLabel(scaledHeaderIcon);
        headerLabel.setBounds(150, 40, 400, 80);
        add(headerLabel);

        // Notepad icon
        ImageIcon notepadIcon = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image notepadImage = notepadIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon scaledNotepadIcon = new ImageIcon(notepadImage);
        JLabel notepadLabel = new JLabel(scaledNotepadIcon);
        notepadLabel.setBounds(50, 180, 70, 70);
        add(notepadLabel);

        // About text
        String aboutContent = "<html>"
                + "<h2>About Notepad</h2>"
                + "Developer: <b>H.H.M.Kaushalya Rasanjali Herath</b><br>"
                + "Version: 1.0 (2024)<br><br>"
                + "<h3>Features</h3>"
                + "- Create, open, and save text files<br>"
                + "- Copy, cut, paste, and select all text<br>"
                + "- Print documents<br><br>"
                + "<h3>Description</h3>"
                + "Notepad is a lightweight text editor built using Java and Swing.<br>"
                + "It provides essential functionalities for text editing and file handling.<br><br>"
                + "<h3>License</h3>"
                + "This application is free to use and modify.<br>"
                + "For any inquiries, contact: <b>rasanjaliherath899@gmail.com</b>"
                + "</html>";

        JLabel aboutLabel = new JLabel(aboutContent);
        aboutLabel.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));

        // Add scrolling pane
        JScrollPane scrollPane = new JScrollPane(aboutLabel);
        scrollPane.setBounds(150, 130, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane);

        // OK Button
        okButton = new JButton("OK");
        okButton.setBounds(580, 500, 80, 25);
        okButton.addActionListener(this);
        add(okButton);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
