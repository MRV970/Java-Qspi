package MethodOverriding;

public class YoutubeDriver extends Youtube {
public void watch() {
	super.watch();
	System.out.println("watching movies");
}
}
