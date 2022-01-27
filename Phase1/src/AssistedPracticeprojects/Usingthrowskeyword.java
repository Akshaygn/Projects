package AssistedPracticeprojects;

public class Usingthrowskeyword {

    void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
    	 Usingthrowskeyword t = new Usingthrowskeyword();
      
      try
        {
    	  System.out.println("\n\tStart program");
            t.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }

}
