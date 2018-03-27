
public class Rectangle extends Shape{
	private int width;
	private int height;
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
double area(){
	return (double) width * height;
}

void draw() {
	System.out.println("(" + this.getX() + "," + this.getY() +")위치에" + "가로" + width + "세로" + height );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r1 = new Rectangle();
       Rectangle r2 = new Rectangle();
       
       r1.setX(8);
       r1.setY(9);
       r1.setWidth(10);
       r1.setHeight(20);
       
       r2.setX(8);
       r2.setY(9);
       r2.setWidth(10);
       r2.setHeight(20);
       
       r1.print();
       r1.draw();
       r2.print();
       r2.draw();
       
       
       
	}

}
