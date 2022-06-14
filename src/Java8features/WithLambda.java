package Java8features;


interface areaapp      // interface name  is areaapp
{
	public void d2();
}

public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l=20;
		
		int b=5;
		
		int area=l*b;
		
		areaapp a1=()-> {                  // a1 is a local reference variable for interface
			System.out.println(area);
			
		};
		a1.d2();

	}

}
