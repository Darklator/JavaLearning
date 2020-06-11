public class SimpleDotCom {
	
	int[] locationCells;
	boolean[] guessed;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		guessed = new boolean[locationCells.length];
		for (int set = 0; set < locationCells.length; set++)
			guessed[set] = false;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Мимо";
		for (int cell = 0; cell < locationCells.length; cell++) {
			
			if ((guess == locationCells[cell])&&(guessed[cell]==false)) {
				result = "Попал";
				guessed[cell] = true;
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "Потопил";
		}
		System.out.println(result);
			return result;
	}
}