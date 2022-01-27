package AssistedPracticeprojects;

public class Tryandcatch 
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[5] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bound Exception"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}

