import java.io.File;
import java.io.FileReader;

public class Ex1206 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			int i = 0;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			
			fis.close();
			System.out.println("파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
