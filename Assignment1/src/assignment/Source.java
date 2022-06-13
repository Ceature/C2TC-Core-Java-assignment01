package assignment;
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
public class Source{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String userName[]=new String[5];
		for(int i=0;i<5;i++) {
			userName[i]=in.nextLine();
		}
		String temp;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(userName[i].compareTo(userName[j])>0) {
					temp=userName[i];
					userName[i]=userName[j];
					userName[j]=temp;	
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(userName[i]);
		}

	}

}
