package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadText {

	public static void main(String[] args) {
		String path = "FileReader.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		br = new BufferedReader(fr);
		String text;

		try {
			while((text = br.readLine())!=null){
				System.out.println(text);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
