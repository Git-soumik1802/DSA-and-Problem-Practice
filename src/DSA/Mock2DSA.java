package DSA;


import java.util.*;


public class Mock2DSA {

    public static void main(String[] args) {

        // Queue for customer names (Front -> Rear)
        Queue<String> custNameQueue = new ArrayDeque<>();
        custNameQueue.add("Paul Steven");
        custNameQueue.add("Elisa Perry");
        custNameQueue.add("James Gun");
        custNameQueue.add("John Deol");

        // Queue for customer DOB (Front -> Rear)
        Queue<String> custDobQueue = new ArrayDeque<>();
        custDobQueue.add("12-07-2009");
        custDobQueue.add("20-06-2015");
        custDobQueue.add("31-10-2007");
        custDobQueue.add("19-12-2010");

        Stack<String> couponCodeStack =
                generateCouponCodes(custNameQueue, custDobQueue);

        System.out.println("CouponCodeStack (Top -> Bottom):");
        while (!couponCodeStack.isEmpty()) {
            System.out.println(couponCodeStack.pop());
        }
    }

   
    public static Stack<String> generateCouponCodes(
            Queue<String> nameQueue,
            Queue<String> dobQueue) {

        Stack<String> stack = new Stack<>();
        
        	while(!nameQueue.isEmpty()&& !dobQueue.isEmpty()) {
        	      String s1=nameQueue.poll();
        	      String s2=dobQueue.poll();
//        	      System.out.println(s1);
//        	      System.out.println(s2);
        	      
        	      String str=s1.substring(0,3).toUpperCase()+s1.substring(s1.length()-3,s1.length());
//        	      System.out.println(str);
        	      int n=s2.charAt(0)-'0'+s2.charAt(1)-'0';
        	      String str3=s2.substring(s2.length()-4,s2.length());
        	      int x=Integer.parseInt(str3);
        	      	int dis=0;
        	      	String str1="";
        	      	if(x>=2008 && x<=2012) {
        	      	    str1 = str + "-" + n + "-35";
        	      	}
        	      	else if(x>=2013 && x<=2017) {
        	      	    str1 = str + "-" + n + "-20";
        	      	}
        	      	else {
        	      	    str1 = str + "-" + n + "-X";
        	      	}

        	      
        	      stack.push(str1);
        	      
        	}
        return stack;
    }
}