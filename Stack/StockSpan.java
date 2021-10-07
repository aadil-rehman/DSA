package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] span = new int[arr.length];
		span[0] = 1;
		Arrays.fill(span, 1);
		for(int curr=1; curr<arr.length; curr++) {
			for(int left = curr-1; left>=0; left--) {
				if(arr[left] < arr[curr]) {
					span[curr]++;
				} else {
					break;
				}
			}
		}
		for(int i=0; i<span.length; i++) {
			System.out.print(span[i] + " ");
		}
		System.out.print("END");
	}
	/************Using STack*************/
/*	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int[] span = new int[arr.length];
	span[0] = 1;
	Stack<Integer> st = new Stack<>();
	st.push(0);
	for(int i=1; i<arr.length; i++) {
		while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
			st.pop();
		}
		span[i] = st.isEmpty() ? i + 1 : i-st.peek();
		st.push(i);
	}
	for(int i=0; i<span.length; i++) {
		System.out.print(span[i] + " ");
	}
	System.out.print("END");

	
	} */
}


