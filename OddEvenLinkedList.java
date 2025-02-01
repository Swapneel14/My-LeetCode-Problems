import java.util.*;

public class OddEvenLinkedList {
    Node head;
    class Node{
        Integer data;
        Node next;
    Node(Integer data){
    this.data=data;
    this.next=null;
}

}
public  void addlast(Integer data){
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
public  void bruteforce(){
    if(head==null||head.next==null){
       return;
        }
         Scanner sc = new Scanner(System.in);
      ArrayList<Integer>ans = new ArrayList<>();
      Node temp=head;
      while(temp!= null && temp.next!=null){
        ans.add(temp.data);
        temp=temp.next.next;
      }
      if(temp!= null){
        ans.add(temp.data);
      }
      Node t= head.next;
      while(t!= null && t.next!=null){
        ans.add(t.data);
        t=t.next.next;
      }
      if(t!= null){
        ans.add(t.data);
      }
      int i=0;
      Node curr= head;
      while(curr!=null){
        curr.data= ans.get(i);
        i++;
        curr= curr.next;
      }
    }
      public void opt(){
        if(head==null || head.next==null){
            return;

        }
        Node oS= head;
        Node eS= head.next;
        Node odd= oS;
        Node even = eS;
        while( even != null && even.next !=null && odd!=null && odd.next!=null){
            odd.next= even.next;
            odd= odd.next;
            even= odd.next;
            even = even.next;
        }
        odd.next= eS;
      }
      

public static void main(String[] args) {
    OddEvenLinkedList list=new OddEvenLinkedList();
    list.addlast(4);
    list.addlast(5);
    list.addlast(7);
    list.addlast(9);
    list.addlast(8);
    list.addlast(2);
    list.printlist();
    list.bruteforce();
    list.printlist();
    list.opt();
    list.printlist();
    

}
}
