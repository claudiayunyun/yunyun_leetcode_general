package com.leetcode.salesforce;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.salesforce.DeleteNodesAndReturnForest.TreeNode;

public class DeleteNodesAndReturnForestTest {
	
	private DeleteNodesAndReturnForest underTest;
	private TreeNode root;

	@Before
	public void setUp() throws Exception {
		underTest = new DeleteNodesAndReturnForest();
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
	}

	@Test
	public void test() {
		int[] to_delete = new int[] {3, 5};
		List<TreeNode> forest = underTest.delNodes(root, to_delete);
		assertEquals(3, forest.size());
	}

}
