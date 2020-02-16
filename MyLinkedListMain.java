package LinkeListOperation;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.insertAtBegining(2);
        obj.insertAtBegining(3);
        obj.insertAtBegining(4);
        obj.insertAfterNode(obj.head.next,5);
        obj.deleteFromBegining();
        obj.deleteFromEnd();
        System.out.println("total elment in a list = " +obj.countElement());
        System.out.println("list is");
        obj.printlist();
    }
}

