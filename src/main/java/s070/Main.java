package s070;

public class Main {
	public static void main(String[] args) { // array di interfaces (abbaianti)
		Barker[] barkers = new Barker[2];

		barkers[0] = new Fox();
		barkers[1] = new Dog();

		for (Barker barker : barkers) { // for each: per ogni elemento faccio abbaiare prima la volpe, poi il cane
			System.out.println(barker.bark());
		}

		BarkAndWag baw = new Dog(); // interfaccia classe Dog
		System.out.println(baw.tailWaggingSpeed());

		Dog dog = new Dog();
		System.out.println(dog.bark(3));
	}
}
