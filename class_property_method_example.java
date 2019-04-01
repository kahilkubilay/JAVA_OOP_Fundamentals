package mediumBlog;

import java.util.Scanner;

//kedi nesnemiz
class Cat {
	
	String name;
	String color;
	int age;
	int hungry;
	
	void eatFood(int foodVal) {
		this.hungry += foodVal;
	}
		
}

//bilgisayar nesnemiz
class Computer{
	
	String brand = "bilgisayar markası girilmedi."; //default değerimiz
	String processor_name = "İşlemci markası girilmedi."; //default değerimiz
	double processor_ghz = 0.0; //default değerimiz
	double price = 0.0; //default değerimiz
	int ram = 0; //default değerimiz
	
	void io_method(String value) {
		System.out.println(value);
	}
	
}

//üniversite nesnemiz
class university{
	
	String name;
	String department;
	int years;
	
	void io_university_info(String name, String department, int years) {
		this.name = name; //atama işlemini yaptığımız değişkenler,
		this.department = department; //parametremizden gelecek olan değişkeni
		this.years = years; //classımız içerisinde bulunan değere atayacaktır.
		
		System.out.println("\nDeğişiklikler kaydedildi..");
		System.out.println("Üniversite adı: " + this.name
				+ "\nÜniversite bölümü: " + this.department 
				+ "\nÖğrenim süresi: " + this.years);
	}
	
}

public class OOP_examples {

	public static void main(String[] args) {
		
		//kedi nesnemiz
		Cat cat1 = new Cat();
		
		cat1.name = "Tarcin";
		cat1.color = "yellow";
		cat1.age = 3;
		cat1.hungry = 2;
		
		System.out.println("Kedinin ismi: " + cat1.name + "\nKedinin yaşı: " + cat1.age + "\nKedinin rengi: " + cat1.color);
		System.out.println("Kedinin açlık durumu: " + cat1.hungry);
		
		cat1.eatFood(3);
		
		System.out.println("Kedinin açlık durumu: " + cat1.hungry);
		
		//bilgisayar nesnemiz 
		Computer asus = new Computer();
		
		asus.brand = "asus";
		asus.price = 2.130;
		asus.processor_name = "Intel(R) Core i5-5200";
		asus.processor_ghz = 3.40;
		asus.ram = 4;
		
		asus.io_method("\nBilgisayar I_O methodlarını uygular..");
		System.out.println("Sistem Özellikleri"
				+ "\nMarka: " + asus.brand
				+ "\nFiyat: " + asus.price
				+ "\nİşlemci modeli: " + asus.processor_name
				+ "\nİşlemci Dönüş Hızı: " + asus.processor_ghz
				+ "\nRAM: " + asus.ram);
		
		//üniversite nesnemiz
		university uni_1 = new university();
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nÜniversite adını giriniz: ");
		uni_1.name = input.nextLine(); 
		System.out.print("Bölüm adını giriniz: ");
		uni_1.department = input.nextLine();
		System.out.print("Öğrenim süresini giriniz: ");
		uni_1.years = input.nextInt();
		
		input.close();
		
		uni_1.io_university_info(uni_1.name, uni_1.department, uni_1.years);
		
    		System.exit(0);
	}

}
