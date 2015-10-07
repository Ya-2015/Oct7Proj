package Book;

public class Book {
	private String id;
	private String description;
	private String title;
	private double unitPrice;
	private String author;
	private boolean isTaxable;
	
	public Book(){
		this.setId("");
		this.setDescription("");
		this.setTitle("");
		this.setUnitPrice(0);
		this.setAuthor("");
		this.setTaxable(false);
		
	}
	
	public Book(String id, String des, String title, double unitPrice, String author, boolean isTaxable){
		this.id = id;
		this.description = des;
		this.title = title;
		this.unitPrice = unitPrice;
		this.author = author;
		this.isTaxable = isTaxable;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isTaxable() {
		return isTaxable;
	}
	public void setTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}
	
	public String  getDisplayText(){
		return author + "\n" + title + "\n" + description;
	}
	
}
