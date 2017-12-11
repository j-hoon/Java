import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

class CopyFileFromFiles {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("/home/hoon/Workspace/Java/ch33/CopyFileFromFiles.java");
		Path dst = Paths.get("/home/hoon/Workspace/Java/ch33/CopyFileFromFiles2.java");

		// src가 지시하는 파일을 dst가 지시하는 이름으로 복사
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
