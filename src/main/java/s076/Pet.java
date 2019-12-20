package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "brown";
	private static final String DEFAULT_NAME = "MyPet";

	private String name;
	private String color;

	public Pet() {
		this(DEFAULT_NAME);
	}

	public Pet(String name) {
		this(name, DEFAULT_COLOR);
	}

	public Pet(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getColor() {// modo standard per chi usa la classe Pet possa accedere alla proprietà
		return color;
	}

	public void setColor(String color) {// se voglio che l'utente possa modificare il colore
		this.color = color;
	}

	public String getName() {
		return name;
	}
}