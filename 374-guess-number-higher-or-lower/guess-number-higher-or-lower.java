/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int currGuess = low + ((high - low) / 2);
        while(true){
            int g = guess(currGuess);
            // System.out.println("currGuess = " + currGuess + ", guess = " + g);
            if(g == 0)
                return currGuess;
            else if(g == -1){
                high = currGuess - 1;
            }
            else{
                low = currGuess + 1;
            }
            currGuess = low + ((high - low) / 2);
        }
    }
}