package s062;

public class Scope {
	private static int staticMember = 5; // non lo vedrei se fossi fuori dalla classe
	private long member = 5;

	public void f() {
		int local = 7;
		if (staticMember == 2) {
			short inner = 12;
			staticMember = 1 + inner;
			member = 3 + local;
		}
	}

	public void g() {
		System.out.println(member);
	}

	public static void main(String[] args) { // essendo un metodo statico può vedere staticMember
		double local = 5;
		System.out.println(local);
		staticMember = 12;
		Scope scope = new Scope(); // creazione oggetto scope perchè non posso accedere alla variabile member, così
									// come non posso accedere a f
		System.out.println(scope.member); // member: proprietà oggetto scope

		// gli statici possono vedere solo gli statici, altrimenti devo chiamare
		// l'istanza (oggetto) su cui lavorare
	}
}
