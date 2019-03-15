package project;

import javafx.scene.control.TextField;

public class Operations {
	private String newSalary;
	
	private String PutAmount;
	private String TakeAmount;
	Deposit_money_gui deposit;
	Withdraw_money_gui withdraw;
	TextField textFieldname=new TextField();
	String salary=textFieldname.getText();
	
	
	
	public Operations() {}
	//ida3
	public void depositM(String PutAmount) {this.PutAmount=PutAmount;
	newSalary=salary+Integer.parseInt(PutAmount);
	salary=newSalary;}
	
  public void withdrawM(String TakeAmount) {this. TakeAmount=TakeAmount;
  newSalary=salary-Integer.parseInt(TakeAmount);
	salary=newSalary;}
	
	
	public String prnt() {System.out.println(newSalary);return newSalary;}
	
  }
	
	
	//public 

// void  Integer.parseint(newsalary)