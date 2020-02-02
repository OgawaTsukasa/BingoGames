package main;

import java.util.Scanner;

import controller.Play;

public class Main {

	public static void main(String[] args) {

		System.out.println("━━━ビンゴ大会を始めます！━━━");
		System.out.println();
		System.out.println("            " + "↓Enter↓");


		Scanner scan = new Scanner(System.in);
		scan.nextLine();

		new Play().start();
	}

}
