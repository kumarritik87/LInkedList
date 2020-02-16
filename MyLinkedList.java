package LinkeListOperation;

public class MyLinkedList {
    Node head;
    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteFromBegining(){
        Node newNode;
        if (head == null){
            System.out.println("No element found in the list");
        }
        else{
            head = head.next;
        }
    }

    public void insertAfterNode(Node prevNode, int data){
        Node newNode = new Node(data);
        if(prevNode == null){
            System.out.println("prevNode not be null");
        }
        else{
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void deleteFromEnd(){
        if (head == null){
            System.out.println("No element found");

        }
        else{
            Node temp = head;
            Node previous  = head;
            while (temp.next!=null){
                previous = temp;
            temp = temp.next;
            }
            if(temp == head){
                head = null;
            }
            else{
                previous.next= null;
            }

        }
    }

    public int countElement(){
        int count = 0;
        if (head == null){
            return 0;
        }
        else{
            Node temp = head;
            while(temp!= null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }





    public void printlist(){
        Node a = head;
        while(a!= null){
            System.out.println(a.data+ " ");
            a = a.next;
        }

    }
}
