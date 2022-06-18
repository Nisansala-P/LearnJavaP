package com;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class GUICal implements ActionListener{
	    private JPanel panel;
	    private JFrame frame;
	    private JButton jb1, jb2,jb3,jb4,jb5;
	    private JTextField jt1, jt2, jt3;
	    private JLabel lb1,lb2,lb3;
	    
	  //*** initializing Components
	    public GUICal() {
	        this.frame = new JFrame("Calculator");
	        this.panel = new JPanel();
	        this.jb1 = new JButton("+"); //*** the button which add first number to second number
	        this.jb2 = new JButton("-"); //*** the button which minus second number from first number
	        this.jb3= new JButton("/"); //*** the button which divide first number to second number
	        this.jb4 = new JButton("*");
	        this.jb5 = new JButton("Clear");
	        this.jt1 = new JTextField(); //*** to show input
	        this.jt2 = new JTextField(); //*** to show input
	        this.jt3 = new JTextField(); //*** to show output
	        this.lb1= new JLabel("First Number: ");
	        this.lb2= new JLabel("Second Number: ");
	        this.lb3= new JLabel("Results: ");
	    }

	    
	    public void draw() {
	        jt1.setBounds(250,50,200,25);
	        jt2.setBounds(250,100,200,25);
	        jt3.setBounds(250,150,200,25);
	        jt3.setEditable(false); //*** U can't change the value of this field
	        
	        
	        //*** adding text fields to "panel"
	      
	        panel.add(jt1);
	        panel.add(jt2);
	        panel.add(jt3);
	        panel.add(lb1);
	        
	        lb1.setBounds(100, 50, 200, 25);
	        lb2.setBounds(100, 100, 200, 25);
	        lb3.setBounds(100, 150, 200, 25);
	        lb1.addKeyListener(null);
	        
	        panel.add(lb1);
	        panel.add(lb2);
	        panel.add(lb3);
	        
	        jb1.setBounds(100, 200, 90, 50);
	        jb2.setBounds(210, 200, 90, 50);
	        jb3.setBounds(320, 200, 90, 50);
	        jb4.setBounds(430, 200, 90, 50);
	        jb5.setBounds(300, 260, 90, 50);
	        //*** when U implement the ActionListener(header of Ur class), U have to add ActionListener to Ur buttons like below commands
	        jb1.addActionListener(this); //*** do NOT forget it
	        jb2.addActionListener(this); //*** do NOT forget it
	        jb3.addActionListener(this);
	        jb4.addActionListener(this);
	        jb4.addActionListener(this);
	        //*** adding buttons to "panel"
	        panel.add(jb1);
	        panel.add(jb2);
	        panel.add(jb3);
	        panel.add(jb4);
	        panel.add(jb5);

	        //*** doing everthing by Urself not by layout manager
	        panel.setLayout(null); //*** do NOT forget it
	        frame.setBounds(700, 300, 600,600);
	        //*** adding "panel" to "frame"
	        frame.add(panel);
	        frame.setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      //  double firstNum = Integer.parseInt(jt1.getText());
	        double firstNum = Double.parseDouble(jt1.getText());
	        double secondNum = Double.parseDouble(jt2.getText());
	       
	        
	        
	        double result = 0;
	        Logic logic = new Logic();
	        if (e.getSource() == jb1) //*** +
	            result = logic.sum(firstNum,secondNum);
	        if (e.getSource() == jb2) //*** -
	            result = logic.sub(firstNum,secondNum);
	        if (e.getSource() == jb3) //*** /
	            result = logic.div(firstNum,secondNum);
	        if (e.getSource() == jb4) //*** *
	            result = logic.mult(firstNum,secondNum);
	        

	        jt3.setText(String.valueOf(result)); //*** showing the result
	        
	        
	    }
	
	}

