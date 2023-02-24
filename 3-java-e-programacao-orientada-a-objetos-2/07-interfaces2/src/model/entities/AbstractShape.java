package model.entities;

import model.enums.Color;

// Realiza a interface Shape mas ainda é uma classe genérica/abstrata. Não implementa area()
public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
