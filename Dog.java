import java.util.Objects;

public class Dog {
	String name;
	String color;
	int age;
	double weight;
	Dog(String name,String color,int age,double weight){
		this.name=name;
		this.color=color;
		this.age=age;
		this.weight=weight;
		
	}
	public boolean equals(Object obj) {
		Dog dog2 = (Dog)obj;
		if(this.name.equals(dog2.name)&&this.color.equals(dog2.color)&&this.age==dog2.age&&this.weight==dog2.weight) {
			return true;
		}
		return false;
		
	}
	public int hashCode() {
        return Objects.hash(name,color,age,weight);
    }
	public void dogProp()
	{
		System.out.println("Name :"+name);
		System.out.println("color :"+color);
		System.out.println("age :"+age);
		System.out.println("weight :"+weight);
		
	}
	
	public void bark() {
		System.out.println("bow bow");
	}
	public void eat() {
		System.out.println("eat eat eat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d1=new Dog("scobby","black",2,30);
     d1.dogProp();
     d1.bark();
     d1.eat();

	}

}
