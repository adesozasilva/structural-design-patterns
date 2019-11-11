package br.com.monsterdevelopers.structuralgofdesignpatterns.composite;

public class Program {

    public static void main(String[] args) {
    	
        Ellipse ellipse = new Ellipse();
        Rectangle rectangle = new Rectangle();

        GraphicComposite graphic = new GraphicComposite();

        graphic.add(ellipse);
        graphic.add(rectangle);
        graphic.print();
    }
}