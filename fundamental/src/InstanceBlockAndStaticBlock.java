
public class InstanceBlockAndStaticBlock {
	static {
		System.out.println("static block/execute only once......");
	}
	
	InstanceBlockAndStaticBlock(){
		System.out.println("constructor created ");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		new InstanceBlockAndStaticBlock();
		new InstanceBlockAndStaticBlock();
		new InstanceBlockAndStaticBlock();
		

	}

}
