package br.com.monsterdevelopers.structuralgofdesignpatterns.composite;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphicCompositeTest {

	private Ellipse ellipse;
	private Rectangle rectangle;
	private GraphicComposite graphic;
	private String response;

	@Test
	public void testPrint() {
		givenGraphics();
		
		whenCallPrintGraphicComposite();
		
		thenResponseShouldBe();
	}

	private void thenResponseShouldBe() {
		assertEquals(response, "graphic:Ellipse graphic:Rectangle ");
	}

	private void whenCallPrintGraphicComposite() {
		response = graphic.print();
	}

	private void givenGraphics() {
		ellipse = new Ellipse();
		rectangle = new Rectangle();
		graphic = new GraphicComposite();
		graphic.add(ellipse);
		graphic.add(rectangle);

	}

}
