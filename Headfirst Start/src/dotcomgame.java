
public class dotcomgame {
		public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
// DECLARE an int array to hold the location cells. call is locationCells.
	int [] locationCells;
// DECLARE1an int to hold the number of hits. call it numOfHits and set it to 0.
	int numOfHits = 0;
//DECLARE a checkYourself() method that takes a String for the user's guess
public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		//DECLARE a var to hold the result well return
		String result = "miss";
//DECLARE a setLocationCells() setter method that takes an int array (which has the cell locations as ints)
	//METHOD String checkYourself(String userGuess)

	//GET the user guess as a String parameter
	//CONVERT the user guess to an int
	//REPEAT with each of the location cells in the int array
			
		//COMPARE the user guess to the location cell
				for (int cell : locationCells) { 
					//this is declaring a var that will hold 1 element from the array. 
					//everytime it goes through this loop this var will hold a diff element 
					//from the array untill there are no more elements locationCells being the array

	//IF the user guess matches
					if (guess == cell) {
						result = "hit";

		//INCREMENT the number of hits
						numOfHits++; //same thing as saying 'numOfHits = numOfHits + 1'
						break;
				}
			}
		//FINDOUT if it was the last location cell
	
				//IF number of hits is 3 RETURN "kill" as the result
			if (numOfHits == locationCells.length) {
			result = "kill";
		}
			//ELSE it was not a kill so RETURN "hit"
			// END IF
			//ELSE the user guess did not match so RETURN "miss"
//END IF
	
	//END REPEAT
//END METHOD		
			System.out.println(result);
			return result;
}
}

	
//METHOD void setLocationCells(int[] cellLocations)
	//GET the cell locations as an int array parameter
	//ASSIGN the cell locations parameter to the cell locations instance var
	//END METHOD
	
	

