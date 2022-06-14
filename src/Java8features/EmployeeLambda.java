package Java8features;

interface emp
{
	public void show(String name, String designation, int salary);
}

public class EmployeeLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp e1=(name,designation,salary) ->
				{
					System.out.println(name+" "+designation+" "+salary);
				};
				
				
				emp e2=(name,designation,salary) ->
						{
							System.out.println(name+" "+designation+" "+salary);
						};
						
						
						e1.show("Sai","HR",30000);
						e2.show("Shree","Manager",40000);




	}

}
