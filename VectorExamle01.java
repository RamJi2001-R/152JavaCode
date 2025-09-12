import java.util.Vector;
public class VectorExamle01 {
    public static void main(String[] args) {
        Vector<String> vc = new Vector<>(4);  // capacity double if number of elements greater than initial capacity.
        System.out.println(vc.capacity());

        vc.add("1");
        vc.add("2");
        vc.add("3"); 
        vc.add("4");
        vc.add("5");
        

        System.out.println(vc.capacity());

        System.out.println(vc.size());
        System.out.println("Vector is: "+vc);

        // Add All
        Vector<String> vc2 = new Vector<>();
        vc.add("A");
        vc.add("B");
        vc.add("C"); 
        vc.addAll(vc2);
        System.out.println(vc);
        System.out.println("Second vector is: "+vc2);

        System.out.println("Enter element is: "+vc.firstElement());

        System.out.println("Enter element is: "+vc.lastElement());



        //---clear---
        vc.clear();
        System.out.println("Values of VC are: "+vc);
        System.out.println("--------------");

       
    }
}
