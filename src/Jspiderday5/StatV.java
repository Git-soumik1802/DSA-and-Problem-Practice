package Jspiderday5;


public  class StatV {
	public static void m1() {
	System.out.println(StatV.i);

	}
	// inside the class outside the methods .
	// which variables are created inside the class block outside the method block using static keyword is called as static variables.
	// we can access static variables with the help of class name.
	int k=30;
	// which variables are created inside the class block out side method  block without using static keyword is called as non static variables
	// we can access non static variables with the help of object reference
	static int i =10;
	public static void main(String[] args) {
		int i=20;
		
		StatV b=new StatV();
		StatV.m1();
		StatV.i=20;
		StatV.m1();
//		System.out.println(b.k);
		System.out.println(StatV.i);
//		System.out.println(i);
// default values only applicable for static and non static variables
		// byte,short,int ,long->0
		//float,double->0.0
		//char->empty char
		// boolean->false
		//for non-primitive type->null
	}

}
