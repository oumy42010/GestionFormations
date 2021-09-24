package Classes.Tests;

import java.util.Arrays;
import java.util.List;

public class ValidationSession {
	private List<String> mode = Arrays.asList("présentiel", "en ligne");

	public boolean sessionIsValid(String mode) {
		if (mode.contains("présentiel") || mode.contains("en ligne"))
			return true;

		return false;

	}

}
