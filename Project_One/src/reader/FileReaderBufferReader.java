package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderBufferReader {

    public static void main(String[] args) {
        String path = "FileReader1.txt";
        FileReader fr = null; // Class and reference variable to create a object what we need
        BufferedReader br = null;

        try {

            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fr);
        String text;

        try {
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();

            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

    }
}

