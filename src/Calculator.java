
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class  Calculator implements ActionListener{
	int choice;
   String oldvalue;
	Boolean isOperatorclicked=true;
	JLabel  display;
	JButton buttondivision;
	JButton buttonzero;
	JButton buttonmultiplication;
	JButton buttondot;
	JButton buttonaddition;
	JButton buttonequalto;
	JButton buttonmines;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonclear;
	public Calculator() {
		JFrame jf =new JFrame("Calculator");
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setLocation(300,30);
		//
	    display=new JLabel();
		display.setBounds(30,50,330,40);
		display.setBackground(Color.WHITE);
		display.setOpaque(true);
		display.setForeground(Color.GRAY);
		display.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));;
		display.setHorizontalAlignment(SwingConstants.RIGHT );
		jf.add(display);
		//7
		 button7=new  JButton("7");
		button7.setBounds(30, 110, 50,50 );
		button7.setBackground(Color.WHITE);
     	jf.add(button7);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button7.setFont(new Font("Arial", 25, 25));
		button7.addActionListener(this);
		//8
	 button8=new  JButton("8");
		button8.setBounds(90, 110, 50,50 );
		button8.setBackground(Color.WHITE);
     	jf.add(button8);
    	button8.setFont(new Font("Arial", 25, 25));
    	button8.addActionListener(this);
     	//9
     	button9=new  JButton("9");
		button9.setBounds(150, 110, 50,50 );
		button9.setBackground(Color.WHITE);
     	jf.add(button9);
    	button9.setFont(new Font("Arial", 25, 25));
    	button9.addActionListener(this);
     	//4
     	 button4=new  JButton("4");
		button4.setBounds(30, 170, 50,50 );
		button4.setBackground(Color.WHITE);
     	jf.add(button4);
    	button4.setFont(new Font("Arial", 25, 25));
    	button4.addActionListener(this);
     	//5
      button5=new  JButton("5");
		button5.setBounds(90, 170, 50,50 );
		button5.setBackground(Color.WHITE);
     	jf.add(button5);
    	button5.setFont(new Font("Arial", 25, 25));
    	button5.addActionListener(this);
     	//6
      button6=new  JButton("6");
		button6.setBounds(150, 170, 50,50 );
		button6.setBackground(Color.WHITE);
     	jf.add(button6);
    	button6.setFont(new Font("Arial", 25, 25));
    	button6.addActionListener(this);
    	//1
     	 button1=new  JButton("1");
		button1.setBounds(30, 230, 50,50 );
		button1.setBackground(Color.WHITE);
     	jf.add(button1);
    	button1.setFont(new Font("Arial", 25, 25));
    	button1.addActionListener(this);
     	//2
      button2=new  JButton("2");
		button2.setBounds(90, 230, 50,50 );
		button2.setBackground(Color.WHITE);
     	jf.add(button2);
    	button2.setFont(new Font("Arial", 25, 25));
    	button2.addActionListener(this);
    	
    	
    
    	
    	
    
     	//3
     	 button3=new  JButton("3");
		button3.setBounds(150, 230, 50,50 );
		button3.setBackground(Color.WHITE);
     	jf.add(button3);
    	button3.setFont(new Font("Arial", 25, 25));
    	button3.addActionListener(this);
    
	
    	//+
     	 buttonaddition=new  JButton("+");
		buttonaddition.setBounds(210, 170, 50,50 );
		buttonaddition.setBackground(Color.WHITE);
     	jf.add(buttonaddition);
    	buttonaddition.setFont(new Font("Arial", 25, 25));
    	buttonaddition.addActionListener(this);
     	//=
     	buttonequalto=new  JButton("=");
		buttonequalto.setBounds(150, 290, 50,50 );
		buttonequalto.setBackground(Color.WHITE);
     	jf.add(buttonequalto);
    	buttonequalto.setFont(new Font("Arial", 25, 25));
    	buttonequalto.addActionListener(this);
     	//-
        buttonmines=new  JButton("-");
		buttonmines.setBounds(210, 230, 50,50 );
		buttonmines.setBackground(Color.WHITE);
     	jf.add(buttonmines);
    	buttonmines.setFont(new Font("Arial", 25, 25));
    	buttonmines.addActionListener(this);
    	//.
     	 buttondot=new  JButton(".");
		buttondot.setBounds(30, 290, 50,50 );
		buttondot.setBackground(Color.WHITE);
     	jf.add(buttondot);
    	buttondot.setFont(new Font("Arial", 25, 25));
    	buttondot.addActionListener(this);
     	//*
     	buttonmultiplication=new  JButton("*");
		buttonmultiplication.setBounds(210, 110, 50,50 );
		buttonmultiplication.setBackground(Color.WHITE);
     	jf.add(buttonmultiplication);
    	buttonmultiplication.setFont(new Font("Arial", 25, 25));
    	buttonmultiplication.addActionListener(this);
     	
     	//0
     	buttonzero=new  JButton("0");
		buttonzero.setBounds(90, 290, 50,50 );
		buttonzero.setBackground(Color.WHITE);
     	jf.add(buttonzero);
     	buttonzero.setFont(new Font("Arial", 25, 25));
    	buttonzero.addActionListener(this);
    	
     	// \
     	 buttondivision=new  JButton( "/");
		buttondivision.setBounds(210, 290, 50,50 );
		buttondivision.setBackground(Color.WHITE);
     	jf.add(buttondivision);
     	buttondivision.setFont(new Font("Arial", 25, 25));
     	buttondivision.addActionListener(this);
     	
     	// clear
     	 buttonclear=new JButton("clear");
     	buttonclear.setBounds(270, 110, 90, 230);
     	buttonclear.setBackground(Color.WHITE);
     	jf.add(buttonclear);
     	buttonclear.setFont(new Font("Arial", 25, 25));
     	buttonclear.addActionListener(this);
     
     	
	}
	
	public static void main(String[] args) {
	new Calculator();
	
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	

		if(e.getSource()== buttondivision) {
		  isOperatorclicked=true;
		 choice=1;
		}else if(e.getSource()==buttonzero) {
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
			}else {
			display.setText(display.getText()+"0");}
		}else if(e.getSource()==buttonmines){
			isOperatorclicked=true;
			
			choice=2;
			 
		}else if(e.getSource()==buttonaddition){
			isOperatorclicked=true;
			 
			choice=3;
			  
		}else if(e.getSource()==buttonequalto){
		
			String newvalue=display.getText();
			float newvaluef=Float.parseFloat(newvalue);
				float oldvaluef=Float.parseFloat(oldvalue);
				 float result;
				
			if(choice==1) {
				 result=newvaluef/oldvaluef;
				display.setText(result+"");
			}else if(choice==3) {
		
		
				
				 result=newvaluef+oldvaluef;
				display.setText(result+"");}
				
				
			else if(choice==4) {
					
			 result=newvaluef*oldvaluef;
				display.setText(result+"");
			}else if(choice==2) {
				
			
			
				 result=newvaluef-oldvaluef;
				display.setText(result+"");
				
			}
		} else if(e.getSource()==buttonmultiplication){
			isOperatorclicked=true;
			
			 choice=4;
		}else if(e.getSource()==buttondot){
			display.setText(".");
		}else if(e.getSource()==button1){
				if(isOperatorclicked) {
					
					oldvalue=display.getText();
					isOperatorclicked=false;
					display.setText("1");
					}else {		
					display.setText(display.getText()+"1");
												}
		}else if(e.getSource()==button2){
			if(isOperatorclicked) {
			oldvalue=display.getText();
			isOperatorclicked=false;
			display.setText("2");
			}else {
			display.setText(display.getText()+"2");}
		}else if(e.getSource()==button3){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("3");
				}else {
			display.setText(display.getText()+"3");}
		}else if(e.getSource()==button4){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("4");
				}else {
			display.setText(display.getText()+"4");}
		}else if(e.getSource()==button5){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("5");
				}else {
			display.setText(display.getText()+"5");}
		}else if(e.getSource()==button6){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("6");
				}else {
			display.setText(display.getText()+"6");}
		}else if(e.getSource()==button7){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("7");
				}else {
			display.setText(display.getText()+"7");}
		}else if(e.getSource()==button8){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("8");
				}else {
			display.setText(display.getText()+"8");}
		}else if(e.getSource()==button9){
			if(isOperatorclicked) {
				oldvalue=display.getText();
				isOperatorclicked=false;
				display.setText("9");
				}else {
			display.setText(display.getText()+"9");}
		
			}else if(e.getSource()==buttonclear) {
				display.setText("");
			}
		
		
	}
	}



		
	



