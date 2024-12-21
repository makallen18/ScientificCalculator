//used Java calculator app video on Youtube from Bro Code

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calculator implements ActionListener 
{
   JFrame frame; 
   JTextField textfield;
   JButton[] numberButtons = new JButton[10];
   JButton[] functionButtons = new JButton[20];
   JButton addButton, subButton, multButton, divButton;
   JButton decButton, equButton, delButton, clrButton, negposButton;
   JButton logButton, factorialButton, cosButton, sinButton, tanButton; 
   JButton arccosButton, arcsinButton, arctanButton, percentButton, squrtButton, exponButton;
   JPanel panel;
   
   Font myFont = new Font("Ink Free", Font.BOLD, 20);
   double num1=0, num2=0, result=0;
   char operator; 
   
   public Calculator()
   {
      frame = new JFrame("Scientific Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(520, 700);
      frame.setLayout(null);
      
      textfield = new JTextField();
      textfield.setBounds(50, 25, 420, 50);
      textfield.setFont(myFont);
      textfield.setEditable(false);
      
      addButton = new JButton("+");
      subButton = new JButton("-");
      multButton = new JButton("*");
      divButton = new JButton("/");
      decButton = new JButton(".");
      equButton = new JButton("="); 
      delButton = new JButton("Del");
      clrButton = new JButton("Clr");
      logButton = new JButton("log");
      negposButton = new JButton("+/-");
      factorialButton = new JButton("!");
      cosButton = new JButton("cos");
      sinButton = new JButton("sin");
      tanButton = new JButton("tan");
      arccosButton = new JButton("arccos");
      arcsinButton = new JButton("arcsin");
      arctanButton = new JButton("arctan");      
      percentButton = new JButton("%");
      squrtButton = new JButton("√");
      exponButton = new JButton("^");    
      
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negposButton;
        functionButtons[9] = logButton;
        functionButtons[10] = factorialButton;
        functionButtons[11] = cosButton;
        functionButtons[12] = sinButton;
        functionButtons[13] = tanButton;
        functionButtons[14] = arccosButton;
        functionButtons[15] = arcsinButton;
        functionButtons[16] = arctanButton;
        functionButtons[17] = percentButton;
        functionButtons[18] = squrtButton;
        functionButtons[19] = exponButton;

   
     
      for(int i = 0; i<20; i++)
      {
      functionButtons[i].addActionListener(this);
      functionButtons[i].setFont(myFont);
      functionButtons[i].setFocusable(false);
      }
     

 
     for(int i = 0; i<10; i++)
      {
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      numberButtons[i].setFont(myFont);
      numberButtons[i].setFocusable(false);
      }
      
      negposButton.setBounds(50,500, 100, 50);
      delButton.setBounds(50, 550, 145, 50);
      clrButton.setBounds(190, 550, 145, 50);
      
      panel= new JPanel();
      panel.setBounds(50, 100, 470, 400);
      panel.setLayout(new GridLayout(8, 9, 10, 10));

     panel.add(numberButtons[1]);
     panel.add(numberButtons[2]);
     panel.add(numberButtons[3]);
     panel.add(addButton);
     panel.add(numberButtons[4]);
     panel.add(numberButtons[5]);
     panel.add(numberButtons[6]);
     panel.add(subButton);
     panel.add(numberButtons[7]);
     panel.add(numberButtons[8]);
     panel.add(numberButtons[9]);
     panel.add(multButton);
     panel.add(decButton);
     panel.add(numberButtons[0]);
     panel.add(equButton);
     panel.add(divButton);
     panel.add(logButton);
     panel.add(cosButton);
     panel.add(sinButton);
     panel.add(tanButton);
     panel.add(arccosButton);
     panel.add(arcsinButton);
     panel.add(arctanButton);
     panel.add(percentButton);
     panel.add(squrtButton);
     panel.add(exponButton);
     panel.add(factorialButton);     
     panel.add(negposButton);

     frame.add(panel);
     frame.add(delButton);
     frame.add(clrButton);
     frame.add(textfield);
     frame.setVisible(true);
    } 
      public static void main(String[] args)
      {
         Calculator calc = new Calculator();
    
      }
      @Override
      public void actionPerformed(ActionEvent e)
      {
         for(int i =0; i<10; i++)
         {
            if(e.getSource() == numberButtons[i])
            {
               textfield.setText(textfield.getText().concat(String.valueOf(i)));
            } 
         }
         if (e.getSource() == decButton)
         {
          textfield.setText(textfield.getText().concat("."));
         }
         //Operator Buttons
         if (e.getSource() == addButton) 
         {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == subButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == multButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
         if (e.getSource() == exponButton) 
        {
            num1 = Double.parseDouble(textfield.getText());
            operator = '^';
            textfield.setText("");
        }
       
       //equal button
        if (e.getSource() == equButton) 
        {
            num2 = Double.parseDouble(textfield.getText());
            switch (operator) 
            {
                case '+':
                    result = (num1+num2);
                    break;
                case '-':
                    result = (num1 - num2);
                    break;
                case '*':
                    result = (num1 * num2);
                    break;
                case '/':
                    result = (num1/num2);
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
          }
       
            //clear and delte button
          
        if (e.getSource() == clrButton) 
        {
            textfield.setText("");
        }
        if (e.getSource() == delButton) 
        {
         String string = textfield.getText();
         textfield.setText("");
            for (int i = 0; i < string.length() - 1; i++) 
            {
              textfield.setText(textfield.getText() + string.charAt(i));
             }
         }
         
         
        if (e.getSource() == negposButton) 
        {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }
        
        //trigonemotry buttons
        if (e.getSource() == cosButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            result = cosine(x);
            textfield.setText(String.valueOf(result));
        }
        if (e.getSource() == sinButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            result = sine(x);
            textfield.setText(String.valueOf(result));
        }

         if (e.getSource() == tanButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            result = tangent(x);
            textfield.setText(String.valueOf(result));
        }

      if (e.getSource() == arccosButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            if (x < -1 || x > 1) 
            {
               textfield.setText("ERROR.");
               return;
            }
            result = arccosine(x);
            textfield.setText(String.valueOf(result));
        }
        if (e.getSource() == arcsinButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            if (x < -1 || x > 1) 
            {
               textfield.setText("ERROR."); 
               return;
            }
            result = arcsine(x);
            textfield.setText(String.valueOf(result));
         }
         if (e.getSource() == arctanButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            result = arctangent(x);
            textfield.setText(String.valueOf(result));
        }
       
        if (e.getSource() == logButton) 
        {
            double x = Double.parseDouble(textfield.getText());
             if (x <= 0) 
            {
             textfield.setText("ERROR");
             return;
             }
            result = log(x);
            textfield.setText(String.valueOf(result));
        }
        //factorial use int
        //Java - parseInt() Method from tutorials points 
        //use a try catch: help from 
        if (e.getSource() == factorialButton) 
        {
            int x = Integer.parseInt(textfield.getText());
            result = factorial(x);
            textfield.setText(String.valueOf(result));
      }
       if (e.getSource() == percentButton) 
        {
            double x = Double.parseDouble(textfield.getText());
            result = (x / 100);
            textfield.setText(String.valueOf(result));
        }
        if (e.getSource() == squrtButton) 
        {
          double x = Double.parseDouble(textfield.getText());
         if (x < 0) 
         {
            textfield.setText("Error");
            return;
         }
    result = Math.sqrt(x);
    textfield.setText(String.valueOf(result));
         }
  }
    public static double add(double x, double y) 
    {
       
        return x + y;
    }

    public static double subtract(double x, double y) 
    {
        return x - y;
    }

    public static double multiply(double x, double y) 
    {
        return x * y;
    }
    //used oracle website: Class ArithmeticException
    //used article from Roll Bar: Throwing Exceptions in Java
    //Exceptions in Java from geeks for geeks

    public static double divide(double x, double y) 
    {
        if (y == 0) 
        {
            throw new ArithmeticException("ERROR! Cannot divide by 0");
        }
        return x / y;
    }
    public static double exponent(double x, double y)
    {
      return Math.pow(x, y);
    }
     
    //exception: can't do logarithm of zero or negative number
    public static double log(double x) //ln
    {
        if (x <= 0) 
        {
            throw new ArithmeticException("ERROR. Cannot calculate a lorgarithm less than or equal to 0");
        }
        return Math.log(x);
    }
   

        //Square root of a negative number will result in an error
    public static double squareRoot(double x) 
    {
        if (x < 0) 
        {
            throw new ArithmeticException("ERROR");
        }
        return Math.sqrt(x);
    }
    //Java Math tan() Method from w3schools
    public static double tangent(double x) 
    {
        return Math.tan(x);
    }

    public static double cosine(double x) 
    {
        return Math.cos(x);
    }
    public static double sine(double x) 
   {
    return Math.sin(x);
   }
   
   public static double arccosine(double x) 
   {
    if (x < -1 || x > 1) 
    {
        throw new ArithmeticException("ERROR.");
    }
    return Math.acos(x);
   }
   
   public static double arcsine(double x) 
   {
    if (x < -1 || x > 1) 
    {
        throw new ArithmeticException("ERROR.");
    }
    return Math.asin(x);
   }
   
   public static double arctangent(double x) 
   {
    return Math.atan(x);
   }
    
   public static double percentage(double x) 
   {
    return x / 100;
   }
 //used Geeks for Geeks
   public static int factorial(int x) 
   {
        if (x < 0) 
        {
            throw new ArithmeticException("ERROR");
        }
        int fact = 1;
        for (int i = 1; i <= x; i++) 
        {
            fact *= i;
        }
        return fact;
        
     }
    
    }
 