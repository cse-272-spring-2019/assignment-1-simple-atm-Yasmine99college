package project;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.scene.Node;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
//import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ATMGG  {
	Stage stage;
	Scene scene;
 authentic allow;
 logout Home ;
//private Parent grid;
	
	

	
public ATMGG(Stage stage) {this.stage=stage;}
	
	
	
	//start set l app eno ysht8l
	public void prepareScene()  {
		allow=new authentic(); //nadit el ht3mli logic check
		
		
		//String text;
		
	
	    Label usernameLabel = new Label ("username ");
		Label cardnumLabel = new Label( "card number: ");
		TextField usernameField = new TextField();
		PasswordField cardnumField = new PasswordField(); 
		//cardnumLabel di l hia passwordlabel 3ndo
		   // Labels di l hia l ganb l kalam l bt2ol ll user yktb eh
		//elel buttons el m7tgaha
	     Button num12  = new Button("Submit"); 
		
		 //end of creating buttons
		 
		 Label validationLabel = new Label();
		 
		 //layout el 7a7ot fih
		 GridPane grid=new GridPane();
		 grid.add(usernameLabel, 20, 20);
		 grid.add( cardnumLabel , 20 ,21);
		 grid.add(usernameField, 30, 20);
		 grid.add(cardnumField, 30, 21);
		 grid.add(num12, 50, 50);
		 grid.add(validationLabel , 40, 30);
		 scene=new Scene(grid,600,600);
		 //------------------------------------
		 num12.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle (ActionEvent event ) {
				 //a2lo y3ml eh
		    String username=usernameField.getText();
			String cardnum=cardnumField.getText();
			boolean valid=allow.validate(username,cardnum);
			if(valid ) {//do sth
				validationLabel.setText("welcome");
				stage.setScene(Home.getScene());
				
				
			}
			else {//do other
				validationLabel.setText("shit man!");
				}
			
			 
			
		 }
		 });
		 //----------------------------
			
			 
	
		 
	 }public Scene getScene() {return this.scene;}
	 public void setLogut(logout Home) {
		 this.Home=Home;
	 }
	
}
	
	
	 
		 
		 
		
		 
		 
		
			 
		
		 