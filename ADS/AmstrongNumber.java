import java.util.*;

public class AmstrongNumber {

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		
		while(num > 0){
		 int digit = num % 10;
		 sum += Math.pow(digit, digits);
		 num /= 10;
		 
		 }
		 String res = (sum == originalNum)? (originalNum + " is an AmstrongNumber."):(originalNum + " is not an AmstrongNumber.");
		 System.out.println(res);
}
}