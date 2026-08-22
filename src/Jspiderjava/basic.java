package Jspiderjava;
class basic1{
	public static void m2() {
		System.out.println("m2() in class basic1");
		
	}
}
class basic2{
	public static void m3() {
		System.out.println("class of basic2");
		basic1.m2();
	}
}
public class basic {
	public static void main(String[]args) {
		System.out.println("hello world");
		basic.m1();
		//when we call static methods should call by classname like:- classname.methodname();
		basic1.m2();
		/*if class is in same file then just call by class name but if class is 
		in different package or folder then we have to set the path or import the package*/
		basic2.m3();
		System.out.println("program ends");
		
	}
	public static void m1() {
		System.out.println("hello world");
		System.out.println("i am the best");
	}
}
