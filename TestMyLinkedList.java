public class TestMyLinkedList {
  public static void main(String[] args) {
   
   boolean done = false;
   MyLinkedList<Integer> list = new MyLinkedList<Integer>();
   MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
	
    // Add elements to the list
    list.append(new Integer(6));
    list.append(new Integer(5));
    list.append(new Integer(3));
    list.append(new Integer(4)); 
	list.append(new Integer(2));
    list.append(new Integer(5));
	list.append(new Integer(1));
	list1 = list.firstHalf();
	System.out.println(list1);
	list.sortList();
	System.out.println(list);
	
  }
}

