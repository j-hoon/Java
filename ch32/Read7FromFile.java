import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Read7FromFile {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("data.dat");	// 입력 스트림 생성
		int dat = in.read();	// 데이터 읽음
		in.close();	// 입력 스트림 종료

		System.out.println(dat);
	}
}
