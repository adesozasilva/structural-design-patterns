package br.com.monsterdevelopers.structuralgofdesignpatterns.bridge;

public class DialogChatBot implements ChatBot {

	@Override
	public String talk(String message) {
		String answer = "";
		
		switch (message) {
		case "Good Morning":
			answer = "Good Morning";
			break;
			
		case "Good Evening":
			answer = "Good Evening";
			break;

		default:
			break;
		}
		return answer;
	}

}
