public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes() {
        Node head = this;
        StringBuilder output = new StringBuilder();
        output.append("-->").append(head.data);
        while (head.following != null) {
            head = head.following;
            output.append("-->").append(head.data);
        }
        output.append("--> .");
        System.out.print(output);
    }

    int length(Node h) {
        int count = 1;
        while (h.following != null) {
            h = h.following;
            count++;
        }
        return count;
    }

    int sumOfNodes() {
        Node head = this;
        int sum = this.data;
        while (head.following != null) {
            head = head.following;
            sum += head.data;
        }
        return sum;

    }

    Node deleteNode(Node head, int data) {
        Node n =new Node(head.data);
        if (head.data == data) {
            return head.following;
        }else{
           while (head.following != null){
               if(head.following.data ==data ){
                   if(head.following.following!=null){
                       n.appendToEnd(head.following.following.data);
                       head = head.following.following;
                   }else{
                       break;
                   }
               }else{
                   n.appendToEnd(head.following.data);
                   head = head.following;
               }
           }
        }
        return n;
    }
}