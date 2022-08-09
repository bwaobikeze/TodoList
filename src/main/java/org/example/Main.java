package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        TodoList listOfTask=new TodoList();
        listOfTask.createTask("Delete Alarm"," Test: Description ",false,"2022-07-05");
        listOfTask.createTask("Record Meeting","Test 2: Description",false,"2022-07-04");
        //listOfTask.CheckHowManyDaysBeforeDueDate();
        listOfTask.viewList();
        //listOfTask.DeleteTask("Delete Alarm");
     //listOfTask.viewList();
    }

}