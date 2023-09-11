package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<Egg> myList = new ArrayList<Egg>();

    Egg s = new Egg();
    myList.add(s);

    Egg b = s;

    int theSize = myList.size();
    // myList.remove(s);
    boolean isIn = myList.contains(b);
    int idx = myList.indexOf(b);
    boolean empty = myList.isEmpty();

    System.out.println(theSize + "\n" + empty + "\n" + myList + "\n" + isIn + "\n" + idx);
  }
}