package assignment;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Harsha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String names=" ";
		while(sc.hasNextLine()) {
			names+=sc.nextLine()+",";
		}
		String[]name=names.split(";");
		Arrays.sort(name);
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
	}

}
