package InheritanceCompletion;

public class Book extends Product
{
    private String author;

    public Book()
    {
        super();
    	author = "001";
    	count++;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor(){
    return author;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}