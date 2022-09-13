
import java.util.LinkedList;

class linkedlist {
  public static void main(String[] args){
    

  
    LinkedList<String> StudNumber = new LinkedList<>();

   
    StudNumber.add("1");
    StudNumber.add("0");
    StudNumber.add("0");
    StudNumber.add("0");
    StudNumber.add("9");
    StudNumber.add("1");

   
    System.out.println("LinkedList: " + StudNumber);

    StudNumber.set(0, "*1");

    StudNumber.set(5, "1*");

    System.out.println("Updated LinkedList: " + StudNumber);
    
    System.out.println("Last Element is : " + StudNumber.getLast());
    
    System.out.println("The Object that is replaced is: " + StudNumber.set(5, "!"));
    
    System.out.println("New LinkedList: " + StudNumber);
    
    System.out.println("The first element is: " + StudNumber.removeLast());
  
        System.out.println("Final LinkedList:" + StudNumber);

  }

}
