/*
 * 다음 클래스의 인스턴스가 HashSet<Person> 컬렉션 인스턴스에 저장될 때,
 * 이름과 나이가 같으면 동일 인스턴스로 판단되도록 hashCode와 equals 메소드를 오버라이딩 해보자.
 */

import java.util.Objects;
import java.util.HashSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "(" + age + "세)";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
//		return name.hashCode() + (age % 7);
	}

	@Override
	public boolean equals(Object obj) {
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;

		if(name.equals(n) && age == a)
			return true;
		else
			return false;
	}
}

class qu23_1_1 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("김철수", 25));
		set.add(new Person("박영희", 26));
		set.add(new Person("김철수", 27));
		set.add(new Person("박영수", 26));
		set.add(new Person("김철수", 25));
		set.add(new Person("박영희", 26));
		System.out.println("인스턴스 수: " + set.size());

		for(Person p : set)
			System.out.println(p.toString());
	}
}
