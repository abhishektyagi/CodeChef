package intel;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormatConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("prime1000.txt");
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String str="";
			while((str=br.readLine())!=null	)
			{
				str=str.replaceAll("^\\s+", "");
				//str=str.replaceAll("\\s*", ",");
				str=str.replaceAll("\\s+$", ",");
				str=str.replaceAll("\\b\\s{2,}\\b", ",");
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
