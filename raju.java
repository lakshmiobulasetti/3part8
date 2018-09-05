import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number");

        
        int min=reader.nextInt();

        System.out.println("Enter a second number");

        
        int max=reader.nextInt();

        for (int i=min; i < max + 1; i++)
        {
            System.out.println(i);
        }
	}
}
