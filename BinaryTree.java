package Class9Mani;

public class BinaryTree {
	
	Node root;
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;
				if (data < focusNode.data) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return; 
					}

				} else { 
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return; 
					}

				}

			}
		}

	}
	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}

	}

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);

		}

	}

	public Node findNode(int data) {
		Node focusNode = root;
		while (focusNode.data != data) {
			if (data < focusNode.data) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;

			}
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

}

class Node {

	
	int data;

	Node leftChild;
	Node rightChild;

	Node(int data) {

		this.data = data;

	}

	public String toString() {

		return data+"";

		

	}

}