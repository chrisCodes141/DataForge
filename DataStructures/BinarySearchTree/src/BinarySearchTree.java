public class BinarySearchTree<X extends Comparable<X>> {
    public lol<X> root;

    public void insert(X value) {
        lol<X> node = new lol<>(value);

        //Create first node as root
        if (root == null) {
            root = node;
            return;
        }

        traverseThruToInsertRec(root, node);
    }

    private void traverseThruToInsertRec(lol<X> latestRoot, lol<X> node) {
        //Check if we going left / right
        if (latestRoot.value.compareTo(node.value) > 0) {
            //Check if left doesn't exist
            if (latestRoot.left == null) {
                //Make it exist
                latestRoot.left = node;
                return;
            }
            //Since it exists, we go to it
            else {
                traverseThruToInsertRec(latestRoot.left, node);
            }
        }
        //left doesn't exist so we go right
        else {
            //Check if right doesn't exist
            if (latestRoot.right == null) {
                //Make it exist
                latestRoot.right = node;
                return;
            }
            //Since it exists, we go to it
            else {
                traverseThruToInsertRec(latestRoot.right, node);
            }
        }
    }

    void printPostorder(lol node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.value + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(lol node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.value);
        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(lol node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.value + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    /*Postorder traversal
    *
    *
    * */

//    public lol postOrderTraversal(lol latestRoot, lol nextNode){
//        lol rightMost = findLastElement(latestRoot);
//        while(rightMost.value != nextNode.value){
//
//            if(){
//
//            }
//            else if(){
//
//            }
//        }
//        return rightMost;
//    }




    public lol findLastElement(lol root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root;
        }
        return findLastElement(root.right);
    }
}
