package br.com.monsterdevelopers.structuralgofdesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicalNotes {
	
	private static Map<String, MusicalNote> musicalNotes = 
			new HashMap<String, MusicalNote>();

	    static {
	        musicalNotes.put("do", new Do());
	        musicalNotes.put("re", new Re());
	        musicalNotes.put("mi", new Mi());
	        musicalNotes.put("fa", new Fa());
	        musicalNotes.put("sol", new Sol());
	        musicalNotes.put("la", new La());
	        musicalNotes.put("si", new Si());

	    }

	public MusicalNote get(String name) {
		return musicalNotes.get(name);
	}

}
