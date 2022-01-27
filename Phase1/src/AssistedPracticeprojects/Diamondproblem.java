package AssistedPracticeprojects;

interface First 
{  
    default void view() 
    { 
        System.out.println("First statement excute"); 
    } 
} 
interface Second 
{  
    default void view() 
    { 
        System.out.println("Second Statement excute"); 
    } 
}  
public class Diamondproblem implements First, Second 
{  
    public void view() 
    {  
        First.super.view(); 
        Second.super.view(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamondproblem ob = new Diamondproblem(); 
        ob.view(); 
    } 
}

