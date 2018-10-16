
public class BTree {
		private Node root;
	//插入子节点
	   public void insert(int data)
	   {
	       Node newNode = new Node(data);
	       
	       if(root == null)
	          root = newNode ;
	       else
	       {
	           Node current = root ;
	           Node parent ;
	           while(true)//寻找插入的位置     
	           {
	               parent = current ;
	               if(data<current.data)
	               {
	                   current = current.left ;
	                   if(current == null)
	                   {
	                       parent.left = newNode ;
	                       return ;
	                    }
	               }
	               else
	               {
	                   current =current.right ;
	                   if(current == null)
	                   {
	                       parent.right = newNode ;
	                       return ;
	                    }
	                }
	           }
	       }
	   }
}
