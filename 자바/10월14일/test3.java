package sam;

class Point{
	private int x,y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
	
class ColorPoint extends Point{
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setColor(String color) { 
		this.color = color;
	}
	
	public String toString() {
		String str = color+"색의 ("+getX()+","+getY()+")의 점";
		return str;
	}
	
	void setXY(int x, int y) {
		move(x,y);
	}
}

public class test3 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"RED");
		cp.setXY(10,20);
		cp.setColor("BLUE");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
