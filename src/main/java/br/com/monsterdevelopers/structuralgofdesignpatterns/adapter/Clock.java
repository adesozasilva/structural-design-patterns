package br.com.monsterdevelopers.structuralgofdesignpatterns.adapter;

import java.util.Calendar;

public class Clock {
	
	public Calendar getToday() {
		return Calendar.getInstance();
	}
	
	public boolean isSameDay(Calendar date, Calendar otherDate) {
	    if (date == null || otherDate == null)
	        return false;
	    return (date.get(Calendar.ERA) == otherDate.get(Calendar.ERA)
	            && date.get(Calendar.YEAR) == otherDate.get(Calendar.YEAR) 
	            && date.get(Calendar.DAY_OF_YEAR) == otherDate.get(Calendar.DAY_OF_YEAR));
	}

}
