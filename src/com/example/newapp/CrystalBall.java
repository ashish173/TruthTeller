package com.example.newapp;

import java.util.Random;

public class CrystalBall {
	// member variables
	String[] answers = { "It is certain",
			"It is decidedly so",
			"All signs are saying so",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now" };

	// member functions
	String getAnAnswer() {
		
			// when the answer button was clicked, so update the answer label to an answer
			String answer = null;
			
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(answers.length);
			answer = answers[randomNumber];
			return answer;
	}
}
