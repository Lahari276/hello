package collections;
import java.util.Queue;

public class BooksPriorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Book> queue=BooksData.getBookData();
		for(Book b:queue) {
			System.out.println(b.id+" "+b.bookname+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}