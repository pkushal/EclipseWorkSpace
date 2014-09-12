package edu.ee553.flashcard;

public class FlashCardCollection {
	
	private FlashCard[] flashCards;
	private int counter; 
	
	public FlashCardCollection(int size){
		flashCards = new FlashCard[size];
		counter = 0;
	}
	
	public void addFlashCard(FlashCard f){
		
		if(counter >= flashCards.length){
			System.out.println("No space in the collection.");
			return;
		}
		
		flashCards[counter] = f;
		counter++;
	}
	
	public FlashCard searchByQuestion(String question){
		FlashCard searchResult = null;
		
		for(int i=0;i<flashCards.length;i++){
			if(question.equals(flashCards[i].getQuestion())){
				searchResult = flashCards[i];
				break;
			}
		}
		
		return searchResult;
	}
	
}
