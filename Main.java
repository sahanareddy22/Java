package string1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str = sc.nextLine();
		for (int i = 1; i <= str.length(); i++) {
			System.out.println(str.substring(0, i));

		}
		sc.close();
	}

}
