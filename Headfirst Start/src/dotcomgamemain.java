
public class dotcomgamemain {
	//MAIN GAME CODE PREP
	public static void main(String[] args) {
	GameHelper helper = new GameHelper();
	//DECLARE and in var to hold num of user guesses
	int numOfGuesses = 0;
	//MAKE single object for dontcomgame
	dotcomgame dotgame = new dotcomgame();
	//COMPUTER a random number 0-4 that will be the stating location cell pos
	int randomNum = (int) (Math.random() * 5);
	//MAKE a in array using the randomly generated number, incremented by 1 and then 2 
	int[] locations = {randomNum, randomNum+1, randomNum+2};

	//INVOKE the setLocationCells() method on the dotcomgame object
	dotgame.setLocationCells(locations);
	//DECLARE a boolean var named isAlive and set to true
	boolean isAlive = true;
	//WHILE dotcom object is alive
	while(isAlive = true) {
		//GET user for a guess
		String guess = helper.getUserInput("enter a number");
				// INVOKE checkYourself() method on the dotcomgame instance
					String result = dotgame.checkYourself(guess);

				//INVREMENT numOfGuess var
				numOfGuesses++;
				//CHECK for dotcom death
				if (result.equals("kill")) {
				
				//IF result is kill
				
					//SET isAlive var to false
								isAlive = false;

					//PRINT numOfGuess
					System.out.println("you took " + numOfGuesses + " guesses");
				}
	}
	}
}
