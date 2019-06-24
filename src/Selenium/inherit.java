package javaConcept;

public class inherit {
	
	int a;
	int mango;
	int app;
	String name;
	
	inherit(int a){
		this.a=a;
		System.out.println("This is constructor chaining");
		
	}
	inherit(int a,int mango){
		this(a);
		this.mango=mango;
		
	}
	inherit(int a,int mango,int app){
		this(a,mango);
		this.app=app;
		
	}
	inherit(int a,int mango,int app,String name){
		this(a,mango,app);
		this.name=name;
		
	}
	
	
	
	public static int v=10;
	
	public static void prac() {
		 System.out.println("static method");
	}
	
	public void  abc() {
		System.out.println("non static method");
	}
	
	public void bbc() {
		System.out.println("bbc method of inherit");
	}
	

	public static void main(String[] args) {
		inherit ih=new inherit(10,20,30,"Sweta karn");
		inherit ih1=new inherit(10,20,30);
		System.out.println(ih1.sum(20,30));

		ih.abc();
		prac();
		
		ih.bbc();

	}
	private int sum(int f, int g) {
		int s=f+g;
		return s;
		
	}

}
