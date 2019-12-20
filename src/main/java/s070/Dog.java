package s070;

public class Dog implements BarkAndWag {
	@Override
	public String bark() { // void (nessun parametro)
		return "woof!";
	}

	public String bark(int count) { // int, l'utente passa un numero, ritorniamo il numero di bark (no override)
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; i++) {
			sb.append(bark());
		}

		return sb.toString();
	}

	@Override
	public int tailWaggingSpeed() {
		return BarkAndWag.AVG_WAGGING_SPEED;
	}
}