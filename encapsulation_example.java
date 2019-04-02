package first_test;

import java.util.Scanner;

//kedi nesnemiz
class Cat{
	
	public String name;
	public String color;
	private int age;
	int hungry;
	
	void eatFood(int foodVal) {
		this.hungry += foodVal;
	}
	
	//main constructor
	public Cat() {
		this.name = "isim degeri girilmedi.";
		this.color = "renk degeri girilmedi.";
		this.age = 0;
		this.hungry = 0;
	}
	
	//parameters constructor
	public Cat(String name, String color, int age, int hungry) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.hungry = hungry;
	}
	
	//getter age
	public int getAge() {
		return age;
	}
	
	//setter age
	public void setAge(int age) {
		this.age = age;
	}
	
}

//kitap nesnemiz
class Book{
	
	private String name;
	private String author;
	private double price;
	private int pageNumb;
	
	//main constructor
	public Book() {
		this.name = "name değeri girilmedi";
		this.author = "yazar değeri girilmedi";
		this.price = 0.0;
		this.pageNumb = 0;
	}
	
	//param constructor
	public Book(String name, String author, double price, int pageNumb) {
		this.name = name;
		this.author= author;
		this.price = price;
		this.pageNumb = pageNumb;
	}
	
	//getter all variable
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getPageNumb() {
		return pageNumb;
	}
	
	//setter all element
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPageNumb(int pageNumb) {
		this.pageNumb = pageNumb;
	}
	
	//her nesne için tek tek yazdırma yapmak yerine, method belirleyerek
	//tek kod içerisinde birden fazla işlemi yapabiliriz.
	public void book_info_io() {
		System.out.println("Kitap adı: " + this.name
				+ "\nKitap yazarı: " + this.author 
				+ "\nKitap fiyatı: " + this.price 
				+ "\nKitap sayfa sayısı: " + this.pageNumb );
	}
}

//bilgisayar nesnemiz
class Computer{

	private String brand;
	private String processor_name;
	private double processor_ghz;
	private int ram;
	
	//main(default) constructor
	public Computer() {
		this.brand = "Marka değeri girilmedi";
		this.processor_name = "İşlemci değeri girilmedi";
		this.processor_ghz = 0.0;
		this.ram = 0;
	}
	
	//params constructor
	public Computer(String brand, String processor_name, double processor_ghz, int ram) {
		this.brand = brand;
		this.processor_name = processor_name;
		this.processor_ghz = processor_ghz;
		this.ram = ram;
	}
	
	//getter all element
	public String getBrand() {
		return brand;
	}
	public String getProcessorName() {
		return processor_name;
	}
	public double getProcessorGHZ() {
		return processor_ghz;
	}
	public int getRam() {
		return ram;
	}
	
	//setter all element
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setProcessorName(String processor_name) {
		this.processor_name = processor_name;
	}
	public void setProcessorGHZ(double processor_ghz) {
		this.processor_ghz = processor_ghz;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	//her nesne için tek tek yazdırma yapmak yerine, method belirleyerek
	//tek kod içerisinde birden fazla işlemi yapabiliriz.
	public void io_variable() {
		System.out.println("\nbook3 nesnesinin özellikleri: ");
		System.out.println(this.brand + "\n"
				+ this.processor_name + "\n"
				+ this.processor_ghz + "\n"
				+ this.ram);
	}
	
}
	
public class encapsulation_example {

	public static void main(String[] args) {
		// TODO encapsulation examples
		
		//kedi nesnemiz
		Cat cat1 = new Cat();
		
		cat1.setAge(2);
		
		System.out.println(cat1.getAge());
		
		//kitap nesnemiz 
		Book book1 = new Book();
		Book book2 = new Book();
		
		
		book1.setName("Fırat Suyu Kan Akıyor Baksana");
		book1.setAuthor("Yaşar Kemal");
		book1.setPrice(13.33);
		book1.setPageNumb(318);
		
		System.out.println("\nbook1 nesnesinin özellikleri:");
		book1.book_info_io();
		
		book2.setName("Devlet Ana");
		book2.setAuthor("Kemal Tahir");
		book2.setPrice(22.78);
		book2.setPageNumb(651);
		
		System.out.println("\nbook2 nesnesinin özellikleri:");
		System.out.println("Kitap adı: " + book2.getName() + 
				"\nKitap yazarı: " + book2.getAuthor() + 
				"\nKitap fiyatı: " + book2.getPrice() + 
				"\nKitap sayfa sayısı: " + book2.getPageNumb());
		
		//bilgisayar nesnesi
		Computer comp1 = new Computer();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nYeni bir bilgisayar nesnesi olusturabilmek için, aşağıdaki bilgileri giriniz.");
		System.out.print("Bilgisayar markasi: ");
		comp1.setBrand(input.nextLine());
		System.out.print("Bilgisayar işlemci modeli: ");
		comp1.setProcessorName(input.nextLine());
		System.out.print("İşlemci dönüş hızı: ");
		comp1.setProcessorGHZ(input.nextDouble());
		System.out.print("ram boyutu: ");
		comp1.setRam(input.nextInt());
		
		comp1.io_variable();
		
		input.close();
		
		System.exit(0);

	}

}
