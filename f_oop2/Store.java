package f_oop2;

public class Store {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		Product p = new Desktop();
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		//여러분이 만든 물건을 구매해주세요
		p = new CellPhone();
		p.info();
		c.buy(p);
		
		
		c.showItem();
	}
}

class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("--------------------------------------");
		System.out.println("상품명 : " + name);
		System.out.println("금   액  : " + price + "원");
		System.out.println("--------------------------------------");
	}
}

class Desktop extends Product{

	Desktop() {
		super("삼성 컴퓨터", 5000000); //부모클래스의 생성자 호출
	}
	
}

class TV extends Product{
	TV(){
		super("LG TV", 10000000);
	}
}

class CellPhone extends Product{
	CellPhone(){
		super("apple iphone", 10000000);
	}
}

class Customer{
	int money = 999999999;
	Product[] item = new Product[10]; //장바구니
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}
	
	void showItem(){
		System.out.println("-----------장바구니-----------");
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				break;
			}
			System.out.println((i + 1) + ". " + item[i].name);
		}
		System.out.println("----------------------------2");
	}
}

