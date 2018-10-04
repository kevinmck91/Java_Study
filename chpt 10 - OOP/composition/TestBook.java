package composition;

public class TestBook {

	public static void main(String[] args) {

		// Construct an author instance
		Author[] ArrayOfAuthors = new Author[3] ;
		
		ArrayOfAuthors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		ArrayOfAuthors[1] = new Author("kevin", "kevin@nowhere.com", 'm');
		ArrayOfAuthors[2] = new Author("Jack", "jack@nowhere.com", 'm');
		
		Book dummyBook = new Book("Java for dummy", ArrayOfAuthors, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);  // Test Book's toString()
		
	}


}
