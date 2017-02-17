package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSorter {

	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(1, "A name 1", 4));
		tasks.add(new Task(2, "C name 2", 2));
		tasks.add(new Task(3, "B name 3", 1));
		tasks.add(new Task(4, "E name 4", 4));
		tasks.add(new Task(5, "D name 5", 3));
		
			
		tasks.forEach(System.out::println);
		
		Collections.sort(tasks);
		
		tasks.forEach(System.out::println);

	}

}
