package String_Programs;

public class Remove_Duplicate {
//	public static void main(String[] args) {
//		String s1="My name is  Khan";
//		String s2="";
//		char ch[]=s1.toCharArray();
//		for(int i=0;i<=ch.length-1;i++) {
//			int count=0;
//			for(int j=0;j<i;j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//			}
//			if(count<1) {
//				s2=s2+ch[i];
//				
//				
//			}
//			
//		}
//		System.out.println(s2);
//	}
	
	public static void main(String[] args) {
		int a[]= {12,21,12,324,12,11,1111,111111,1111};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
