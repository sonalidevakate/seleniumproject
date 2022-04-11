package ScreenShot;

import java.util.Date;

public class StringPath {
	public static void main(String[] args) {
		Date d=new Date();
		String date=d.toString();
		String str=date.replace(":", "_"); //replace colon to underscore
		String path=("C:\\Users\\Sonali\\OneDrive\\Documents\\ScreenShot\\image_"+str+"");
		System.out.println(path);		
	}

}
