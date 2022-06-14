package Java8features;

interface intro
{
	public void show(String name, String address, int age);
}

public class PersonLambdawithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intro i1=(name,address,age) ->
		{
			System.out.println(name+" "+address+" "+age);
		};
		
		intro i2=(name,address,age) ->
		{
			System.out.println(name+" "+address+" "+age);
		};
		
		i1.show("Sam", "USA", 20);
		
		i2.show("Ram", "Spain",25);

	}

}
