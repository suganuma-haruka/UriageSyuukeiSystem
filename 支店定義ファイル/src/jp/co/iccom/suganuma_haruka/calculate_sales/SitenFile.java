package jp.co.iccom.suganuma_haruka.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SitenFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\java\\blanch.lst");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			
		} catch(IOException e) {
			System.out.println(e + "支店定義ファイルが存在しません。");
		}
	}
}
