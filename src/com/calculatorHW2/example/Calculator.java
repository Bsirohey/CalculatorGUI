package com.calculatorHW2.example;

import com.sun.org.apache.xpath.internal.operations.Operation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;
import java.lang.Math;

public class Calculator<bool> {
    private JTextField results;
    private JPanel app;
    private JButton percent;
    private JButton ClearEntry;
    private JButton btn7;
    private JButton btn4;
    private JButton sign;
    private JButton btn1;
    private JButton sqrt;
    private JButton square;
    private JButton reciprocal;
    private JButton Clear;
    private JButton back;
    private JButton div;
    private JButton btn8;
    private JButton btn9;
    private JButton mul;
    private JButton btn5;
    private JButton btn6;
    private JButton minus;
    private JButton btn2;
    private JButton btn3;
    private JButton add;
    private JButton btn0;
    private JButton decimal;
    private JButton equal;

    private double leftOperand =0.0;
    private double rightOperand =0.0;
    private String op1;
    private String op2;
    boolean oped = false;
    boolean eqPress = false;


    private Operation Calculations;


    public Calculator(){

        //numbers
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 0;
                        results.setText("0");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "0");
                        results.setText(results.getText() + "0");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 0;
                        results.setText("0");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "0");
                        results.setText(results.getText() + "0");

                    }


                }
            }

        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 1;
                        results.setText("1");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "1");
                        results.setText(results.getText() + "1");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 1;
                        results.setText("1");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "1");
                        results.setText(results.getText() + "1");

                    }


                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 2;
                        results.setText("2");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "2");
                        results.setText(results.getText() + "2");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 2;
                        results.setText("2");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "2");
                        results.setText(results.getText() + "2");

                    }


                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 3;
                        results.setText("3");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "3");
                        results.setText(results.getText() + "3");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 3;
                        results.setText("3");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "3");
                        results.setText(results.getText() + "3");

                    }


                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 4;
                        results.setText("4");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "4");
                        results.setText(results.getText() + "4");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 4;
                        results.setText("4");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "4");
                        results.setText(results.getText() + "4");

                    }


                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 5;
                        results.setText("5");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "5");
                        results.setText(results.getText() + "5");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 5;
                        results.setText("5");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "5");
                        results.setText(results.getText() + "5");

                    }


                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 6;
                        results.setText("6");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "6");
                        results.setText(results.getText() + "6");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 6;
                        results.setText("6");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "6");
                        results.setText(results.getText() + "6");

                    }


                }
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 7;
                        results.setText("7");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "7");
                        results.setText(results.getText() + "7");

                    }
                }
                else {
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 7;
                        results.setText("7");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "7");
                        results.setText(results.getText() + "7");

                    }


                }
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 8;
                        results.setText("8");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "8");
                        results.setText(results.getText() + "8");

                    }
                }
                else{
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 8;
                        results.setText("8");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "8");
                        results.setText(results.getText() + "8");

                    }


                }
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(oped == true) {
                    if (rightOperand == 0 || rightOperand == 0.0) {
                        rightOperand = 9;
                        results.setText("9");
                    } else {
                        rightOperand = Double.valueOf(results.getText() + "9");
                        results.setText(results.getText() + "9");

                    }
                }
                else{
                    if(eqPress == true){
                        eqPress = false;
                        results.setText("");
                    }
                    if(leftOperand==0 || leftOperand ==0.0){
                        leftOperand = 9;
                        results.setText("9");

                    }
                    else{
                        leftOperand = Double.valueOf(results.getText() + "9");
                        results.setText(results.getText() + "9");

                    }


                }
            }
        });


       //operations
       equal.addActionListener(new EqualBtnClicked());
       ClearEntry.addActionListener(new ceBtnClicked());
       Clear.addActionListener(new ClearBtnClicked());
       back.addActionListener(new BackBtnClicked());
       decimal.addActionListener(new DecimalBtnClicked());
       sign.addActionListener(new SignBtnClicked());
       sqrt.addActionListener(new squareRootBtnClicked());
       add.addActionListener(new addBtnClicked());
       minus.addActionListener(new minusBtnClicked());
       mul.addActionListener(new mulBtnClicked());
       div.addActionListener(new divBtnClicked());
       percent.addActionListener(new percentBtnClicked());
       square.addActionListener(new squaringBtnClicked());
       reciprocal.addActionListener(new ReciprocalBtnClicked());

    }


    private class addBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            op1 = "+";
            results.setText("");
            oped = true;
        }
    }

    private class minusBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            op1 = "-";
            results.setText("");
            oped = true;
        }
    }

    private class mulBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            op1 = "x";
            results.setText("");
            oped = true;
        }
    }

    private class divBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            op1 = "/";
            results.setText("");
            oped = true;
        }
    }

    private class percentBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            op2 = "%";
            results.setText("");
            oped = true;
        }
    }

    private class SignBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
           String output = results.getText();
           int n = output.length();
           char x = output.charAt(0);
           if(x == '-'){
               output = output.substring(1);
               results.setText(output);
           }
           else{
               results.setText("-" + output);
           }

        }
    }

    private class DecimalBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String s = results.getText();
            if(s.contains(".")== true){
                results.setText(results.getText());
            }
            else{
                results.setText(s+ '.');
            }
        }
    }

    private class BackBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String s = results.getText();
            if(s.isEmpty() == false){
                s = s.substring(0, s.length() - 1);
                results.setText(s);
            }
        }
    }

    private class ClearBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            results.setText("");
            leftOperand=0.0;
            rightOperand= 0.0;
            op1= null;
            op2 =null;
            oped= false;
        }
    }

    private class ceBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            results.setText("");
            leftOperand=0.0;
            rightOperand= 0.0;
            op1= null;
            op2 =null;
            oped= false;

        }
    }

    private class squareRootBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Double output = Double.valueOf(results.getText());
            output = Math.sqrt(output);
            if (leftOperand== 0.0){
                leftOperand = output;
            }
            else{
                rightOperand =output;
            }
            results.setText(output.toString());



        }
    }

    private class squaringBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Double output = Double.valueOf(results.getText());
            output = output*output;
            if (leftOperand== 0.0){
                leftOperand = output;
            }
            else{
                rightOperand =output;
            }
            results.setText(output.toString());
        }
    }

    private class ReciprocalBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Double output = Double.valueOf(results.getText());
            output = 1/output;
            if (leftOperand== 0.0){
                leftOperand = output;
            }
            else{
                rightOperand =output;
            }
            results.setText(output.toString());
        }
    }

    private class EqualBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            double output= 0 ;
            if(oped == true && op2 == "%"){
                if(op1=="+"){
                    output=leftOperand+((rightOperand/100)*leftOperand);
                }
                if(op1=="-"){
                    output=leftOperand-((rightOperand/100)*leftOperand);
                }
                if(op1=="x"){
                    output=leftOperand*((rightOperand/100)*leftOperand);
                }
                if(op1=="/"){
                    output=leftOperand/((rightOperand/100)*leftOperand);
                }
            }
            else if(op1=="+"){
                output= leftOperand+rightOperand;
            }
            else if(op1 == "-"){
                output = leftOperand-rightOperand;
            }
            else if(op1 == "x"){
                output = leftOperand*rightOperand;
            }
            else if(op1 == "/"){
                output = leftOperand/rightOperand;
            }

            results.setText(String.valueOf(output));
            leftOperand = output;
            rightOperand =0;
            oped = false;
            op2 = " ";
            eqPress = true;


        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().app);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
