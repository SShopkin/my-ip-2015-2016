package javaBegining;

import java.util.EmptyStackException;

public class Room {
	
	private int width;
	private int height;

	//  Alt+Shift+S R to generate getters/setters
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width<=0) {
			throw new EmptyStackException();
		}
		this.width = width;		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if (height<=0) {
			throw new EmptyStackException();
		}
		this.height = height;
	}
	
	
	public int calculateArea() {		
		return height * width;
	}
	
	
	@Override
	public boolean equals(Object obj) {
// 	Optimization:
//		if (obj == this) {
//			return true;
//		}
		if (obj instanceof Room) {
			final Room room2 = (Room) obj;
			return room2.height == height && room2.width == width; 
		}
		return false;
	}

}
