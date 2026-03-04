package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {
	
	@Test
	public void is_list_empty_test() {

		UnsortedList<Integer> empty = MyUnsortedList.of();		
		assertTrue(empty.isEmpty());
	}
	
	@Test
	public void is_list_not_empty_test() {
		
		UnsortedList<Integer> notEmpty = MyUnsortedList.of(1, 2, 3, 4);
		assertFalse(notEmpty.isEmpty());
	}
	
	@Test
	public void list_size_test() {
		
		UnsortedList<Integer> sizerfour = MyUnsortedList.of(1, 2, 3, 4);
		assertEquals(4, sizerfour.size());		
	}
	
	@Test
	public void empty_list_size_test() {
		
		UnsortedList<Integer> empty = MyUnsortedList.of();
		assertEquals(0, empty.size());
		
	}
	
	@Test
	public void prepend_list_test() {
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);
		
		list.prepend(5);
		assertEquals(5, (int)list.pop());
	}
	
	@Test
	public void prepend_empty_list_test() {
		
		UnsortedList<Integer> empty = MyUnsortedList.of();
		
		empty.prepend(8);
		assertEquals(8, (int)empty.pop());
	}
	
	@Test
	public void append_list_test() {
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);

		list.append(5);
		assertEquals(5, (int)list.popLast());
	}

	@Test
	public void append_empty_list_test() {
		
		UnsortedList<Integer> empty = MyUnsortedList.of();
		empty.append(8);
		assertEquals(8, (int)empty.popLast());
	}

	@Test
	public void insert_like_prepend_test() throws Exception{
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);
		
		list.insert(15, 0);
		assertEquals(15, (int)list.remove(0));
	}
	
	@Test
	public void insert_like_append_test() throws Exception{
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);
		
		list.insert(5, 2);
		assertEquals(5, (int)list.remove(2));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void insert_index_higher_than_size_test() throws Exception{
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);
		
		list.insert(5, 5);	

	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void insert_index_lower_than_size_test() throws Exception{
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);

		list.insert(-1, 5);		
	}
	
	@Test
	public void inserts_successives_test() throws Exception{
		
		UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 7);		
		list.insert(40, 3);
		
		list.insert(50, 4);
		
		list.insert(60, 5);
		
		assertEquals(50, (int)list.remove(4));
	}
	
	  @Test
	    public void test_pop_simple() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 6, (int) list.pop());
	    }
	    
	    @Test
	    public void test_pop_double() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 6, (int) list.pop());
	        assertEquals((int) 5, (int) list.pop());
	    }
	    
	    @Test(expected = EmptyListException.class)
	    public void test_pop_Empty() {
	        UnsortedList<Integer> list = MyUnsortedList.of();
	        
	        list.pop();
	    }
	    
	    @Test(expected = EmptyListException.class)
	    public void test_pop_Empty2() {
	        UnsortedList<Integer> list = MyUnsortedList.of(5);
	        
	        assertEquals((int) 5, (int) list.pop());
	        
	        list.pop();
	    }
	    
	    @Test
	    public void test_remove_simple() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 6, (int) list.remove((Integer) 0));
	    }
	    
	    @Test
	    public void test_remove_double() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 6, (int) list.remove((Integer) 0));
	        assertEquals((int) 4, (int) list.remove((Integer) 1));
	    }
	    
	    @Test(expected = IndexOutOfBoundsException.class)
	    public void test_remove_Empty() {
	        UnsortedList<Integer> list = MyUnsortedList.of();
	        
	        list.remove(0);
	    }
	    
	    @Test(expected = IndexOutOfBoundsException.class)
	    public void test_remove_indexOutOfBounds() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        list.remove(4);
	    }
	    
	    @Test
	    public void test_popLast_simple() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 3, (int) list.popLast());
	    }
	    
	    @Test
	    public void test_popLast_double() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        assertEquals((int) 3, (int) list.popLast());
	        assertEquals((int) 4, (int) list.popLast());
	    }
	    
	    @Test(expected = EmptyListException.class)
	    public void test_popLast_Empty() {
	        UnsortedList<Integer> list = MyUnsortedList.of();
	        
	        list.popLast();
	    }
	    
	    @Test
	    public void test_remove_size() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        list.remove(2);
	        
	        assertEquals(3, list.size());
	    }
	    
	    @Test
	    public void test_pop_size() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        list.pop();
	        
	        assertEquals(3, list.size());
	    }
	    
	    @Test
	    public void test_popLast_size() {
	        UnsortedList<Integer> list = MyUnsortedList.of(6, 5, 4, 3);
	        
	        list.popLast();
	        
	        assertEquals(3, list.size());
	    }
	    
	    @Test
	    public void test_lists_equal() {
			UnsortedList<Integer> list1 = MyUnsortedList.of(1, 2, 3, 4);
			UnsortedList<Integer> list2 = MyUnsortedList.of(1, 2, 3, 4);
			
			assertTrue(list1.equals(list2));			
	    }
	    
	    @Test
	    public void test_lists_notEqual() {
			UnsortedList<Integer> list1 = MyUnsortedList.of(1, 2, 3, 4);
			UnsortedList<Integer> list2 = MyUnsortedList.of(1, 2, 5, 4);
			
			assertFalse(list1.equals(list2));			
	    }
	    
	    @Test
	    public void test_tostring() {
			UnsortedList<Integer> list1 = MyUnsortedList.of(1, 2, 3, 4);
			
			System.out.println(list1);
			
			assertEquals(list1.toString(), "MyUnsortedList { size = 4, [1, 2, 3, 4] }");			
	    }
	

}
