public class main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> alright = new BinarySearchTree<>();

        alright.insert(5);
        alright.insert(4);
        alright.insert(6);
        alright.insert(7);

        System.out.println(alright.root.right.value);
        System.out.println(alright.root.right.right.value);
        System.out.println(alright.findLastElement(root));
//        System.out.println(alright.root);
//        alright.insert(0);
//        alright.insert(2);
//
//        System.out.println(alright.root);
//        System.out.println("left is 0 and right don't exist?"+alright.root.left+" and "+ alright.root.right);
//        System.out.println("alright value:" + alright.root.value);

    }
}
