import java.util.HashMap;
public class DeepCloneaLinkedListwithRandom {
    static class Node {
        int val;
        Node next;
        Node random;
        
        Node(int val) {

            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        head.random = head.next;
        head.next.random = head; 
        head.next.next.random = head.next; 
        
        Node clonedHead = deepClone(head);
        
        // Print original and cloned list to verify
        printList(head);
        printList(clonedHead);
    }
    public static Node deepClone(Node head) {
         HashMap<Node,Node> map=new HashMap<>();
        Node temp1=head;
       while(temp1!=null){
        map.put(temp1,new Node(temp1.val));
        temp1=temp1.next;
       }
       Node temp=head;
       while(temp!=null){
        Node secon=map.get(temp);
        secon.next = map.get(temp.next);
        secon.random = map.get(temp.random);
         temp=temp.next;
       }
       return map.get(head);
    }

    // Method to print the linked list with random pointers
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            int randomVal = (current.random != null) ? current.random.val : -1;
            System.out.print("Node val: " + current.val + ", Random points to: " + randomVal + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
