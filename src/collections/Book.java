package collections;

public class Book implements Comparable<Book> {
	int id,quantity;
	String author,publisher,bookname;
	public Book(int id,String  author,String publisher,String bookname,int quantity)
	{
		this.id=id;
		this.author=author;
		this.publisher=publisher;
		this.bookname=bookname;
		this.quantity=quantity;
	}
	public int compareTo(Book otherBook)
	{
		if(id>otherBook.id) {
			return 1;
		}else if(id<otherBook.id) {
			return -1;
		}else {
			return 0;
		}
	}
}