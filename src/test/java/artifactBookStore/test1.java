package artifactBookStore;


import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		BookStore bs1 = new BookStore();
		int genreCount;
		genreCount = bs1.getGenreCount("fantasy");
		assertEquals(2, genreCount );
	}

}
