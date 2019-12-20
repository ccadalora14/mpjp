package s075;

public class Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;
	
	private String name;
	private int weight;

	public Dog() { // non viene specificato nè il nome, nè il peso
		this(DEFAULT_NAME, DEFAULT_WEIGHT);// richiamiamo i costruttori apposta
	}

	public Dog(String name) {
		this(name, DEFAULT_WEIGHT);// passiamo il controllo all'altro costruttore (completo)
	}

	public Dog(int weight) {
		this(DEFAULT_NAME, weight);
	}

	public Dog(String name, int weight) { // costruttore principale
		this.name = name;// nella proprietà name ci devo mettere il valore passato nella proprietà sopra
		this.weight = weight;
	}

	public String getName() {// getter: quello che ritorna il valore
		return name;
	}

	@Override
	public String toString() {
		return "S71Dog [name=" + name + ", weight=" + weight + "]";
	}
}
