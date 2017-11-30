import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class AsListCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);

		// for문 기반의 반복자 획득과 순차적 참조
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

		// "Box"를 모두 삭제하기 위한 반복문
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("Box"))
				itr.remove();
		}

		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
	}
}
