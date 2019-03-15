package project;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//--------------------------------------------------------------------------------------
public class logout {
	Stage stage;
	Deposit_money_gui deposit;
	ATMGG loginform;
	Scene scene;
	Withdraw_money_gui withdraw;
	BalanceInquiry balance;
	
	
	
	public logout(Stage stage) {
		this.stage=stage;
	}
	public void prepareScene() {
		
		Button num13 = new Button("deposit");
		 Button num14 = new Button("Balance inquiry"); 
		 Button num15  = new Button("Withdrawal"); 

		// Button num16  = new Button("Prevouis"); 
		// Button num17 = new Button("Next"); 
		 Button num18  = new Button("Exit");
		
		 
		 
		
		 GridPane grid=new GridPane();
		 grid.add(num13, 10, 10);
		 grid.add(num14 , 10 ,11);
		 grid.add(num15, 10, 12);
		// grid.add(num16, 10, 13); 
		// grid.add(num17, 10, 14); 
		 grid.add(num18, 10, 15); 
		 scene=new Scene(grid,600,600);
		
//-------------------------------------------------------		
		
		
		
		
		
		 num13.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			 public void handle (ActionEvent event ) {
				 //a2lo y3ml eh
			 
		   
			
				stage.setScene(deposit.getScene());
				
				
			}
			
			
			 
		//withdraw.setaction twdikil window withdraw
		
	});
		
//-------------------------------
		 
		num15.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				 public void handle (ActionEvent event ) {
					 //a2lo y3ml eh
				 
			   
				
					stage.setScene(withdraw.getScene());
					
					
				} 
		 });
		 
		 
		 num18.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			public void handle (ActionEvent event ) {
				 //a2lo y3ml eh
			 
		   
			
				stage.setScene(loginform.getScene());
				
				
			} 
	 });
		 //----------------
		 num14.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				 public void handle (ActionEvent event ) {
					 //a2lo y3ml eh
				 
					stage.setScene(balance.getScene());
				
				
					
					
				} 
		 });
		 
	
	 }

				 
				 
			 
			 
			 
			 
			 
			 
 //-----------------------------------------------------------------
	public Scene getScene() {
		return this. scene;}
		
	
	// public void setLogut(logout Home) {
	// }
	 public void setDeposit_money_gui(Deposit_money_gui deposit) {this.deposit=deposit;}
     public void setBalanceInq (BalanceInquiry balance) {this.balance=balance;}
	 public void setWithdraw_money_gui(Withdraw_money_gui withdraw) {this.withdraw=withdraw;}
	 public void setATMGG(ATMGG login) {this.loginform=login;}
     
	 



}
