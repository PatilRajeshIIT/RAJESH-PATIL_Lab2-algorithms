package com.greatlearning.problem2.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.problem2.services.MergeSort;
import com.greatlearning.problem2.services.NotesCount;

public class Driver {

	public static void main(String[] args) {

		// Initialize Scanner
		Scanner sc = new Scanner(System.in);

		// Initialize MergeSort and NotesCount objects
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the size of currency denomination : ");
		int size = sc.nextInt();

		// Initialize the notes array
		int[] notes = new int[size];

		// Get currency denomination value
		System.out.println("Enter currency denomination value : ");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		// Get the amount to pay
		System.out.println("Enter the amount you want to pay : ");
		int amount = sc.nextInt();

		// Merge Sort
		mergeSort.sort(notes, 0, notes.length - 1);

		// countNotes
		System.out.println();
		System.out.println(Arrays.toString(notes));
		;
		notesCount.noteCountImplementation(notes, amount);

	}

}
