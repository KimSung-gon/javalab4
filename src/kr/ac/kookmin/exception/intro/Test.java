package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class AAA {
	public void readFile() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("c:/a.txt"));
			
			while(true){
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test {
    public static void main(String args[]) {
    	
    	AAA a = new AAA();
    	a.readFile();
    }
} 