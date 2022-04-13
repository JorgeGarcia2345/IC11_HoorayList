/*

    Java Generics --->, reference types (Integer, Double, Object, String) <>
    Reference types, haves methods - toString, compare

    Primitive types, int, double, boolean, float, char - just values, fast efficient

    no abstract class, CONCRETE ONLY

    Data Structure, way of organizing data for
    e.g: ArrayList - flexible, dynamic, grow/shrink /// /// /// Copies all values to new "doubled" arrayList
         LinkedList
         array - contiguous memory allocation
         Trees
         HashMap
         Stacks

 */

/**
 * The <code>HoorayListDemo</code> class simulates and tests the methods of the <code>HoorayList</code> data structure, including
 * adds (both implementations), removes (both implementations), set and toString.  Implicit in these methods are
 * calls to ensureCapacity, indexOf and contains.
 *
 * @author Michael Paulding
 * @version 1.0
 */
public class Main {

    /**
     * Main method is the entry point to the HoorayListDemo.
     *
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {

        HoorayList<String> ourNames = new HoorayList<>();
        HoorayList<Double> ourGPAs = new HoorayList<>();
        ourNames.add("Jorge");
        ourNames.add("Haylee");
        ourNames.add("Zythnia");
        ourNames.add("Paulding");
        ourNames.add("Tressah");
        ourNames.add("JC");
        ourNames.add("Cory");

        System.out.println(ourNames);
        //System.out.println(ourGPAs);

        // bye bye Paulding
        ourNames.remove(3);

        System.out.println(ourNames);





//		HoorayList<String> words = new HoorayList<>();
//		System.out.println("~~~Empty HoorayList~~~\n" + words);
//
//		words.add("Aloha");
//		words.add("Goodbye");
//		System.out.println("\n~~~After adding Aloha and Goodbye~~~\n" + words);
//
//		words.add(0, "Hola");
//		words.add(0, "Hello");
//		System.out.println("\n~~~After adding Hola and Hello at index 0~~~\n" + words);
//
//		words.remove("Goodbye");
//		System.out.println("\n~~~After removing Goodbye~~~\n" + words);
//
//		words.remove(0);
//		System.out.println("\n~~~After removing element at index 0~~~\n" + words);
//
//		words.set(1, "Adios");
//		System.out.println("\n~~~After setting index 0 to Adios~~~\n" + words);
    }

}

