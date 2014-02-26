

	//TEST CODE
		public class dotcomgametest {
			
			public static void main (String[] args) {
		//INSTANTIATE a SimpleDotCom object
				dotcomgame dot = new dotcomgame();
		//ASSIGN it a location (an array or 3 ints like 2,3,4 etc..)
				int[] locations = {2,3,4};
				//INVOKE the setter method on the dotcom
				dot.setLocationCells(locations);
				//MAKE a fake user guess
				String userGuess = "2";
				
		//INVOKE the checkYourself() method passing it the fake user guess
				String result = dot.checkYourself(userGuess);
				String testResult = "failed";
				if (result.equals("hit") ) {
					testResult = "passed";
				}
				
		//PRINT out the result to see if its correct (pass or failed)
		System.out.println(testResult);
			}
		}
