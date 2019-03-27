import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution_559_Maximum_Depth_of_N_ary_Tree {
	
	private Queue<Node> nodeQueue = new LinkedList<>();
	private int depth = 1;
	
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		traverse(root);
        return this.depth;
    }
	
	public void traverse(Node root) {
		
		System.out.println(root.val);
		if (root.children == null) {
			
		} else {
			System.out.println("gap");
			this.depth += 1;
			for (Node child: root.children) {
				nodeQueue.offer(child);
			}
		}
		while(nodeQueue.peek() != null) {
			traverse(nodeQueue.poll());
		}
	}
	
	public static void main(String[] args) {
		Node node_5 = new Node(5, null);
		Node node_6 = new Node(6, null);
		Node node_2 = new Node(2, null);
		Node node_4 = new Node(4, null);
		
		List<Node> nodeList_3 = new ArrayList<>();
		nodeList_3.add(node_5);
		nodeList_3.add(node_6);
		Node node_3 = new Node(3, nodeList_3);
		
		List<Node> nodeList_1 = new ArrayList<>();
		nodeList_1.add(node_3);
		nodeList_1.add(node_2);
		nodeList_1.add(node_4);
		Node root = new Node(1, nodeList_1);
		
		Solution_559_Maximum_Depth_of_N_ary_Tree obj = new Solution_559_Maximum_Depth_of_N_ary_Tree();
//		obj.traverse(root);
		System.out.println(obj.maxDepth(null));
		// 132456
	}

}
