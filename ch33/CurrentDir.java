import java.nio.file.Path;
import java.nio.file.Paths;

class CurrentDir {
	public static void main(String[] args) {
		Path cur = Paths.get("");	// 현재 디렉토리 정보 담긴 인스턴스 생성
		String cdir;

		if(cur.isAbsolute())
			cdir = cur.toString();
		else
			cdir = cur.toAbsolutePath().toString();

		System.out.println("Current dir: " + cdir);
	}
}
