package project;
import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.Scene;
import javafx.stage.Stage;
public class atmapp extends Application {
	
	public static void main(String[] args) {
	    launch(args);//gwa app w hia l bt3ml start
		}
	
	
	@Override
	public void start(Stage primaryStage)throws Exception{
		Scene scene;
		
		primaryStage.setTitle("ATM Login"); //titre el window
		ATMGG loginForm=new ATMGG(primaryStage);
		Deposit_money_gui deposit=new Deposit_money_gui(primaryStage);
		Withdraw_money_gui withdraw=new Withdraw_money_gui(primaryStage);
		BalanceInquiry balance=new BalanceInquiry(primaryStage);
		logout Home=new logout(primaryStage);
		loginForm.prepareScene();
		balance.perpareScene();
		Home.prepareScene();
		deposit.prepareScene();
		withdraw.perpareScene();
		Home.setDeposit_money_gui(deposit);
		Home.setWithdraw_money_gui(withdraw);
		Home.setBalanceInq(balance);
		
		
		
		deposit.setLogout(Home);
		withdraw.setlogout(Home);
		balance.setlogout(Home);
		
		loginForm.setLogut(Home);
		
		
		
		 primaryStage.setScene(loginForm.getScene());
		 
		 
		
		 primaryStage.show(); //e3rd el stage
		
	}

	
}
