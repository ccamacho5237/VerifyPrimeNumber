import java.util.Scanner;
public class VerPrimeN
{
    public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Ingrese un numero:");
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " es un numero primo");
	else
	   System.out.println(num + " no es un numero primo");
   }
}
