
public class TandemBike extends Bicycle {
	
	String Name;
	String seatHeight;
	public TandemBike(int speed, int gears,String seatHeight,String Name) {
		super(speed, gears);
		// TODO Auto-generated constructor stub
	this.seatHeight=seatHeight;
	this.Name=Name;
	System.out.println("Name :"+Name+"\nSpeed :"+speed+"\nGears :"+gears+"\nseatHeight :"+seatHeight);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
