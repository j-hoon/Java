import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Write7ToFile {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.dat");	// 출력 스트림 생성
		out.write(7);	// 7을 저장
		out.close();	// 스트림 종료
	}
}
