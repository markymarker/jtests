
import java.awt.Color;
import java.awt.Dimension;


class bad_cast {

  private static class A {}
  private static class B extends A {}

  public static void main(String[] args){
    // Feels like I've tested this a hundred times...
    // Maybe putting it here will make it stick

    // Throws a java.lang.ClassCastException
    try {
      B b = (B)(new A());
    } catch(Exception e){
      System.out.println("A to B threw catchable exception: " + e.getMessage());
    }


    /* These are caught and denied by the compiler

    try {
      int i = (int)"what kind of nonsense...";
    } catch(Exception e) {
      System.out.println("String to int threw catchable exception: " + e.getMessage());
    }

    try {
      Dimension d = (Dimension)(Color.RED);
    } catch(Exception e) {
      System.out.println("Color to Dimension threw catchable exception: " + e.getMessage());
    }

    */

  }

}

