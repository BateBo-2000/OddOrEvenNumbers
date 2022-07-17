package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Generator {

	public static void main(String[] args) {
		String path = "C:\\Users\\PC\\Desktop\\test\\program.txt";
		File file= new File(path);
		try {
			
			BufferedWriter writer =new BufferedWriter(new FileWriter(path));
			for (int i = 2000; i < 2500; i++) {
				writer.write(	"\t\t} else if (number == "+(i+1)+") {\r\n" + 
						"			System.out.println(\"number is odd\");\r\n");
				i++;
				writer.write("		} else if (number == "+(i+1)+") {\r\n" + 
						"			System.out.println(\"number is even\");\r\n" );
				
			}
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
