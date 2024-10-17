package LinkedList;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press :\n 1. To Insert(In first)\n 2. To Insert(At End)\n 3. To Insert(At any position)\n 4. To Delete(Form First)\n 5. To Delete(Form End)\n 6. To Delete(Form Any position ) ");
        Node head = null;
        System.out.println("Creating a Linked list ");
        head = LinkedList.create(head);
        LinkedList.Display(head);
        char ch;
        do{
            System.out.print("Enter the choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("inserting element at first");
                    head = LinkedList.InsertAtBegin(head);
                    LinkedList.Display(head);
                    break;
                    
                case 2:
                    System.out.println("Inserting at end ");
                    head = LinkedList.InsertAtEnd(head);
                    LinkedList.Display(head);
                    break;
                case 3:
                    System.out.println("Inserting at any position");
                    head = LinkedList.InsertAtAnyPos(head);
                    LinkedList.Display(head);
                    break;
                case 4:
                    System.out.println("Deleting first element ");
                    head = LinkedList.DeleteFromBegin(head);
                    LinkedList.Display(head);
                    break;
                case 5:
                    System.out.println("Deleting Last element ");
                    head = LinkedList.DeleteFromEnd(head);
                    LinkedList.Display(head);
                    break;
                case 6:
                    System.out.println("Deleting from any position");
                    head = LinkedList.DeleteFromAnyPos(head);
                    LinkedList.Display(head);
                    break;
    
                default:
                    System.out.println("You enter the wrong choice");
                    break;
                    
            }
            System.out.println("You want to do it again (Y/N)");
            ch = sc.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
    }
}
