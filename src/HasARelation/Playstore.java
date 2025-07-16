package HasARelation;

public class Playstore {
	
Snapchat snapid;
Qtalk qid;
public void installsnap(String username) {
	snapid=new Snapchat(username);
	System.out.println(username+ " Snapchat installed successfully");
}
	public void installQtalk(String sName) {
		
		qid=new Qtalk(sName);
		System.out.println(sName+" Qtalk installed sucessfully");
		}
	
	}
	


