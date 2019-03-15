package project;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Withdraw_money_gui {
Stage stage;
logout Home;
Scene scene;
Operations cust;
private Withdraw_money_gui withdraw;

public Withdraw_money_gui(Stage stage)
{this.stage=stage;}

public void perpareScene() {
	Label withdrawLabel=new Label("enter the amount");
	TextField withdrawField=new TextField();
	
	
   Button ok=new Button("ok");
	 Button other_trans=new Button("other transactions");
	 

	 GridPane grid=new GridPane();
	 grid.add(withdrawLabel, 20, 20);
	 grid.add( withdrawField, 10 ,20);
	 grid.add(other_trans, 50, 50);
	 grid.add( ok, 60 ,60);
	 scene=new Scene(grid,600,600);
	 
	 //----------------------------------
	 ok.setOnAction(new EventHandler() {
		 public void handle (ActionEvent event ) {
			
		
			 String y= withdrawLabel.getText();
				cust.withdrawM(y);
				
	   
		
	    
			stage.setScene(Home.getScene());
	

		 }

		@Override
		public void handle(Event event) {
			// TODO Auto-generated method stub
			
		}

		
		});
     
	 //--------------------------
	 other_trans.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle (ActionEvent event ) {
			 //a2lo y3ml eh
	    
			stage.setScene(Home.getScene());
			}
		 });
	//------------------------------------
	}
public Scene getScene() {return this. scene;}
public void setlogout(logout Home) {this.Home=Home;}
//public void setWithdraw_money_gui(Withdraw_money_gui withdraw) {this.withdraw=withdraw;}






}
