package reversetherange;

import java.util.Scanner;

class Rev{
	public static int verify(int A[])
	{
		Scanner sc = new Scanner(System.in);
		int size = A.length;
		int B = sc.nextInt();
		int C = sc.nextInt();
		while(B<C) {
			int temp = A[B];
			A[B] = A[C];
			B++;
			C--;
			}
		return B;
		}
	
}

public class RevRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Rev Array = new Rev();
		int pair = Rev.verify(arr);
		System.out.println("Count Number:"+pair);

	}

}
