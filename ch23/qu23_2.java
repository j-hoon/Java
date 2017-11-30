/*
 * 아래의 main 메소드를 실행하면 TreeSet<Integer> 인스턴스에는 오름차순으로 정렬된 상태가 유지되면서 저장된다.
 * 따라서 main 메소드의 실행 결과는 다음과 같다.
 * 	C:\JavaStudy\java ComparatorInteger
 * 	[10, 20, 30]
 * 이에 크고 작음에 대한 기준을 수정한 예제를 작성해보자.
 * 즉 위의 main 메소드를 기반으로 다음의 실행결과를 보이도록 코드를 수정 및 추가해보자.
 * 	C:\JavaStudy\java ComparatorInteger
 * 	[30, 20, 10]
 */

import java.util.TreeSet;
//import java.util.Iterator;
import java.util.Comparator;

class ComparatorInteger implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
//		return i2 - i1;
		return i2.intValue() - i1.intValue();
	}
}

class qu23_2 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>(new ComparatorInteger());
		tree.add(20);
		tree.add(30);
		tree.add(10);
		System.out.println("인스턴스 수: " + tree.size());
/*
		Iterator itr = tree.iterator();

		System.out.print("[");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(itr.hasNext())
				System.out.print(", ");
		}
		System.out.println("]");
*/
		System.out.println(tree);
	}
}
