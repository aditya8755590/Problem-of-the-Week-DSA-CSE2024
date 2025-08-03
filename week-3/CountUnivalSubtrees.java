public class CountUnivalSubtrees {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int count = 0;

    public int countUnivalSubtrees(Node root) {
        isUnival(root);
        return count;
    }

    private boolean isUnival(Node node) {
        if (node == null) return true;

        boolean leftUnival = isUnival(node.left);
        boolean rightUnival = isUnival(node.right);

        if (!leftUnival || !rightUnival)
            return false;

        if (node.left != null && node.left.val != node.val)
            return false;

        if (node.right != null && node.right.val != node.val)
            return false;

        count++;
        return true;
    }

    public static void main(String[] args) {

        Node root = new Node(0,
                new Node(1),
                new Node(0,
                new Node(1, new Node(1), new Node(1)),
                new Node(0))
        );

        CountUnivalSubtrees counter = new CountUnivalSubtrees();
        System.out.println("Number of unival subtrees: " + counter.countUnivalSubtrees(root)); // Expected: 5
    }
}