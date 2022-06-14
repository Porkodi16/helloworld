package Java8features;

interface operation
{
	public int add(int a, int b);
}

public class LambdaArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operation a1=(a,b) ->(a+b);
		
		System.out.println(a1.add(20,5));
		
		operation a2=(a,b) ->(a-b);
		
		System.out.println(a2.add(20,5));
		
		operation a3=(a,b) ->(a*b);
		
		System.out.println(a3.add(20,5));
		
		operation a4=(a,b) ->(a/b);
		
		System.out.println(a4.add(20,5));
		

	}

}
