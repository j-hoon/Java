import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

class SimpleWriter {
	public static void main(String[] args) {
		try (Writer out = new FileWriter("data.txt")) {	// 문자 출력 스트림 생성
			out.write('A');		// 문자 'A' 저장
			out.write('한');	// 문자 '한' 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
