public class lol<X extends Comparable<X>>{
    public X value;
    public lol<X> left;
    public lol<X> right;

    public lol(X value){
        this.value = value;
    }
/*
    public lol root;

    public void insert(int value) {
        lol node = new lol<>(value);
        System.out.println("value is : " + value);
        if (root == null) {
            System.out.println("entered root");
            root = node;
            return;
        }
        System.out.println("value is : " + value);

        traverseThruToInsertRec(root, node);
    }

    public void traverseThruToInsertRec(lol latestRoot, lol node) {
        //Check if we going left / right
        if (latestRoot.value > node.value) {
            //Check if left doesn't exist
            if (latestRoot.left == null) {
                //Make it exist
                latestRoot.left = node;
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
            }
            //Since it exists, we go to it
            else {
                traverseThruToInsertRec(latestRoot.right, node);
            }
        }
    }*/
}