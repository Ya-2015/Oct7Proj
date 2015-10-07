package Book;

public class BookApp {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setAuthor("Jane Austen");
		book.setId("1");
		book.setDescription("This is a romantic love book.");
		book.setTaxable(true);
		book.setTitle("Pride and Prejudice");
		book.setUnitPrice(9.9);
		
		System.out.println(book.getDisplayText());
	}
}
