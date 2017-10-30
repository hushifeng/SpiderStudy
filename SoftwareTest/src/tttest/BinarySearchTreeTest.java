package tttest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BinarySearchTreeTest {
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInsert(){
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		
	}
	@Test
	public void testDelete(){
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		
		
		
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		binarySearchTree.delete(3);
		binarySearchTree.delete(2);
		binarySearchTree.delete(4);
		assertEquals(false, binarySearchTree.delete(5));
		assertEquals(false, binarySearchTree.delete(4));
		
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
//		binarySearchTree.delete(2);
//		binarySearchTree.delete(3);
		binarySearchTree.delete(4);
		
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		binarySearchTree.delete(2);
		binarySearchTree.delete(3);
		binarySearchTree.delete(4);
		
		
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		assertEquals(false, binarySearchTree.delete(4));
		binarySearchTree.delete(2);
		binarySearchTree.delete(3);
		
		
		BinarySearchTree binarySearchTree2=new BinarySearchTree();
		binarySearchTree2.insert(20);
		binarySearchTree2.insert(6);
		binarySearchTree2.insert(18);
		binarySearchTree2.insert(4);
		binarySearchTree2.insert(5);
		binarySearchTree2.insert(9);
		binarySearchTree2.insert(11);
		binarySearchTree2.delete(6);
		binarySearchTree2.delete(4);
		
		BinarySearchTree binarySearchTree3=new BinarySearchTree();
		binarySearchTree3.insert(3);
		binarySearchTree3.insert(2);
		binarySearchTree3.delete(2);
		binarySearchTree3.delete(3);
		
		BinarySearchTree binarySearchTree4=new BinarySearchTree();
		binarySearchTree3.insert(3);
		binarySearchTree3.insert(2);
		binarySearchTree3.delete(3);
		binarySearchTree3.delete(2);
		
		binarySearchTree3.insert(3);
		binarySearchTree3.insert(4);
		binarySearchTree3.delete(3);
		
		BinarySearchTree binarySearchTree5=new BinarySearchTree();
		binarySearchTree5.insert(20);
		binarySearchTree5.insert(6);
		binarySearchTree5.insert(18);
//		binarySearchTree5.insert(4);
		binarySearchTree5.insert(5);
		binarySearchTree5.insert(9);
		binarySearchTree5.insert(11);
		binarySearchTree5.delete(6);
		
		BinarySearchTree binarySearchTree6=new BinarySearchTree();
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
//		binarySearchTree6.insert(4);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(18);
		binarySearchTree6.insert(4);
//		binarySearchTree6.insert(5);
		binarySearchTree6.insert(9);
		binarySearchTree6.insert(11);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(9);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(18);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(11);
		binarySearchTree6.delete(4);
		
		
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(21);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(21);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(6);
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(21);
		binarySearchTree6.delete(4);
		binarySearchTree6.delete(6);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(21);
		
		binarySearchTree6.insert(21);
		binarySearchTree6.insert(1);
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(10);
		binarySearchTree6.insert(15);
		binarySearchTree6.insert(14);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(21);
		binarySearchTree6.delete(1);
		binarySearchTree6.delete(10);
		binarySearchTree6.delete(15);
		binarySearchTree6.delete(14);
		
		binarySearchTree6.insert(21);
		binarySearchTree6.insert(1);
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(10);
		binarySearchTree6.insert(15);
		binarySearchTree6.insert(-3);
		binarySearchTree6.insert(2);
		binarySearchTree6.insert(-5);
		binarySearchTree6.delete(1);
		binarySearchTree6.delete(21);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(10);
		binarySearchTree6.delete(15);
		binarySearchTree6.delete(-5);
		binarySearchTree6.delete(-3);
		binarySearchTree6.delete(2);
		
		binarySearchTree6.insert(21);
		binarySearchTree6.insert(1);
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(10);
		binarySearchTree6.delete(15);
		binarySearchTree6.delete(-5);
		binarySearchTree6.delete(-3);
		binarySearchTree6.delete(2);
		
		binarySearchTree6.insert(20);
		binarySearchTree6.insert(5);
		binarySearchTree6.insert(25);
		binarySearchTree6.insert(21);
		binarySearchTree6.insert(30);
		binarySearchTree6.delete(25);
		binarySearchTree6.delete(5);
		binarySearchTree6.delete(20);
		binarySearchTree6.delete(21);
		binarySearchTree6.delete(30);
		
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(1);
		binarySearchTree6.insert(2);
		binarySearchTree6.delete(1);
		binarySearchTree6.delete(2);
		binarySearchTree6.delete(4);
		
		binarySearchTree6.insert(4);
		binarySearchTree6.insert(10);
		binarySearchTree6.insert(20);
		binarySearchTree6.delete(10);
		binarySearchTree6.delete(20);
		assertEquals(false, binarySearchTree6.delete(5));
		
		
		

		
	}
	@Test
	public void testFind() {
//		Node root=new Node(3);
//		Node left = null,right=null;
//		root.left.data=2;
//		root.right.data=4;
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		assertEquals(true, binarySearchTree.find(3));
		assertEquals(true, binarySearchTree.find(2));
		assertEquals(true, binarySearchTree.find(4));
		assertEquals(false, binarySearchTree.find(5));
	}
	@Test
	public void testDisplay(){
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		
		Node root=binarySearchTree.root;
		StringBuilder sb=new StringBuilder();
		binarySearchTree.display(root, sb);
		assertEquals(" 2 3 4", sb.toString());
	}
	@Test
	public void testInorderTraverse(){
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(4);
		
		
		
		Node root=binarySearchTree.root;
		assertEquals(" 2 3 4", binarySearchTree.inorderTraverse(root));
//		System.out.println(binarySearchTree.inorderTraverse(root));
	}
	@Test
	public void testGetSuccessor(){
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		binarySearchTree.insert(3);
//		binarySearchTree.insert(2);
//		binarySearchTree.insert(4);
		
		Node root=binarySearchTree.root;
		assertEquals(null, binarySearchTree.getSuccessor(root));
		
		
		BinarySearchTree binarySearchTree2=new BinarySearchTree();
		binarySearchTree2.insert(20);
		binarySearchTree2.insert(6);
		binarySearchTree2.insert(18);
		binarySearchTree2.insert(9);
		binarySearchTree2.insert(11);
		Node root2=binarySearchTree.root;
		assertEquals(root2.right, binarySearchTree2.getSuccessor(root2));
		
		
	}

}
