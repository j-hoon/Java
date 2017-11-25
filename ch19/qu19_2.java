/*
 * 다음 클래스 정의에서 PersonalInfo의 clone 메소드 호출 시 깊은 복사가 이뤄지도록 clone 메소드를 오버라이딩 하자.
 */

class Business implements Cloneable {
	private String company;
	private String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void changeBusinessInfo(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusinessInfo() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}
	
	@Override
	public Business clone() throws CloneNotSupportedException {
		return (Business)(super.clone());
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;

	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}

	public void changePersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusinessInfo();
	}

	@Override
	public PersonalInfo clone() throws CloneNotSupportedException {
		return (PersonalInfo)(super.clone());
	}
}

class qu19_2 {
	public static void main(String[] args) {
		Business bz1 = new Business("부경대학교", "컴퓨터공학과");
		Business bz2 = null;
		PersonalInfo pi1 = new PersonalInfo("김철수", 25, "부산대학교", "기계공학과");
		PersonalInfo pi2 = null;
		
		try {
			bz2 = bz1.clone();
			bz2.changeBusinessInfo("경성대학교", "경영학과");

			pi2 = pi1.clone();
			pi2.changePersonalInfo("김영희", 27, "부산예술대학교", "무용학과");
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--- bz1 정보 ---");
		bz1.showBusinessInfo();
		System.out.println("--- bz2 정보 ---");
		bz2.showBusinessInfo();
		System.out.println();

		System.out.println("--- pi1 정보 ---");
		pi1.showPersonalInfo();
		System.out.println("--- pi2 정보 ---");
		pi2.showPersonalInfo();
	}
}
