
package hw03;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import javax.swing.*;
//********************************************************************
//Javin Towers
//CS-185 
//Section 2
//H01.java       
//Demonstrates the use of an array of objects.
//
//********************************************************************

public class H03 {
    //-----------------------------------------------------------------
    //  Creates a Computer Collection object and adds some comps to it. Prints
    //  reports on the status of the collection.
    //-----------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Display File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        JPanel panel2 = new JPanel();

        JPanel primary = new JPanel();

        JTextArea ta1 = new JTextArea(200, 50);

        JTextArea ta2 = new JTextArea(200, 50);

        ta1.setEditable(true);

        ///////////////////////////////////////////////
        //////////////////// Color ////////////////////
        ///////////////////////////////////////////////
        ta1.setBackground(new Color(134,255,122));
        ta2.setBackground(new Color(134,155,252));
        
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.green);
        
        JLabel first= new JLabel("Table 1");
        JLabel second= new JLabel("Table 2");
        



        ComputerCollection allComputers = new ComputerCollection(); //Create collection

        Scanner fileScan = new Scanner(new File("input.text"));
        String macBook;
        String type;
        String stats1;
        String stats2;
        String stats3;
        double cost;

        while (fileScan.hasNext()) { // beginning of while loop
            macBook = fileScan.next();
            type = fileScan.next();
            stats1 = fileScan.next();
            stats2 = fileScan.next();
            stats3 = fileScan.next();
            cost = fileScan.nextDouble();
            COMP obj = new COMP(macBook, type, stats1, stats2, stats3, cost);
            allComputers.addComp(obj);


            //  **** add your element to the collection here!!  Only one add statement needed as it is in a loop ****

        } // end of while loop


        fileScan.close();
        allComputers.Sort();//new
        
        String info = allComputers.toString();


        ta1.setText(info);

        //  ... code to fill in info
        //double oldcost = movies.updateCost("the matrix",22.95)//new
        String info2 = allComputers.toString();
        //info2+="\n\nHere is the oldcost: " + oldcost;//new
        ta2.setText(info);
        ta2.setText(info2);

      
        JScrollPane sp1 = new JScrollPane(ta1);

        JScrollPane sp2 = new JScrollPane(ta2);
        
        panel1.setPreferredSize(new Dimension(600, 525));// for jLabel
        panel2.setPreferredSize(new Dimension(600, 525));// for jLabel

        sp1.setPreferredSize(new Dimension(600, 500));

        sp2.setPreferredSize(new Dimension(600, 500));
        
        

        panel1.add(sp1);

        panel2.add(sp2);
        
        panel1.add(first);// for jLabel
        panel2.add(second);// for jLabel


        primary.add(panel1);

        primary.add(panel2);


        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    } 
}