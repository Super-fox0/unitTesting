package artifactBookStore;

import java.util.ArrayList;
import java.util.HashMap;

public class BookStore {
	
	HashMap<String,Book> map1 = new HashMap<String,Book>();
	ArrayList<Book> array1 = new ArrayList<Book>();
	
	Book b1 = new Book("book1","fantasy");
	Book b2 = new Book("book2","horror");
	Book b3 = new Book("book3","fantasy");
	
	BookStore()
	{
		addToArray();
	}
	
	public void addToArray()
	{
		array1.add(b1);
		array1.add(b2);
		array1.add(b3);
	}

	public int getGenreCount(String genre)
	{
		int count = 0;
		String genreString;
		for(int i=0; i<array1.size(); i++)
		{
			genreString = array1.get(i).getGenre();
			if (genreString.equals(genre))
			{
				count++;
			}
		}
		return count;
	}
}
