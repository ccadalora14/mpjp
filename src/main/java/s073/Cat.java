package s073;

public class Cat extends Mammal { // posso creare oggetti di tipo Cat (classe concreta)
	private Tail tail; // proprietà privata di tipo Tail

	public Cat(int gestationDays, int tailLen) { // Cat costruttore con due parametri
		super(gestationDays); // richiamo del costruttore della classe generica che sta sopra
		this.tail = new Tail(tailLen);// richiamo della classe corrente
	}

	@Override
	public String toString() {
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";// tail proprietà di Tail
	}
}
