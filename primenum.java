import java.util.*;
public class primenum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert any number");
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        System.out.println(n+" is not a prime number");
		        break;
		    }
		    else{
		        System.out.println(n+" is prime number");
		        break;
		    }
		}
	}
}
