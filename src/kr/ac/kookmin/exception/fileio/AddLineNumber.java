package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/

public class AddLineNumber
{
   public static void main(String[] args)
   {
	   BufferedReader inputStream = null;
	   PrintWriter outputStream = null;
	   try {
		   inputStream = new BufferedReader(new FileReader("c:/original.txt"));
		   outputStream = new PrintWriter(new FileOutputStream("c:/numbered.txt"));
		   int i = 0;
		   while(true){
			   String line = inputStream.readLine();
			   if(line == null)
				   break;
			   String data = i + " " + line;
			   outputStream.println(data);
			   i++;
			   }
		   } catch (Exception e){
			   e.printStackTrace();
		   } finally {
			   try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			   outputStream.close();
		   }
   }
}