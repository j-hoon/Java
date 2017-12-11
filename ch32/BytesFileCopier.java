import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BytesFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();

		System.out.print("사본 이름: ");
		String dst = sc.nextLine();

		try(InputStream in = new FileInputStream(src) ; OutputStream out = new FileOutputStream(dst)) {	// 두 개의 자원을 한 번에
			int data;

			while(true) {
				data = in.read();	// 파일로부터 1 바이트를 읽는다.
				if(data == -1)		// 더 이상 읽어 들일 데이터가 없다면,
					break;
				out.write(data);	// 파일에 1바이트를 쓴다.
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

