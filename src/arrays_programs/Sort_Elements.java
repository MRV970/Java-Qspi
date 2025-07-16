package arrays_programs;

public class Sort_Elements {
	public static void main(String args []) {
		int a[]= {10,89,20};
		int b[]= {43,55,90};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				
				c[i]=b[i-a.length];
			}
		}
		
				for(int i=0;i<=c.length-1;i++) {
					
					
					int temp=c[i];
					
					for(int j=0;j<=c.length-1;j++) {
						if(c[j]>temp) {
							temp=c[j];
							c[j]=c[i];
							c[i]=temp;
							
						}
					}
				}
				for(int k:c) {
					System.out.println(k);
				}
	}
	}


