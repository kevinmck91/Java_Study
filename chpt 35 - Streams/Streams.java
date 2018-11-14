import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		/*
		 * Simply put, streams are wrappers around a data source, allowing us to
		 * operate with that data source and making bulk processing convenient
		 * and fast.
		 * 
		 * A stream does not store data and, in that sense, is not a data
		 * structure. It also never modifies the underlying data source.
		 */

		/****************** Creating Streams **************************/
		
		// 1.
		
			Employee[] arrayOfEmps = {
			    new Employee(1, "Jeff Bezos", 100000.0), 
			    new Employee(2, "Bill Gates", 200000.0), 
			    new Employee(3, "Mark Zuckerberg", 300000.0)
			};
			
			Stream.of(arrayOfEmps);
			
		
		// 2.
			
			List<Employee> empList = Arrays.asList(arrayOfEmps);
			empList.stream();
				
		
		// 3.
			
			Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
			
		// 4.
			
			Stream.Builder<Employee> empStreamBuilder = Stream.builder();

			empStreamBuilder.accept(arrayOfEmps[0]);
			empStreamBuilder.accept(arrayOfEmps[1]);
			empStreamBuilder.accept(arrayOfEmps[2]);

			Stream<Employee> empStream = empStreamBuilder.build();
			
			//empStream.forEachOrdered();
	}

}
