package arrays_programs;

public class Span {//Span is nothingbut the difference blw largestelement and smallestelement
public static void main(String[] args) {
	int a[]= {10,15,75,18,89,95};
	int max=a[0],min=a[0];
	for(int temp:a) {
		if(temp>max)
			max=temp;
		if(temp<min)
			min=temp;
	}
	System.out.println("span of an array->"+(max-min));
}
}
