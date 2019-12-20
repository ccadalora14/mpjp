package s073;

public abstract class Mammal {
	protected int gestation; // proprietà

	public Mammal(int gestation) { // costruttore perchè ha lo stesso metodo della classe
		this.gestation = gestation; // parametro: gestazione (voglio inserire gestation nella proprietà gestation)
	}

	@Override // Mammal definito nella classe madre 
	public String toString() { // metodo che ritorna una nuova stringa
		return "Mammal [gestation=" + gestation + "]"; // valore di gestazione
	}
}
