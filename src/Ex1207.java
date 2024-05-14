import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex1207 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str;
			
			while ((str = br.readLine()) != null) {
				System.out.print(str);
			}
			
			fis.close();
			System.out.println("파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
