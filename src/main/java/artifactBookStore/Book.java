package artifactBookStore;

public class Book {
	
	String name;
	String genre;
	static int id = 1;
	int actualId = 1;
	
	Book(String n1, String g1)
	{
		this.name = n1;
		this.genre = g1;
		this.actualId = id;
		id++;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public int getId()
	{
		return actualId;
	}

}
