package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {
	
	SolutionIterator iterSol= new SolutionIterator();
	Solution sol = new Solution();
	SolutionList solList= new SolutionList();
	@Test
	void testSolutionIterator() {
		System.out.println("SolutionIterator object was created!");
	}

	@Test
	void testSolutionIteratorSolutionList() {
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		assertTrue(iterSol.hasNext());

	}

	@Test
	void testMoveToHead() {
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		iterSol.MoveToHead();
		assertEquals(-1, iterSol.getCurrentSolutionNumber());
		
	}

	@Test
	void testHasNext() {
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		assertTrue(iterSol.hasNext());

		
	}

	@Test
	void testNext() {
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		assertNotNull(iterSol.next());
	}

	@Test
	void testNextString() {
		sol.setTheAuthor("Jubanjan");
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		assertNotNull(iterSol.next("Jubanjan"));

	}

	@Test
	void testRemove() {
		solList.add(sol);
		SolutionIterator iterSol= new SolutionIterator(solList);
		int quantity=iterSol.solutionlist.size();
		iterSol.next();
		iterSol.remove();
		assertEquals(quantity-1,iterSol.solutionlist.size());
		
	}

}
