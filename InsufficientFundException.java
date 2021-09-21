package Exceptionpack3;
import java.util.*;
public class InsufficientFundException extends RuntimeException{
	InsufficientFundException(String msg)
	{
		super(msg);
	}
	public static void main(String []args) 
	{
		float amount;
		float bankBalance=50000;
		System.out.println("Enter the ammount which you want to withdrow");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextFloat();
		if(amount>bankBalance) 
		{
			throw new InsufficientFundException("you are not having sufficient fund in your account"); 
		}
		else
		{
			System.out.println("your transaction is being processed");
		}
	}
	
}
