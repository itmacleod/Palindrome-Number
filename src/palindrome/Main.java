package palindrome;

public class Main {

	public static void main(String[] args) {
		
		int x = 232;
		
		System.out.println(isPalindrome(x));
		

	}
	public static boolean isPalindrome(int x) {
		
		String str = String.valueOf(x);
		
		int position1 = 0;
		int position2 = str.length() - 1;
		boolean isPalindrome = false;
		
		while(position1 < position2) {
			if(str.charAt(position1) == str.charAt(position2)) {
				isPalindrome = true;
				position1++;
				position2--;
			}else {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

}
