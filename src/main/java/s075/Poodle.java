package s075;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;

	public Poodle() {
		super();
		this.curlDensity = DEFAULT_DENSITY;// specifichiamo la densità del pelo
	}

	public Poodle(String name) {
		super(name);// non specifichiamo la densità del pelo (richiamiamo il costruttore di Dog)
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight);
		this.curlDensity = curlDensity;
	}

	@Override
	public String getName() {// polimorfismo tra cane e barboncino
		return "Poodle " + super.getName();
	}

	@Override // toString mette le info del Poodle ma anche quelle generiche del cane
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;// chiama la toString di chi sta sopra
	}
}
