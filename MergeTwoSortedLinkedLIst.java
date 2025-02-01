public class MergeTwoSortedLinkedLIst {
    Node head;
   static class Node{
        Integer data;
        Node next;
    Node(int data){
    this.data=data;
    this.next=null;
}
    }
   public static Node solution(Node head1,Node head2){
      Node dummy=new Node(-1);
      Node curr= dummy;
      while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            curr.next=head1;
            head1=head1.next;
        }
        else{
            curr.next=head2;
            head2=head2.next;
        }
        curr=curr.next;
      }
      if(head1!=null){
        curr.next=head1;
        head1=head1.next;
        curr=curr.next;
      }
      if(head2!=null){
        curr.next=head2;
        head2=head2.next;
        curr=curr.next;
      }
      return dummy.next;

   }
   public void addlast(Integer data){
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
        MergeTwoSortedLinkedLIst list1= new MergeTwoSortedLinkedLIst();
        MergeTwoSortedLinkedLIst list2= new MergeTwoSortedLinkedLIst();
         list1.addlast(1);
         list1.addlast(2);
         list1.addlast(3);
         list1.addlast(8);
         list1.addlast(11);
         list2.addlast(4);
         list2.addlast(5);
         list2.addlast(6);
         list2.addlast(10);
         Node mergedHead = solution(list1.head, list2.head);

         // Print merged list
         MergeTwoSortedLinkedLIst mergedList = new MergeTwoSortedLinkedLIst();
         mergedList.head = mergedHead;
         mergedList.printlist(); // Print the result
        
    }
}
