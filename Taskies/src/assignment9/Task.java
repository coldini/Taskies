package assignment9;
import java.time.LocalDateTime;
//Colden Jeanmonod
		//04/12/2024
		//Assignment 9 Task/HoneyDoList
		//
		//Gives Tasks various qualities and checks to see if the various qualities of them in the Task Main
		//In HoneyDoListMain, it makes an array of various tasks and checks the qualities such as time, which ones are overdo and the like

public class Task{
	private LocalDateTime whenDue;
	private String name;
	private int priority;
	private int estMinsToComplete;
	
	public Task( LocalDateTime t, String n, int p, int estimate) {
		whenDue = t;
		name = n;
		priority = p;
		estMinsToComplete = estimate;
				
	}
	
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public int getMins() {
		return estMinsToComplete;
	}
	
	public LocalDateTime getwhenDue() {
		return whenDue;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public void setwhenDue(LocalDateTime newwhenDue) {
		whenDue = newwhenDue;
	}
	public void setMins(int newMins) {
		estMinsToComplete = newMins;
	}
	
	
	public String toString() {
		return " Name: " + name + " due by, " + whenDue + ", estimated time to complete, " + estMinsToComplete + " mins, the priority is, " + priority;
		
	}
	
	public void increasePriority(int increase) {
		if(increase > 0) {
			priority += increase;
		}
	}
	
	public void decreasePriority(int decrease) {
		if(decrease <= 0) {
			priority = 0;
		}else {
			priority -= decrease;
		}
	}
	  public boolean overdue() {
	      LocalDateTime currentDateTime = LocalDateTime.now();
	      return currentDateTime.isAfter(whenDue);
	  }
	

}