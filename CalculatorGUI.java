package LearningProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// ADD, AC, EQUALS = WORKING
// TODO - FIX THE REST

// I didn't know we had to make a simple calculator so I started off with this one.
// Inspired by the Apple application: Calculator
// Wondering if perhaps I can get Extra Credit for this? Thank you.

/**
 * @author Jacob Dadoun
 * Project Type: Homework Extra Credit
 * Project Name: Apple Calculator
 * Version 1
 * Hours Worked: ~ 13.00
 */

public class CalculatorGUI extends JFrame{

    // Create the JTextField
    private JTextField display = new JTextField(20);
    private String displayText = "";

    // Create the ArrayList to store numbers to calculate
    private ArrayList<String> numsToCalculate = new ArrayList<>(2);


    // Create operators of Boolean type
    private boolean add = false;
    private boolean subtract = false;
    private boolean multiply = false;
    private boolean divide = false;
    // Used in ListenToEquals to solve numsToCalculate(0) with numsToCalculate(1)
    private String lastPerformedOperator = "";


    private CalculatorGUI(){

        // Create the JFrame
        setTitle("Calculator");
        super.setSize(300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create the JPanels for the display & buttons
        JPanel displayPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        // Set numsToCalculate elements to (0,0),(1,0)
        numsToCalculate.add(0,"0");
        numsToCalculate.add(1,"0");

        // Set the JTextField to non-editable
        display.setEditable(false);

        // Create the JButtons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bDivide = new JButton("%");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bMultiply = new JButton("x");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bSubtract = new JButton("-");
        JButton bDecimal = new JButton(".");
        JButton b0 = new JButton("0");
        JButton bAC = new JButton("AC");
        JButton bAdd = new JButton("+");
        JButton bEquals = new JButton("=");

        // Add the JTextField to the displayPanel (JPanel)
        displayPanel.add(display);

        // Set the layout for the buttonPanel (JPanel)
        buttonPanel.setLayout(new GridLayout(5,4));
        buttonPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        // Add the JButtons to the buttonPanel (JPanel)
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(bDivide);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(bMultiply);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bSubtract);
        buttonPanel.add(bDecimal);
        buttonPanel.add(b0);
        buttonPanel.add(bAC);
        buttonPanel.add(bAdd);
        buttonPanel.add(bEquals);

        // Place the JPanels in their respective locations
        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Registering the event handler: NUMBERS
        b1.addActionListener(new ListenToOne());
        b2.addActionListener(new ListenToTwo());
        b3.addActionListener(new ListenToThree());
        b4.addActionListener(new ListenToFour());
        b5.addActionListener(new ListenToFive());
        b6.addActionListener(new ListenToSix());
        b7.addActionListener(new ListenToSeven());
        b8.addActionListener(new ListenToEight());
        b9.addActionListener(new ListenToNine());
        b0.addActionListener(new ListenToZero());

        // Registering the event handler: OPERATORS
        bAdd.addActionListener(new ListenToAdd());
        bSubtract.addActionListener(new ListenToSubtract());
        bMultiply.addActionListener(new ListenToMultiply());
        bDivide.addActionListener(new ListenToDivide());
        bDecimal.addActionListener(new ListenToDecimal());
        bEquals.addActionListener((new ListenToEquals()));

        // Registering the event handler: CLEAR
        bAC.addActionListener(new ListenToAC());

        this.setVisible(true);
    }


    // ------------------------------------------------------
    // -------------- NUMBER ACTION LISTENERS ---------------
    // ------------------------------------------------------

    private class ListenToOne implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();

            // Get whats currently on the display
            displayText = display.getText();
            // Add 1 to whats currently on the display
            display.setText(displayText + "1");
            // Set the updated number to index 0 -----> maybe place inside the add method?
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToTwo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "2");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToThree implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "3");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToFour implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "4");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToFive implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "5");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToSix implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "6");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToSeven implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "7");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToEight implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "8");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToNine implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "9");
            numsToCalculate.set(1,display.getText());
        }
    }

    private class ListenToZero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            displayText = display.getText();
            display.setText(displayText + "0");
            numsToCalculate.set(1,display.getText());
        }
    }

    // ------------------------------------------------------
    // ------------- OPERATOR ACTION LISTENERS --------------
    // ------------------------------------------------------

    private class ListenToAdd implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lastPerformedOperator = "add";
            add = true;
            display.setText(calculate());
        }
    }

    private class ListenToSubtract implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lastPerformedOperator = "subtract";
            subtract = true;
            display.setText(calculate());
        }
    }

    private class ListenToMultiply implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lastPerformedOperator = "multiply";
            multiply = true;
            display.setText(calculate());
        }
    }

    private class ListenToDivide implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lastPerformedOperator = "divide";
            divide = true;
            display.setText(calculate());
        }
    }

    private class ListenToDecimal implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }
    }

    private class ListenToAC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkOperators();
            numsToCalculate.add(0,"0");
            numsToCalculate.add(1,"0");
        }
    }

    private class ListenToEquals implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(lastPerformedOperator.equals("add")){
                add = true;
                display.setText(calculate());
            }
            if(lastPerformedOperator.equals("subtract")){
                subtract = true;
                display.setText(calculate());
            }
            if(lastPerformedOperator.equals("multiply")){
                multiply = true;
                display.setText(calculate());
            }
            if(lastPerformedOperator.equals("divide")){
                divide = true;
                display.setText(calculate());
            }
            lastPerformedOperator = "";
        }
    }


    private String calculate(){
        String firstNum = numsToCalculate.get(0);
        String secondNum = numsToCalculate.get(1);
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int result = 0;

        System.out.println("Before calculation: " + numsToCalculate.get(0) + " " + numsToCalculate.get(1));

        if(add){
            result = num1 + num2;
        }
        if(subtract){
            result = num1 - num2;
        }
        if(multiply){
            result = num1 * num2;
        }
        if(divide){
            result = num1 / num2;
        }

        // Convert the result from Integer to String
        String resultAs_String = Integer.toString(result);

        // Set the result String in index 0 and set index 1 to "" for the new number
        numsToCalculate.set(0, resultAs_String);
        numsToCalculate.set(1,"0");

        System.out.println("After Calculation: " + numsToCalculate.get(0) + " " + numsToCalculate.get(1));

        // return the result string
        return resultAs_String;

    }


    private void checkOperators(){
        if(add || subtract || multiply || divide){
            display.setText("");

            add = false;
            subtract = false;
            multiply = false;
            divide = false;
        }
    }



    // ------------------------------------------------------
    // -------------------- MAIN METHOD ---------------------
    // ------------------------------------------------------

    public static void main(String[] args) {
        new CalculatorGUI();
    }


}
