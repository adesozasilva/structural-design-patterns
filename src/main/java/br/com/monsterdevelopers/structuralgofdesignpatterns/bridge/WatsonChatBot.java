package br.com.monsterdevelopers.structuralgofdesignpatterns.bridge;

public class WatsonChatBot implements ChatBot {

	@Override
	public String talk(String message) {
		String answer = "";
		switch (message) {
		case "Hello":
			answer = "Hi!";
			break;
		case "Hey":
			answer = "Hey!";
			break;
		default:
			break;
		}
		return answer;
	}

}
