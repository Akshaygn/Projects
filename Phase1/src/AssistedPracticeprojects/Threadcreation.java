package AssistedPracticeprojects;

public class Threadcreation extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		Threadcreation t = new  Threadcreation();
  		t.start();
 	}
}
