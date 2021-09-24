package Classes.Tests;

import java.util.Arrays;
import java.util.List;

public class ValidationFormateur {
	private List<String> grade = Arrays.asList("junior", "senior", "expert");

	public boolean formateurGradIsValid(String grade) {
		if (grade.contains("junior") || grade.contains("senior") || grade.contains("expert"))
			return true;

		return false;

	}
}
