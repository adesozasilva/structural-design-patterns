package br.com.monsterdevelopers.structuralgofdesignpatterns.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public String play(List<MusicalNote> song) {
		Player player = new Player();

		StringBuilder chords = new StringBuilder();
		for(MusicalNote note : song) {
			chords.append(note.simbol() + " ");
		}

		player.play(chords.toString());
		
		System.out.println(chords.toString());

		return chords.toString();
	}

}
