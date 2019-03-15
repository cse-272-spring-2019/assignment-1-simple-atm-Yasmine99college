package project;
import java.util.HashMap;
public class authentic {

 HashMap<String,String> carde=new HashMap<String,String>();
 
 
 public authentic () {carde.put("yasmine","111");}
 
	

public boolean validate(String username,String cardnum) {
	boolean validationResult;
String fetchedcard=(String) carde.get(username);
if(fetchedcard!=null) {validationResult=fetchedcard.equals(cardnum);}
else {validationResult=false;}
	
	return validationResult;
}

}
