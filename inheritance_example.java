package first_test;

//kedi sınıfımız
class Cat{
	
	public String name;
	public String color;
	public int age;
	public int hungry;
	
	void eatFood(int foodVal) {
		this.hungry += foodVal;
	}
	
}

//kedi sınıfından türetilen, van kedisi sınıfımız
class VanCat extends Cat{
	
}

//kedi sınıfından türetilen, mavi rus kedisi sınıfımız
class BlueRussiaCat extends Cat{
	
}

//kedi sınıfından türetilen, fars kedisi sınıfımız
class PersianCat extends Cat{
	
}

//araba sınıfımız
class Car{

	//field
	public int door;
	public int wheel;
	public int engine;
	int speed;
	
	//methods
	void go(int speed) {
		System.out.println("Gaza basıldı");
		if(this.speed == 0) {
			System.out.println("araç hareket etmeye başladı");
		}
		this.speed += speed;
	}
	public int stop(int speed) {
		System.out.println("Frene basıldı");
		this.speed -= speed;
		
		if(this.speed <= 0) {
			this.speed = 0;
			System.out.println("araç durdu");
		}
		return this.speed;
		
	}
	
	//main constructor
	public Car(){
		this.door = 4;
		this.wheel = 4;
		this.engine = 1;
		this.speed = 0;
	}
	
	//params constructor
	public Car(int door, int wheel, int engine, int speed) {
		this.door = door;
		this.wheel = wheel;
		this.engine = engine;
		this.speed = speed;
	}
	
	//all variable getter
	public int getDoor() {
		return door;
	}
	public int getWheel() {
		return wheel;
	}
	public int getEngine() {
		return engine;
	}
	public int getSpeed() {
		return speed;
	}
	
	//all variable setter
	public void setDoor(int door) {
		this.door = door;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

//Araba sınıfımızdan türetilen Mercedes sınıfımız
class Mercedes extends Car{
	
}

public class inhertitance_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kedi ve alt nesnelerimiz
		VanCat cat1 = new VanCat();
		BlueRussiaCat cat2 = new BlueRussiaCat();
		PersianCat cat3 = new PersianCat();
		
		cat1.name = "Tarçın";
		cat2.color = "blue";
		cat3.age = 3;
		
		System.out.println(cat1.name);
		System.out.println(cat2.color);
		System.out.println(cat3.age + "\n");
		
		//araba ve alt nesnelerimiz
		Mercedes c250 = new Mercedes();
		
		c250.go(100);
		
		System.out.println(c250.getSpeed());
		
		c250.go(20);
		
		System.out.println(c250.getSpeed());
		
		c250.go(30);
		
		System.out.println(c250.getSpeed());
		
		c250.stop(45);
		
		System.out.println(c250.getSpeed());

		c250.stop(435);
		
		System.out.println(c250.getSpeed());
		
		c250.go(10);
		
		System.out.println(c250.getSpeed());
		
		c250.stop(10);
		
		System.out.println(c250.getSpeed());
	
	}
}
