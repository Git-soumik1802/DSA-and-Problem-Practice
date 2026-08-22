package Jspiderjavaday3;
//variables
public class variable {

	public static void main(String[] args) {
//primitive data types
		//non decimal value
//		byte--->1 byte
//		short--->2 bytes
//		int--->4 bytes
//		long--->8 bytes
		//decimal value
//  	float--->4 bytes
//		double--->8 bytes
		//characters 
//		char--->2 bytes
		//boolean values true,false
//		bool--->1 bytes
		// syntax 
//      datatype varName;
		//ex: int age;
// variable initialization 
		//ex: data type varName=value;
//indentifier:- a name which is given by programmer to java components is called as identifier
		//ex class names, var names , method names,etc.
// keywords:- pre difined words in java. in java we have 50+ keywords . ex:- all premitive datatypes, public, class, void, etc.
		
		
		int a=10;
		int b=20;
		System.out.println("a");
		System.out.println(b);
		
		
//variable is a container which is used to store a single value.we can create variables with the help of datatypes
//datatypes used to declare variables,that indicates which type of data the variable is going to store.in java we have two type of datatypes 1.primitive datatypes 2. non primitive datatypes
		
		
		byte id=1;
		short age=24;
		int empId=12345;
		long phNo=6297462342l;//if long value having more than 9 digits then should suffix with l 
		float gpa=8.9f;
		double height=5.7;
		char gender='M';
		boolean status=false;
		System.out.println(id);
		System.out.println(age);
		System.out.println(phNo);
		System.out.println(gpa);
		System.out.println(height);
		System.out.println(gender);
		System.out.println(status);
		
		
// we have to give the variable names different 
//		int x=20;
//		int x=30;
//		//compile time error
//		int y=10;
//		double y=20;
//		//compile time error
		
		
// reinitialization	
		int k=10;
		k=20;
		k=30;
		System.out.println(k);
		
		int m=10,n=20,c=30;
		System.out.println(m);
		System.out.println(n);
		System.out.println(c);
		int z=10;
		int t=z;//copy value
		z=20;
		System.out.println(z);
		System.out.println(t);
		
	}

}
