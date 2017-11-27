import java.util.Random;

class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();

		for(int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));	// 0 이상 1000 미만 난수 생성
	}
}
