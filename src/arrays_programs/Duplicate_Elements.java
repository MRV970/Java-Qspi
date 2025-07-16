package arrays_programs;

public class Duplicate_Elements {
	public static void main(String args []) {
		int a[]= {12,21,15,12,21,12,15,21,7};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]==a[j] && i>j) {
					break;
					
				}
				if(a[i]==a[j] ){
					count++;
				}
			}
			if(count>1) {
			System.out.println(a[i]+"->"+count);
			}
		}
		
	}

}
