package project;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BalanceInquiry {
	Stage stage;
	logout Home;
	Scene scene;
    Operations cust;
    private BalanceInquiry balance;
	public BalanceInquiry(Stage stage)
	{this.stage=stage;}

	public void perpareScene() {
		Label BalanceInqLabel=new Label("your balance is");
		//TextField withdrawField=new TextField();
		//ydyni 3la tol shasha fiha l balance
		//function el print hn7tageha hna
	  Button ok=new Button("ok");
		 Button other_trans=new Button("other transactions");
		 

		 GridPane grid=new GridPane();
		 grid.add(BalanceInqLabel, 20, 20);
		 //grid.add( withdrawField, 10 ,20);
		 grid.add(other_trans, 50, 50);
		 //el mfrod ashil el ok
		 grid.add( ok, 60 ,60);
		 scene=new Scene (grid,600,600);
		 
		 //----------------------------------
		  ok.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle (ActionEvent event ) {
			 //a2lo y3ml eh
			 
	   
	    
			cust.prnt();
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
	
	
	public Scene getScene() {return this.scene;}
	public void setlogout(logout Home) {this.Home=Home;}






	}



