/**@author Jubanjan Dhar**/
/**@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ListIteratorTest {

	@Test
	void testListIterator() {
		System.out.println("ListOperator object created!!");
	}

	@Test
	void testListIteratorArrayListOfObject() {
		ArrayList<Object> listtest = new ArrayList<>();
		listtest.add(1);
		ListIterator listiterator = new ListIterator(listtest);
		assertEquals(1,listiterator.getTheList().size());
	}

	@Test
	void testHasNext() {
		ArrayList<Object> listtest = new ArrayList<>();
		listtest.add(1);
		ListIterator listiterator = new ListIterator(listtest);
		assertTrue(listiterator.hasNext());
	}

	@Test
	void testNext() {
		ArrayList<Object> listtest = new ArrayList<>();
		listtest.add(1);
		ListIterator listiterator = new ListIterator(listtest);
		assertNotNull(listiterator.next());
		
	}

	@Test
	void testRemove() {
		ArrayList<Object> listtest = new ArrayList<>();
		listtest.add(1);
		ListIterator listiterator = new ListIterator(listtest);
		listiterator.next();
		listiterator.remove();
		assertEquals(0,listiterator.getTheList().size());
		
	}

}
