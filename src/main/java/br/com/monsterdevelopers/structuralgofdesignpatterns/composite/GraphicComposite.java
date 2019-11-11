package br.com.monsterdevelopers.structuralgofdesignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicComposite implements Graphic {

	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	@Override
	public String print() {
		String response = "";
		for (Graphic graphic : childGraphics) {
			response += "graphic:" + graphic.print() + " ";
		}
		return response;

	}

}
