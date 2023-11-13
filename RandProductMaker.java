import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;


public class RandProductMaker {
    private JFrame window;
    private JTextField textFieldN = new JTextField("Enter the product you'd like to search: ", 35);
    private JTextArea textArea = new JTextArea();
    private JButton add = new JButton("Search");


    public RandProductMaker() {

    }


    public void initialize() {
        window = new JFrame();
        window.setTitle("Data Stream");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1440, 1000);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout(10, 5));
        window.setVisible(true);
    }

    public void createDisplayPanel() {
        JPanel displayPnl = new JPanel();
        displayPnl.setLayout(new GridLayout(3, 1));
        textFieldN.setFont(new Font("Arial", Font.BOLD, 25));
        add.setFont(new Font("Arial", Font.BOLD, 25));
        textArea.setFont(new Font("Arial", Font.BOLD, 25));
        displayPnl.add(textFieldN);
        displayPnl.add(add);
        displayPnl.add(textArea);
        add.addActionListener(((ActionEvent ae) -> add()));
        window.add(displayPnl, BorderLayout.NORTH);


    }


    public void add() {
        textArea.append("Name: Phone" + "\n" + "Description: Cell Phone \n ID: 000001");

    }
}







