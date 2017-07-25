import java.util.Objects;

public class MountainBike extends Bicycle{
	

    String Name;
	String seatHeight;
	public MountainBike(int speed, int gears,String seatHeight,String Name) {
		super(speed, gears);
		// TODO Auto-generated constructor stub
	this.seatHeight=seatHeight;
	this.Name=Name;
	
	}
	public boolean equals(Object obj) {
		MountainBike mountainbike2=(MountainBike) obj;
		if(this.speed==mountainbike2.speed&&this.gears==mountainbike2.gears&&this.seatHeight.equals(mountainbike2.seatHeight)&&this.Name.equals(mountainbike2.Name))
		{
			return true;
		}
		return false;
		
	}
	public int hashCode() {
        return Objects.hash(speed,gears,seatHeight,Name);
    }
	void bikeDetails() {
		System.out.println("Name :"+Name+"\nSpeed :"+speed+"\nGears :"+gears+"\nseatHeight :"+seatHeight);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
