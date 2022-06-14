package Java8features;

interface default1
{
	public void show();
}

public class Defaultlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		default1 d = () ->
		{
			System.out.println("This is Lambda Expression");
		};
		d.show();
		

	}

}
