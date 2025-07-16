package MethodOverriding;

public class YoutubeDriver1 extends YoutubeDriver {
	public void  watch() {
		super.watch();
		System.out.println("watching shorts,movies,videos");
		
		
	}
	public static void main(String args[]) {
		YoutubeDriver1 Y = new YoutubeDriver1();
		Y.watch();
		
	}

}
