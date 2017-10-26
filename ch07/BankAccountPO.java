class BankAccountPO {
	static int balance = 0;	// 예금 잔액

	public static void main(String[] args) {
		deposit(10000);
		checkMyBalance();

		withdraw(3000);
		checkMyBalance();
	}

	public static int deposit(int amount) {
		balance += amount;
		return amount;
	}

	public static int withdraw(int amount) {
		balance -= amount;
		return amount;
	}

	public static int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}

}
