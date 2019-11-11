package br.com.monsterdevelopers.structuralgofdesignpatterns.adapter;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import br.com.monsterdevelopers.structuralgofdesignpatterns.adapter.Clock;

public class ClockTest {

	@Test
	public void testGetToday() {
		Clock clock = new Clock();
		Calendar instance = Calendar.getInstance();
		Calendar today = clock.getToday();
		
		assertTrue(clock.isSameDay(instance, today));
	}

}
