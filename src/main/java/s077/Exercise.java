package s077;

//array di pet con almeno un cane e un gatto 
//for each su array di pet
//cani abbaiano, gatti miagolano 

public class Exercise {
	public static void main(String[] args) {
		Pet[] pets = { new Dog("Max"), new Cat("Cloe") };

		for (Pet pet : pets) {
			if (pet instanceof Dog) {

				Dog aDog = (Dog) pet;
				aDog.bark();
			} else if (pet instanceof Cat) {
				((Cat) pet).meow();
			} else {
				System.out.println("Unknown pet");
			}
		}
	}
}
