package tttttt2test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class SimpleTokenizerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testhasNext() {
		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new ArrayList<String>(); 
		list1.add("hushifeng");
		list1.add("love");
		SimpleTokenizer s1=new SimpleTokenizer(new PeekIterator(list1.iterator()));
		SimpleTokenizer s2=new SimpleTokenizer(new PeekIterator(list2.iterator()));
		s1.hasNext();
		assertEquals(false,s2.hasNext());
		
	}
	
	@Test
	public void testmakeToken() {
		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new ArrayList<String>(); 
		list1.add("hushifeng");
		list1.add("love");
		SimpleTokenizer s1=new SimpleTokenizer(new PeekIterator(list1.iterator()));
		SimpleTokenizer s2=new SimpleTokenizer(new PeekIterator(list2.iterator()));
		s1.peek();
		s1.next();
		
		
	}
	@Test
	public void testisSwitch(){
		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new ArrayList<String>(); 
		list1.add("hushifeng");
		list1.add("love");
		SimpleTokenizer s1=new SimpleTokenizer(new PeekIterator(list1.iterator()));
		SimpleTokenizer s2=new SimpleTokenizer(new PeekIterator(list2.iterator()));
//		s1.isSwitch
		
	}

}
