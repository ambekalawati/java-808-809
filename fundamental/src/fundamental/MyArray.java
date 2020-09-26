package fundamental;

public class MyArray {
	public int[] array=new int[10];
	public int size=0;
	
	//write a method name: add taking an argument of type int.
	//return type should be void.
	// modifier should be public.
	// Assumption default it will add at last position.
	public void add(int input) {
		// ref[size]=value;
		// increase the /size/index by 1.
		array[size]=input;
		size=size+1;
		
	}
	
	// write a method name addAtFirst taking an argument of int type.
	//return type should be void and modifier should be public.
	public void addAtFirst(int value) {
		// first take back up of the existing array.
		//copy the actual array value into new array(backup array/temp array) 
		//now add given value at zero index in actual array
		//then copy element from temp array to actual array from first index on words
		//increase size by 1
		
		int[] temp=new int[size];
		for(int i=0;i<size;i++) {
			temp[i]=array[i];
		}
		array[0]=value;
		int size1=size;
		for(int index=1;index<=size1;index++) {
			array[index]=temp[index-1];
			
		}
		size=size+1;
		}
		
		// write a method name addAtMiddle taking two argument name : index,value of int type.
		//return type should be void and modifier should be public.
		
		public void addAtMiddle(int index, int value) {
			// take backup of actual array into new array(temp)
			// copy actual array value in temp array 
			// add new value at given index 
			//copy temp array value in actual array from given (index +1) on words 
			//increase size by 1
			int[] temp= new int [size];
			for(int i=0;i<size;i++) {
				temp[i]=array[i];
			}
			array[index]=value;
			int indexTemp=0;
			for(int i=0;i<temp.length;i++) {
				index=index+1;
				array[index]=temp[indexTemp];
				indexTemp=indexTemp+1;
				
			}
			size=size+1;
			
			
		
	}
	public static void main(String[] args) {
		MyArray myArray= new MyArray();
		myArray.add(20);
		myArray.add(30);
		//access/get/fetch both the values and print those value.
//		int result= myArray.array[0];
//		int result2 =myArray.array[1];
//		System.out.println("result:"+result);
//		System.out.println("result2:"+result2);
		// call method addAtFirst
		// <reference of object><.><method name>
		myArray.addAtFirst(40);
		int result3= myArray.array[0];
		myArray.addAtMiddle(1,60);
		int result4= myArray.array[1];
		System.out.println("result4:"+result4);
		System.out.println("result3:"+result3);
		System.out.println(myArray.array[1]);
		System.out.println(myArray.array[2]);
		
	}
	
	
	

}
