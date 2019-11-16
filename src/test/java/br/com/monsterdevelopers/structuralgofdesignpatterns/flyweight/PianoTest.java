package br.com.monsterdevelopers.structuralgofdesignpatterns.flyweight;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PianoTest {

	private List<MusicalNote> song;
	private Piano piano;
	private String chords;

	@Test
	public void testPlay() {
		givenMusicalNotes();
		
		whenPlayThePiano();
		
		thenReturnShouldBe();

	}

	private void thenReturnShouldBe() {
		assertEquals(chords, "C D E F F F ");
		
	}

	private void whenPlayThePiano() {
		piano = new Piano();
		chords = piano.play(song);
		
	}

	private void givenMusicalNotes() {
		MusicalNotes musicalNotes = new MusicalNotes();
		song = Arrays.asList(
				musicalNotes.get("do"),    
				musicalNotes.get("re"),    
				musicalNotes.get("mi"),    
				musicalNotes.get("fa"),    
				musicalNotes.get("fa"),    
				musicalNotes.get("fa")
				);

	}

}
