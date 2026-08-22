package OOPs3;

class Parent1{

    void show() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1 {

    void display() {
        System.out.println("Child Method");
    }
}
public class obcp{
    public static void main(String[] args) {

    	Parent1 c = new Child1();

        c.show();
//        c.display();
    }
}