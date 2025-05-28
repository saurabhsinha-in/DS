package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		Quiz6 quiz = new Quiz6();
		System.out.println(quiz.getResponse("A quick brown fox jumps over the lay dog"));
		System.out.println(quiz.getWord("BFD"));
		System.out.println(quiz.isWordExists("ESE"));
	}

	public String getResponse(String sentence) {
		String val = sentence.toLowerCase();
		StringBuilder sb = new StringBuilder();
		int a = 'a';
		int z = 'z';
		for (int i = a; i <= z; i++) {
			char value = (char) i;
			if (!val.contains("" + value)) {
				sb.append("" + value);
			}
		}
		return sb.length() > 0 ? sb.toString() : null;
	}

	public boolean getWord(String word) {
		char letters[] = word.toCharArray();
		int k = 0;
		boolean flag = false;
		String sample[][] = { { "A", "B", "C", "E" }, { "C", "F", "C", "S" }, { "A", "D", "E", "E" } };
		SOS: {
			int row = sample.length;
			int column = 0;
			for (int i = 0; i < sample.length; i++) {
				for (int j = 0; j < sample[i].length; j++) {
					System.out.println("i=" + i + " j=" + j + " sample=" + sample[i][j]);
					if (sample[i][j].equals("" + letters[k])) {
						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}
						k++;
					} else {
						flag = false;
						k = 0;
					}
					if (i == 0) {
						column++;
					}
				}
			}
			k = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < row; j++) {

					if (("" + sample[j][i]).equals("" + letters[k])) {
						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}
						if (j == row - 1) {
							k = 0;
						} else {
							k++;
						}

					} else {
						flag = false;
						k = 0;
					}
				}
			}

		}

		return flag;
	}

	public boolean isWordExists(String word) {
		boolean flag = false;
		String arr[][] = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
		char letter[] = word.toCharArray();
		int column = 0;
		int k = 0;
		SOS: {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals("" + letter[k])) {
						if (k == letter.length - 1) {
							flag = true;
							break SOS;
						}
						k++;

					} else {
						k = 0;
					}
					if (i == 0) {
						column++;
					}
				}
			}
			k = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j][i].equals("" + letter[k])) {
						if (k == letter.length - 1) {
							flag = true;
							break SOS;
						}
						if (j == arr.length - 1) {
							k = 0;
						} else {
							k++;
						}

					} else {
						k = 0;
					}
				}
			}

		}
		return flag;
	}

	public String getResponse1(String word) {
		int a = 'a';
		int z = 'z';
		StringBuilder sb = new StringBuilder();
		for (int i = a; i <= z; i++) {
			if (!word.contains("" + (char) i)) {
				sb.append("" + (char) i);
			}
		}
		return (sb.length() != 0) ? sb.toString() : null;

	}

	public boolean isWordExists1(String word) {
		String arr[][] = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
		char letters[] = word.toCharArray();
		boolean flag = false;
		int column = 0;
		int k = 0;
		SOS: {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (("" + letters[k]).equals("" + arr[i][j])) {

						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}
						k++;
					} else {
						k = 0;
						flag = false;
					}

					if (i == 0) {
						column++;
					}
					if (j == arr[i].length - 1) {
						k = 0;
					}
				}
			}

			k = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (("" + letters[k]).equals("" + arr[j][i])) {
						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}
						if (j == arr.length - 1) {
							k = 0;
						} else {
							k++;
						}
					} else {
						k = 0;
					}

				}
			}

		}

		return flag;
	}

	public boolean isWordExists2(char[][] matrix, String word) {
		boolean flag = false;
		char letters[] = word.toCharArray();
		int k = 0;
		int column = 0;
		SOS: {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (letters[k] == matrix[i][j]) {
						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}
						k++;
					} else {
						flag = false;
						k = 0;
					}
					if (i == 0) {
						column++;
					}

				}
			}
			k = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (letters[k] == matrix[j][i]) {
						if (k == letters.length - 1) {
							flag = true;
							break SOS;
						}

						if (j == matrix.length - 1) {
							k = 0;
							flag = false;
						} else {
							k++;
						}
					} else {
						flag = false;
						k = 0;
					}
				}
			}

		}

		return flag;
	}

}
