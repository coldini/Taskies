package assignment9;

import java.time.LocalDateTime;

public class HoneyDoListMain{
	
	public static void main(String[] args) {
		 HoneyDoList honeydo = new HoneyDoList();
		 
		   System.out.println(honeydo);		
		   honeydo.addTask(new Task(LocalDateTime.of(2023, 3, 23, 13, 0), "take aspirin", 1, 120));
		   System.out.println(honeydo);
		   honeydo.addTask(new Task(LocalDateTime.of(2024, 5, 13, 13, 0), "see dentist", 2, 180));
		   System.out.println("prints half of the list");
		   System.out.print(honeydo.toString());
		   honeydo.addTask(new Task(LocalDateTime.of(2025, 6, 17, 14, 0), "visit parents", 5, 360));
		   honeydo.addTask(new Task(LocalDateTime.of(2026, 4, 18, 13, 0), "see doctor", 4, 270));
		   honeydo.addTask(new Task(LocalDateTime.of(2023, 2, 12, 13, 0), "clean room", 6, 90));
		   honeydo.addTask(new Task(LocalDateTime.of(2012, 5, 11, 15, 0), "buy house", 7, 430));
		   System.out.println("finding location of the string");
		   System.out.println(honeydo.find("visit parents"));
		   System.out.println("total time");
		   System.out.println(honeydo.totalTime());
		   System.out.println(" index of shortest time");
		   System.out.println(honeydo.shortestTime() + "\n");
		   System.out.println("the task at the index of 2");
		   System.out.println(honeydo.getTask(2) + "\n");
		   System.out.println(" the removed");
		   System.out.print(honeydo.completeTask(1) + "\n");
		   System.out.println(" check to see if moved");
		   System.out.print(honeydo.toString());
		   
		   System.out.println("List of overdue tasks:");
		   Task[] overdueTasks = honeydo.overdueTasks();
		   for(Task task : overdueTasks) {
		       System.out.println(task.toString());
		   }
		   
	}
	
}