package assignment9;

import java.util.Arrays;

public class HoneyDoList{
	private Task tasks[];
	private int numTasks;
	private final int INITIAL_CAPACITY = 10;
	
	public HoneyDoList() {
		tasks = new Task[INITIAL_CAPACITY];
		numTasks = 0;
				
	}
	
	public String toString() {
		String empty = "";
		
		for(int i = 0; i < tasks.length; i++) {
			if(tasks[i] != null) {
				empty += "item " + (i+1) +  tasks[i] + "\n";
			}
		}
		
		return empty;
	}
	
	public int find(String name) {
		for(int i = 0; i < tasks.length; i++) {
			if(tasks[i] !=null && tasks[i].getName().equalsIgnoreCase(name)) {
			return i;	
			
				}
			}
		return -1;
	}
	
	
	public int totalTime() {
	int total = 0;
		
		for(int i = 0; i < numTasks; i++) {
			total += tasks[i].getMins();
		}
		return total;
	}
	
	public int shortestTime() {
		if(numTasks == 0) {
			return -1;
		}
		int tiny = tasks[0].getMins();
		int tinyInd = 0;
		for(int i = 0; i< numTasks; i++) {
			int curTime = tasks[i].getMins();
			if(tiny > curTime) {
				tiny =curTime;
				tinyInd = i;
			}
		}
		return tinyInd;
	}
	
	
	public void addTask(Task task) {
		if(numTasks == tasks.length) {
			Task[] newTasks = Arrays.copyOf(tasks, tasks.length +1);
			tasks = newTasks;
		}
		tasks[numTasks] = task;
		numTasks ++;
		
	}
	
	public Task getTask(int index) {
		if(index > 0 && index <= tasks.length) {
			return tasks[index];
		}
		return null;
		
	}
	
	public Task completeTask(int index) {
		if(index>=0 && index<=numTasks) {
			Task removed = tasks[index];
			
			for(int i = index; i < numTasks-1; i++) {
				tasks[i] = tasks [i+1];
			}
			
			tasks[numTasks - 1] = null;
			numTasks--;
			return removed;
			
		}
		
		return null;
	}
	
	public Task[] overdueTasks() {
	    Task[] overdueStuff = new Task[numTasks];
	    int overdueIndex = 0;
	    for(int i = 0; i < numTasks; i++) {
	        if(tasks[i].overdue()) {
	            overdueStuff[overdueIndex++] = tasks[i];
	        }
	    }
	    Task[] overDue = Arrays.copyOf(overdueStuff, overdueIndex);
	    return overDue;
	}
	
}