package s072;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract {
	@Override // indiciazione per ricordare che il metodo Abstract è stato ripreso
	public void anAbstractMethod() {
		System.out.println("not abstract anymore");
	}
}
