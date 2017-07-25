import java.util.Objects;

public class Circle {
	int radius;
	int diameter;
	float area;
	float perimeter;
	Circle(int radius,int diameter){
		this.radius=radius;
		this.diameter=diameter;
	}
	public boolean equals(Object obj) {
		Circle circle2 = (Circle)obj;
		if(this.radius==circle2.radius&&this.diameter==circle2.diameter) {
			return true;
		}
		return false;
		
	}
	
	public int hashCode() {
        return Objects.hash(radius, diameter);
    }
	public void calculateArea()
	{
		area=(float) (3.14*radius*radius);
		System.out.println("Area with radius :"+area);
		
		area=(float) (0.25*3.14*diameter*diameter);
		System.out.println("Area with diameter :"+area);
	}
	public void calculatePerimeter()
	{
		perimeter=(float) (2*3.14*radius);
		System.out.println("Perimeter of circle :"+perimeter);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle= new Circle(3,6);
		circle.calculateArea();
		circle.calculatePerimeter();

	}

}
