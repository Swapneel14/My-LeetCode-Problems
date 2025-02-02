import java.util.Scanner;

public class DeleteNthNodefromLast{
    Node head;
    class Node{
        String data;
        Node next;
    Node(String data){
    this.data=data;
    this.next=null;
}
    }
    public void add_first(String data){
        Node abc = new Node(data);
        if(head==null){
            head = abc;
            return;
        }
        abc.next= head;
        head= abc;
    }
    public void addlast(String data){
        Node sopu= new Node(data);
        if(head== null){
            head = sopu;
            return;
        }
       Node currNode= head;
       while(currNode.next != null){
        currNode= currNode.next;
       }
       currNode.next= sopu;

    }
    public void printlist(){
        Node currNode= head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        DeleteNthNodefromLast list= new DeleteNthNodefromLast();
        list.addlast("Hi");
        list.addlast("I");
        list.addlast("am");
        list.addlast("LinkedList");
        list.printlist();
        Node ans=removeNthFromEnd(list.head,n);
        Node currNode= ans;
        if(ans == null){
            System.out.println("List is Empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }
    public static Node removeNthFromEnd(Node head, int n) {
        if(head== null){
            return null;
        }
        int siz=0;
        Node curr= head;
        while(curr!= null){
            curr= curr.next;
            siz++;
        }
        if(n== siz){
            return head.next;
        }
        int i=1;
        int index= siz-n;
        Node prev = head;
        while(i<index){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
       
    }
    }

