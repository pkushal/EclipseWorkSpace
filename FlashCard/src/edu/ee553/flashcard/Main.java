package edu.ee553.flashcard;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//object creation of Type(class) FlashCardCollection
		FlashCardCollection flashCardCollection = new FlashCardCollection(5);
		
		//add knowledge base
		setQuestionAnswers(flashCardCollection);
		
		//ask user some question
		while(true){
			System.out.println("Enter Question <Enter e to exit> : ");
			String q = scanner.nextLine();
			if(q.equals("e")) break;
			FlashCard result = flashCardCollection.searchByQuestion(q);
			
			if(result == null){
				System.out.println("No entry in the collection.");
			}else
				System.out.println("Answer is :"+result.getAnswer());
		}
		
		//
	}
	
	
	
	
	
	public static void setQuestionAnswers(FlashCardCollection flashCardCollection){
		
		flashCardCollection.addFlashCard(new FlashCard("Nepal", "Kathmandu"));
		flashCardCollection.addFlashCard(new FlashCard("USA", "W DC"));
		flashCardCollection.addFlashCard(new FlashCard("China", "Beijing"));
		flashCardCollection.addFlashCard(new FlashCard("Bhutan", "Thimpu"));
		flashCardCollection.addFlashCard(new FlashCard("Japan", "Tokyo"));
	}

}
