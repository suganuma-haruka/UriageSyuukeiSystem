package jp.co.iccom.suganuma_haruka.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SyouhinFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\java\\commodity.lst");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			
		} catch(IOException e) {
			System.out.println(e + "商品定義ファイルが存在しません。");
		}
	}
}