import java.util.Scanner;
import java.util.Random;

class qu20_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("난수 생성 범위를 입력해 주세요. [ 정수 2개, 띄어서 구분. ex) 1 10 ]: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();

		if(i1 > i2) {
			int temp = i2;
			i2 = i1;
			i1 = temp;
		}
		System.out.printf("입력한 범위 : %d ~ %d \n", i1, i2);

		Random rand = new Random();
		int r;

		for(int i = 0; i < 15; i++) {
//			System.out.printf("%d ~ %d 사이의 난수 %d: %d \n", i1, i2, i+1, rand.nextInt(i2-i1+1)+i1);
			r = i1;
			r += rand.nextInt(i2 - i1 + 1);
			System.out.printf("%d ~ %d 사이의 난수 %d: %d \n", i1, i2, i+1, r);
		}
	}
}
