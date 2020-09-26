
public class for_each {

	public static void main(String[] args) {
		
		{
			int[] numbers = {100,200,300,400,500};
			int sum=0;
			for(int number: numbers) {
				sum+=number;
			}
			System.out.println("sum= " + sum);
			
		}

	}

}
