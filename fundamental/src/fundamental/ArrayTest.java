package fundamental;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		names[0]="kalawati";
		names[1]="ambe";
		names[2]="bhatt";
		names[3]="choti";
		names[4]="chote";
		int [][] a= new int[2][3];
		System.out.println(names);
		System.out.println(a);
		System.out.println(names[4]);
		char size='A';
		int[] z= new int [size];
		//System.out.println(a[1].length);
		int[][][] k= new int [2][3][4];
		System.out.println(k.length);// 2
		System.out.println(k[0].length);//3
		System.out.println(k[1].length);//3
		System.out.println(k[0][0].length);//4
		System.out.println(k[0][1].length);//4
		System.out.println(k[0][2].length);//4
		System.out.println(k[1][0].length);//4
		System.out.println(k[1][1].length);//4
		System.out.println(k[1][2].length);//4
		k[0][0][0]=10;
		k[0][0][1]=20;
		k[0][0][2]=30;
		k[0][0][3]=40;
		k[0][1][0]=50;
		k[0][1][1]=60;
		k[0][1][2]=70;
		k[0][1][3]=80;
		k[0][2][0]=90;
		k[0][2][1]=100;
		k[0][2][2]=110;
		k[0][2][3]=120;
		k[1][0][0]=130;
		k[1][0][1]=140;
		k[1][0][2]=150;
		k[1][0][3]=160;
		k[1][1][0]=170;
		k[1][1][1]=180;
		k[1][1][2]=190;
		k[1][1][3]=200;
		k[1][2][0]=210;
		k[1][2][1]=220;
		k[1][2][2]=230;
		k[1][2][3]=240;
		
		//k[0][0]=20; compile time error
		System.out.println(k[0][0][0]);
		System.out.println(k[0][0][1]);
		System.out.println(k[0][0][2]);
		System.out.println(k[0][0][3]);
		System.out.println(k[0][1][0]);
		System.out.println(k[0][1][1]);
		System.out.println(k[0][1][2]);
		System.out.println(k[0][1][3]);
		System.out.println(k[0][2][0]);
		System.out.println(k[0][2][1]);
		System.out.println(k[0][2][2]);
		System.out.println(k[0][2][3]);
		System.out.println(k[1][0][0]);
		System.out.println(k[1][0][1]);
		System.out.println(k[1][0][2]);
		System.out.println(k[1][0][3]);
		System.out.println(k[1][1][0]);
		System.out.println(k[1][1][1]);
		System.out.println(k[1][1][2]);
		System.out.println(k[1][1][3]);
		System.out.println(k[1][2][0]);
		System.out.println(k[1][2][1]);
		System.out.println(k[1][2][2]);
		System.out.println(k[1][2][3]);
		int[] k1=new int[3];
		int[][] k2=new int[3][3];
		int [][][] k3=new int[3][3][3];	
		//array assignment
		Object[] obj= new Object[6];
		int[] w= new int[8];
		obj[0]=w;
		char[] ch= new char[4];
		obj[1]=ch;
		//w=ch; compile time error
		w[0]='a';
		String[] str=new String[9];
		obj=str;
		
	}

}
