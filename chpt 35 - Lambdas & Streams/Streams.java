import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

        // Streams are wrappers around a data source, allowing us to operate with that data source and making bulk processing convenient and fast.
        // A stream does not store data and also never modifies the underlying data source.



        // Obtain a stream from an existing array
        List<String> listOfString = new ArrayList<>(Arrays.asList("vcxzvcxz", "gfdgs", "vcxzvcxz","nbvnbv","qweqw","uytuyt"));
        List<Integer> listOfInts = new ArrayList<>(Arrays.asList(20,50,30,70,50,80,30,40,20,10,10));
        List<Employee> listOfEmployeeObjects = new ArrayList<>(Arrays.asList(new Employee("Kevin", 28), new Employee("Jack", 25), new Employee("Pete", 68)));



        // forEach()
        // Terminal Operation.
        // Loops over the stream elements, calling the supplied function on each element.
        // Takes in a Consumer
        System.out.println("\nstream().forEach():");
        listOfEmployeeObjects.stream().forEach(e -> System.out.println(e.getName()));



        // map()
        // Intermediary Operation
        // Produces a new stream after applying a function to each element of the original stream. The new stream could be of different type
        // Takes in a function
        System.out.println("\nstream().map():");
        listOfInts.stream().map(e -> e + 10).forEach(e -> System.out.println(e));



        // collect()
        // Terminal Operation.
        // Java Stream collect() is mostly used to collect the stream elements to a collection
        // The Collector is an interface that provides a wrapper for the supplier, accumulator, and combiner objects. It takes in 3 arguments a Supplier, an Accumulator and a Combiner
        System.out.println("\nstream().collect():");
        StringBuilder result = listOfString.stream().collect(StringBuilder::new, (x, y) -> x.append(y),  (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());



        // filter()
        // Intermediary Operation
        // Takes in a predicate and returns a stream consisting of the elements of this stream that match the given predicate.
        System.out.println("\nstream().filter():");

        List<Integer> myList = listOfEmployeeObjects.stream()
                .map(employee -> employee.getAge())                     // Create a new stream of the ages
                .filter(e -> e > 25)                                    // Filter the ages greater than 25
                .collect(Collectors.toList());                          // Collect the stream of elements into a collection

        System.out.println(myList);



        // findFirst()
        // Short Circuit Terminal Operation.
        // Returns an Optional for the first entry in the stream
        System.out.println("\nstream().findFirst():");

        Optional<String> temp = listOfString.stream()
                .filter(e -> !e.contains("x"))          // Filter out fields that contain x
                .findFirst();
        System.out.println(temp.get());



        // toArray()
        // Terminal Operation.
        // If we need to get an array out of the stream, we can simply use toArray(). Takes in a function
        String[] names = listOfEmployeeObjects.stream()
                .map(e -> e.getName())                      // Map the names of each employee into a new stream
                .toArray(String[]::new);                    // Convert this new stream into an array

        Arrays.stream(names).forEach(e -> System.out.println(e));

    }

}
