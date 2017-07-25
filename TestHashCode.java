
public class TestHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 =new Circle(3,6);
		Circle circle2 =new Circle(3,6);
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		
		Dog dog1 =new Dog("scobby","black",2,30);
		Dog dog2 =new Dog("scobby","black",2,30);
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());

		MountainBike mountainbike1=new MountainBike(60,4,"High","MountainBike");
		MountainBike mountainbike2=new MountainBike(60,4,"High","MountainBike");
		System.out.println(mountainbike1.hashCode());
		System.out.println(mountainbike2.hashCode());
	}

}
