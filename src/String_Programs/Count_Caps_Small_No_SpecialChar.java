package String_Programs;

public class Count_Caps_Small_No_SpecialChar {
	public static void main(String[] args) {
		String s1="SqL1234*$@JaVa13254!++";
		String s2=" ";
		int C_Count=0;
		int S_Count=0;
		int N_Count=0;
		int SC_Count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{	
		char J=s1.charAt(i);
			if(J>='A'&& J<='Z') {
				C_Count++;
			}
			else if(J>='a'&& J<='z') {
				S_Count++;
			}
			else if(J>='0'&& J<='9') {
				N_Count++;
			}
			else {
				SC_Count++;
			}
				}
		System.out.println(C_Count+"-> count of Capital Letters");
		System.out.println(S_Count+"->count of Small Letters");
		System.out.println(N_Count+"-> count of Numbers");
		System.out.println(SC_Count+"-> count of SpecialCharacters");
				}

}
