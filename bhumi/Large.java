import java.util.*;

class Large {
    
    public static void main(String args[])
 	{
              int A[] = new int[5];
              for (int i = 0; i < 5; i++) 
	{
            A[i] = Integer.parseInt(args[i]);
        }
        
               int large = A[0];
        

        for (int x : A)
	 {
            if (x > large) 
		{
                large = x;
            }
        }
        
               System.out.println("Largest number: " + large);
    }
}
