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


public class RandProductSearch {
    private JFrame window;
    private JTextField textFieldN = new JTextField("Enter the name: ", 35);
    ;

    private JTextField textFieldD = new JTextField("Enter a description: ", 75);
    ;

    private JTextField textFieldI = new JTextField("Enter the ID: ", 6);
    private JTextField textFieldR = new JTextField("Record Count: ", 6);
    private JButton add = new JButton("Add");


    public RandProductSearch() {

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
        displayPnl.setLayout(new GridLayout(5, 1));
        textFieldN.setFont(new Font("Arial", Font.BOLD, 25));
        textFieldD.setFont(new Font("Arial", Font.BOLD, 25));
        textFieldI.setFont(new Font("Arial", Font.BOLD, 25));
        add.setFont(new Font("Arial", Font.BOLD, 25));
        textFieldR.setFont(new Font("Arial", Font.BOLD, 25));
        displayPnl.add(textFieldN);
        displayPnl.add(textFieldD);
        displayPnl.add(textFieldI);
        displayPnl.add(textFieldR);
        displayPnl.add(add);
        add.addActionListener(((ActionEvent ae) -> add()));
        window.add(displayPnl, BorderLayout.NORTH);


    }


    public void add() {

        ArrayList<String> products = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\ProductTestData.txt");

        Boolean done = false;
        String productRec = "";



        products.add("Phone");
        products.add("Cell Phone");
        products.add("000001");

        for( String p: products)
            System.out.println(p);

        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            for(String rec: products)
            {
                writer.write(rec, 0, rec.length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        textFieldN.setText("Enter the name: ");
        textFieldD.setText("Enter a description: ");
        textFieldI.setText("Enter the ID: ");

    }
}
