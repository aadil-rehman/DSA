package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNumberFromGivenSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sArray = new String[n];
		for(int i=0; i<sArray.length; i++) {
			sArray[i] = sc.next();
		}
		
        for(int i=0; i<sArray.length; i++) {
        	Stack<Integer> stack = new Stack<>();
    		for(int j = 0;  j <= sArray[i].length(); j++) {
    			stack.push(j + 1);

    			if(j == sArray[i].length() || sArray[i].charAt(j) == 'I') {
    				while(!stack.isEmpty()) {
    					System.out.print(stack.pop());
    				}
    			}
    		}
    		System.out.println();
        }
		
	}
}