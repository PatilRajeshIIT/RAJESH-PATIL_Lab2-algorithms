package com.greatlearning.problem2.services;

public class NotesCount {

	public void noteCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}

			if (amount > 0) {
				System.out.println();
				System.out.println("Exact amount can not be given with the highest denomination.");
			} else {
				System.out.println();
				System.out.println("Your payment approach in order to give minimum number of notes : ");

				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + " : " + notesCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "notes of denomination 0 is invalid");
		}
	}

}
