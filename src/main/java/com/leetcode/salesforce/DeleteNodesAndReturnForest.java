package com.leetcode.salesforce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {
	
	/*
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) {this.val = val;}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	/*
	 * 1 for each node -> if it is root node and not in delete set -> add in forest
	 * 2 whether a node is root -> it's parent been deleted
	 * 3 if the node been deleted, set itself to null
	 */
	
	private Set<Integer> to_delete_set;
	private List<TreeNode> forest;
	
	
	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		to_delete_set = new HashSet<>();
        forest = new ArrayList<>();
        for(int delete : to_delete) to_delete_set.add(delete);
        dfsDel(root, true);
        return forest;
    }
	
	private TreeNode dfsDel(TreeNode node, boolean isRoot) {
		if(node == null) return null;
		boolean to_be_deleted = to_delete_set.remove(node.val);
		if(isRoot && !to_be_deleted) forest.add(node);
		node.left = dfsDel(node.left, to_be_deleted);
		node.right = dfsDel(node.right, to_be_deleted);
		return to_be_deleted ? null : node;
	}

}
