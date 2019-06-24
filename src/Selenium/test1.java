package javaConcept;

public class test1 extends inherit { 
	
	test1(int a, int mango, int app, String name) {
		super(a, mango, app, name);
	}

	@Override
	public void bbc() {
		System.out.println("overrrided method of inherit");
		
	}

	public static void main(String[] args) {
		inherit ij=new inherit(10,20);
		test1 test=new test1(10,20,30,"sdd");
		prac();
		test.abc();
		ij.bbc();
		test.bbc();
		

System.out.println(v);
	}

}
