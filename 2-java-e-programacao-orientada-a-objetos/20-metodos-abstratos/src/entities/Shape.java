package entities;

import entities.enums.Color;

// Se a classe possui um método abstrato, ela também é abstrata
public abstract class Shape {

	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Métodos abstratos não possuem implementação. São abstratos quando a classe é genérica demais
	public abstract double area();
	
}
