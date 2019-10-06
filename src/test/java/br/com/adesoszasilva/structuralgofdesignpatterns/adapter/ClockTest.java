package br.com.adesoszasilva.structuralgofdesignpatterns.adapter;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class ClockTest {

	@Test
	public void testGetToday() {
		Clock clock = new Clock();
		Calendar instance = Calendar.getInstance();
		Calendar today = clock.getToday();
		
		assertTrue(clock.isSameDay(instance, today));
	}

}
