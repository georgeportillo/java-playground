import java.util.*;

// Using a for loop
class ForLoop {
  public static void main(String[] args){
    for(int i = 1; i < 11; i++){
      System.out.println("Count is: " + i);
    }
  }
}

class addToArray {
  public static void main(String[] args){
    List<String> list = new ArrayList<String>();
    list.add("Hello!");
    list.add("How are you?");

    System.out.println(list.get(0)); // prints "Hello!"

    for (String s : list) {
      System.out.println(s);
    }
  }
}

class getArrayLength {
  public static void calculateAnswer(int myNumber) {
    int[] anArray;

    anArray = new int[myNumber];

    for(int i = 0; i < myNumber; i++) {
      anArray[i] = i;
    }

    System.out.println("Array length: " + anArray.length);
  }
}

class doComputation {
  public static void main(String[] args) {
    int myNumber = Integer.parseInt(args[0]);
    getArrayLength.calculateAnswer(myNumber);
  }
}
