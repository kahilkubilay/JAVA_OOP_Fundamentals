package first_test;

class Cat{
	
	public String name;
	public int age;
	
	
	//default constructor
	public Cat() {
		this.name = "İsim değeri girilmedi";
		this.age = 0;
	}
	
	//params constructor
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void ioCat(){
		System.out.println("Kedimizin adı: " + this.getName()
				+ "\nKedimizin yaşı: " + this.getAge()
				+ "\nKedimiz göz renkleri farklı değildir."  + "\n");
	}
	
}

class VanCat extends Cat{
	private boolean eyeColor;
	
	//params constructor 
	public VanCat(String name, int age, boolean eyeColor) {
		super(name, age);
		this.eyeColor = eyeColor;
	}
	
	//get eyeColor
	public boolean getEyeColor() {
		return this.eyeColor;
	}
	
	//set eyeColor
	public void setEyeColor(boolean eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public void ioCat() {
		if(this.eyeColor == true) {
			System.out.println("Kedimizin adı: " + this.getName()
			+ "\nKedimizin yaşı: " + this.getAge()
			+ "\nKedimiz göz renkleri farklıdır."  + "\n");
		}else {
			System.out.println("Kedimizin adı: " + this.getName()
			+ "\nKedimizin yaşı: " + this.getAge()
			+ "\nKedimiz göz renkleri farklı değildir." 
			+ "\nNesne yanlış yerde tanımlanmıştır, lütfen ait olduğu sınıfı düzeltiniz." + "\n");
		}
	}
	
}

public class polymorphism_example {

	public static void main(String[] args) {
		// TODO polymorphism
		
		Cat cat1, cat2, cat3;
		
		cat1 = new Cat("Tarçın", 2);
		cat2 = new VanCat("Mesir", 3, true);
		cat3 = new VanCat("Macun", 4, false);
		
		cat1.ioCat();
		cat2.ioCat();
		cat3.ioCat();

	}

}
