package jp.co.iccom.suganuma_haruka.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UriageSystem {
	public static void main(String[] args) {
		try {
			File blanch = new File("C:\\java\\blanch.lst");
			FileReader fr = new FileReader(blanch);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			} catch(IOException e) {
			System.out.println(e + "支店定義ファイルが存在しません。");
			}
		
		String[] months = {"001", "札幌支店"};
	
		try {	
			File commodity = new File("C:\\java\\commodity.lst");
			FileReader fR = new FileReader(commodity);
			BufferedReader bR = new BufferedReader(fR);
			String p;
			while((p = bR.readLine()) != null) {
				System.out.println(p);
			}
			bR.close();
			} catch(IOException d) {
				System.out.println(d + "商品定義ファイルが存在しません。");
			}
	}
}

