package assignment9;
import java.time.LocalDateTime;
public class TaskMain{
	
	public static void main(String [] args) {
		
		Task hW = new Task(LocalDateTime.of(2023, 3, 23, 13, 0), "post 1068 homework", 1,  180);
		
		System.out.println(hW.getName());
		System.out.println(hW.getPriority());
		System.out.println(hW.getMins());
		System.out.println(hW.getwhenDue());
		hW.setMins(360);
		hW.setName("Assignment 10");
		hW.setwhenDue(LocalDateTime.of(2024,  4, 23, 13, 0));
		hW.decreasePriority(0);
		hW.increasePriority(10);
		System.out.println(hW.overdue());
		System.out.println(hW.toString());
		
		
	}
	
	
}