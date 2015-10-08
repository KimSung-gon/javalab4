package kr.ac.embedded.kookmin.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AAA {

	public void readFile() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("c:/a.txt"));
		
			while(true){
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			br.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

public class Test {
    public static void main(String args[]) {
    	
    	AAA a = new AAA();
    	a.readFile();
    }
} 