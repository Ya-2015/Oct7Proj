package InheritanceCompletion;

public class Tester {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.toString());
//		System.out.printf("Count: %d\n",Product.getCount());
		
		Book b = new Book();
		b.setAuthor("Liu");
		b.setCode("001");
		b.setDescription("A love book");
		b.setPrice(9.9);
		System.out.println(b.toString());
		System.out.printf("Count: %d\n\n",Product.getCount());
		
		Book b2 = new Book();
		System.out.println(b2.toString());
		System.out.printf("Count: %d\n\n",Product.getCount());
		
		Software s = new Software();
		System.out.println(s.toString());
		System.out.printf("Count: %d\n\n",Product.getCount());
		
		Software s2 = new Software();
		s2.setCode("003");
		s2.setDescription("Visual Studio");
		s2.setPrice(180);
		s2.setVersion("2014");
		System.out.println(s2.toString());
		System.out.printf("Count: %d\n\n",Product.getCount());
	}
}
