package project;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deposit_money_gui {
	
	
	Stage stage;
	logout Home;
    Scene scene;
    Operations cust;
     
     public Deposit_money_gui(Stage stage)
     {this.stage=stage;}
     
     public void prepareScene() {
    	 cust=new Operations();
    	 Label depositeLabel=new Label("Enter the amount you want to put ");
    	 TextField depositeField = new TextField();
    	 
    	 
    	 Button other_trans=new  Button("other transactions");
    	 Button ok =new Button("ok");
    	 Button num18  = new Button("Exit");
    	 
    	 
    	 
    	 
    	 
    	 GridPane grid=new GridPane();
    	 grid.add(depositeLabel,30,30);
    	 grid.add(depositeField,40,30);
    	 grid.add(other_trans, 50, 50);
    	 grid.add(ok, 70, 50);
    	 grid.add(num18, 80, 80);
 		
    	 
    	scene=new Scene (grid,600,600);
    	//--------------------------------------------
    	 other_trans.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle (ActionEvent event ) {
				 
		    
				stage.setScene(Home.getScene());
				}
			 });
		 
    	 //--------------------------------------------------   	 
     
     ok.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle (ActionEvent event ) {
			
		
	   
			String x= depositeLabel.getText();
		cust.depositM(x);
		
	    
			stage.setScene(Home.getScene());
	

		 }});}
   
	public Scene getScene() {return this.scene;}
     public void setLogout(logout Home) {this.Home=Home;}
     
     
}

