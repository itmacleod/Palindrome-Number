package palindrome;

public class Main {

	public static void main(String[] args) {
		

	}
	public static boolean isPalindrome(int x) {
		
		//any argument that is of length 1 is going to be considered a palindrome, so return true
		if(String.valueOf(x).length() == 1) {
			return true;
		}else {
			//otherwise, first convert the integer to a string
			String str = String.valueOf(x);
			
			//first marker will be at the 0th index, while the second marker is at the last index
			//if a number is a palindrome, the 0th index number will be the same as the last index number,
			//the 1st index number will be the same as the last index - 1, and so on
			int position1 = 0;
			int position2 = str.length() - 1;
			boolean isPalindrome = false;
			
			//both position markers move inward until their values are equal, once position1's value is greater than positon2's, exit loop
			while(position1 < position2) {
				if(str.charAt(position1) == str.charAt(position2)) {
					isPalindrome = true;
					position1++;
					position2--;
				}else {
					isPalindrome = false;
					break; //immediately break from the loop since it is not a palindrome
				}
			}
			
			return isPalindrome;
		}
		
		
	}

}
