package alessia.yourFirstAccount.avvio;

import alessia.yourFirstAccount.classe.Account;

public class Avvio {

	public static void main(String[] args) {
		Account artosAccount = new Account("Arto's account", 100.00);
		Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

		System.out.println("Initial state");
		System.out.println(artosAccount);
		System.out.println(artosSwissAccount);

		artosAccount.withdraw(20);
		System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
		artosSwissAccount.deposit(200);
		System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

		System.out.println("End state");
		System.out.println(artosAccount);
		System.out.println(artosSwissAccount);
		
		
		System.out.println("-------ESERCIZIO 2--------");
		Account matthew = new Account("Matthew's account", 1000);
		Account mine = new Account("My account", 0);
		System.out.println(matthew.withdraw(100.0));
		System.out.println(mine.deposit(100.0));

	}

}
