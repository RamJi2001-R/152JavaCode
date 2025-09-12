import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();

        employees.add("John");
        employees.add(1,"Raj");
        employees.addFirst("Sophia");
        employees.addLast("Arjun");

        //----------ADD Methods--------------//
        System.out.println("Employees after adding: "+employees);

        //----------ACCESS Methods--------------//
        System.out.println("Get First: "+employees.getFirst());
        System.out.println("Get Last: "+employees.getLast());
        System.out.println("Get index 2: "+employees.get(2));

        //----------REMOVE Methods--------------//
        employees.remove();
        employees.remove("Raj");
        employees.remove(1);
        employees.removeFirst();
        employees.removeLast();
        System.out.println("Employees after removal: "+employees);
        
        
        //----------Search Methods--------------//

        employees.add("John");
        employees.add("Meena");
        employees.add("John");
        System.out.println("Contains 'John'? "+employees.contains("John"));
        System.out.println("Index of 'John'? "+employees.contains("John"));

    }
    
}
