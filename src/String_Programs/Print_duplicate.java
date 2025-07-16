package String_Programs;

public class Print_duplicate {
	public static void main(String[] args) {
		String s1="JavaMava";
		String s2="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {//0<=7/1<7/2<7/3<7
			int count=0;//0/1
			for(int j=0;j<i;j++) {//0<0/0<1/1<1F/0<2 /1<2/2<2/0<3/1<3/2<3/3<3
				if(ch[i]==ch[j]) {//a==j F/v==j F/a==j F/ a==J/a==aT/a==v/a==a
					count++;
					
				}
			}
			if(count<1) {//0<1,0<1/0<1/1<1/1<1
				s2=s2+ch[i];
				
			}
			
		}
		System.out.println(s2);//JavM
	}

}
