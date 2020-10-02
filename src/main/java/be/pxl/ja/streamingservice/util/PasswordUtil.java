package be.pxl.ja.streamingservice.util;

import java.lang.reflect.Array;
import java.util.List;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int score;
		if (password.length() < 6) {
			return 0;
		} else if (password.length() < 10) {
			score = 1;
		} else {
			score = 2;
		}

		boolean kleine = true;
		boolean grote = true;
		boolean getal = true;
		boolean teken = true;

		for (char symbool : password.toCharArray()) {
			if (Character.isDigit(symbool) && getal) {
				score += 2;
				getal = false;
			} else if (Character.isLowerCase(symbool) && kleine) {
				score += 2;
				kleine = false;
			} else if (Character.isUpperCase(symbool) && grote) {
				score += 2;
				grote = false;
			}
			for (char speciaalSymbool : SPECIAL_CHARACTERS.toCharArray()) {
				if (speciaalSymbool == symbool && teken) {
					score += 2;
					teken = false;
				}
			}
		}
		return score;
	}
}
