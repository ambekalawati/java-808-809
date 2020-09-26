package fundamental;

public class IndexOfDemo {
	int[] a= new int [10];
	int count=0;
	boolean isPresent=false;
	Integer index=null;
	
	public void add(int input) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==count) {
			isPresent=true;
			index=i;
			}
		}
		{
	if(isPresent==true) {
		System.out.println("element is present at index="+index);
	}else {
		System.out.println("element is not present in array");
		}
	}
		
	}
	
	
		public static void main(String[] args) {
			IndexOfDemo array = new IndexOfDemo();
			array.add(100);
			
			
			
	}

}
