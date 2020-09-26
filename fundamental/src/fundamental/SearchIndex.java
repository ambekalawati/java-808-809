package fundamental;

public class SearchIndex {
	int [] a = new int [10];
	int count = 0;
	public void index() {
		
	}
	public void index(int input) {
		a[count]=input;
		count=count+1;
	}
	public boolean isPresent () {
		if(size() <a.length) {
			return true;
			}	
			else {
				return false;
			
		}

		}
		public int size() {
			return count;
		}
		public void display()
		{
			for (int i = 0; i <count; i++)
			{
					System.out.println(a[i]);
				}
		
		}	
	
	public static void main(String[] args) {
		SearchIndex array =new SearchIndex();
		array.index(10);
		array.index(20);
		array.index(30);
		array.index(40);
		array.index(50);
		array.index(60);
		array.index(70);
		array.index(80);
		array.index(90);
		array.index(100);
		
		}
		
		// TODO Auto-generated method stub

	
	
	}
	


