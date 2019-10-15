package br.com.monsterdevelopers.structuralgofdesignpatterns.bridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChatBotTest {

	@Test
	public void shouldRetrieveMessageOfChatbot() {
		ChatBot dialogBot = new DialogChatBot();
		ChatBot watsonBot = new WatsonChatBot();
		
		assertEquals("Good Morning", dialogBot.talk("Good Morning"));
		assertEquals("Hi!", watsonBot.talk("Hello"));
	}

}
