package artifactBookStore;


import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		BookStore bs1 = new BookStore();
		
		int count = 0;
		for(int i=0; i<bs1.array1.size(); i++)
		{
			String genreString = bs1.array1.get(i).getGenre();
			if (genreString.equals("fantasy"))
			{
				count++;
			}
		}
		assertEquals(2, count);
	}

}
