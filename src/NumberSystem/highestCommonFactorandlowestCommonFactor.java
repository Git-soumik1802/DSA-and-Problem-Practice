package NumberSystem;

public class highestCommonFactorandlowestCommonFactor {
public static void main(String[] args) {
	
	hcfandlcm(25, 60);
}

private static void hcfandlcm(int a,int b) {
	int hcf=0;
	for(int i=1;i<=a;i++) {
	if(a%i==0 && b%i==0) {
		hcf=i;
	}
	}
	int lcm=a*b/hcf;
	System.out.println("LCM:"+lcm+","+"HCF:"+hcf);
}
}
