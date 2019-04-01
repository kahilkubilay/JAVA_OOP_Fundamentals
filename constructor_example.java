package first_test;

import java.util.Scanner;

//kedi nesnemiz
class Cat{
	
	String name;
	String color;
	int age;
	int hungry;
	
	void eatFood(int foodVal) {
		this.hungry += foodVal;
	}
	
	//constructor classımız
	public Cat() {
		this.name = "isim değeri girilmedi";
		this.color = "renk değeri girilmedi";
		this.age = 0;
		this.hungry = 0;
		
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat(String name, String color, int age, int hungry) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.hungry = hungry;
	}
	
}

class Book{
	
	String name;
	String author;
	double price;
	int pageNumb;
	
	//parametresiz constructor
	// ****constructor kullanmak istiyorsak, muhakkak parametresiz bir constructor yapısı
	//oluşturmamız gerekiyor.
	public Book() {
		this.name = "kitap ismi girilmedi";
		this.author = "kitap yazarı girilmedi";
		this.price = 0.0;
		this.pageNumb = 0;
	}
	
	//parametreli constructor
	public Book(String name, String author, double price, int pageNumb) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.pageNumb = pageNumb;
	}
	
	//
	
}

public class constructor_example {

	public static void main(String[] args) {
		// TODO constructor
		
		//kedi nesnemiz
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat("Mesir", "gri", 2, 3);
		
		cat2.name = "Tarcin";
		cat2.age = 2;
		
		System.out.println(cat1.name + "\n"
				+ cat1.color + "\n"
				+ cat1.age + "\n"
				+ cat1.hungry + "\n");
		
		System.out.println(cat2.name + "\n"
				+ cat2.color + "\n"
				+ cat2.age + "\n"
				+ cat2.hungry + "\n");
		
		System.out.println(cat3.name + "\n"
				+ cat3.color + "\n"
				+ cat3.age + "\n"
				+ cat3.hungry + "\n");
		
		//kitap nesnemiz 
		Book book1 = new Book();
		Book book2 = new Book("Fırat Suyu Kan Akıyor Baksana", "Yaşar Kemal", 21.11, 328);
		Book book3 = new Book();
		
		book1.name = "Devlet Ana";
		book1.author = "Kemal Tahir";
		book1.price = 22.78;
		book1.pageNumb = 651;
		
		System.out.println("\nKitap adı: " + book1.name
				+ "\nKitap yazarı: " + book1.author 
				+ "\nKitap fiyatı: " + book1.price 
				+ "\nKitap sayfa sayısı: " + book1.pageNumb);
		
		System.out.println("\nKitap adı: " + book2.name
				+ "\nKitap yazarı: " + book2.author 
				+ "\nKitap fiyatı: " + book2.price 
				+ "\nKitap sayfa sayısı: " + book2.pageNumb);
		
		//Veri girişi yaparak yeni bir kitap nesne olusturalım.
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nBir kitap nesnesi olusturacağiz. Asagidaki bilgileri giriniz.");
		System.out.print("Kitap adı: " );
		book3.name = input.nextLine();
		System.out.print("Kitap yazarı: " );
		book3.author = input.nextLine();
		System.out.print("Kitap fiyatı: " );
		book3.price = input.nextDouble();
		System.out.print("Kitap sayfa sayısı: " );
		book3.pageNumb = input.nextInt();
		
		input.close();
		
		System.out.println("\nOluşturduğunuz nesnemizin özellikleri: ");
		System.out.println("Kitap adı: " + book3.name
				+ "\nKitap yazarı: " + book3.author
				+ "\nKitap fiyatı: " + book3.price
				+ "\nKitap sayfa sayısı: " + book3.pageNumb);
		
		System.exit(0);
		
	}

}
