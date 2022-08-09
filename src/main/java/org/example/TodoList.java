package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.time.Period;


public class TodoList {
    ArrayList<Notes> todoList =new <Notes> ArrayList();
   public void createTask(String inputText,String noteDescription, Boolean checkIsDone,String DateDue  ){
        Notes firstNote= new Notes(inputText,noteDescription,checkIsDone,DateDue);
        //LocalDate RetreiveCurrentdate= LocalDate.now();


        //Scanner input =new Scanner(System.in);
        //System.out.println("What would be the description of "+firstNote.title);
        //firstNote.description=input.nextLine();
        todoList.add(firstNote);

    }
    void viewList(){
        for (Notes str: todoList){
            str.setNumberOfDaysLeft(CheckHowManyDaysBeforeDueDate(str.getDueDate(),str.getDateNoteGenerated()));

            System.out.println("Title: "+str.getTitle()+"\n"+ "Description: "+str.getDescription()+"\n"+"Date Created: "+str.getDateNoteGenerated()+"\n"+"Due Date: "+str.DueDate+"\n"+"Days Left: "+str.getNumberOfDaysLeft()+"\n"+"Done?: "+str.getDone());
            System.out.println("===================");
        }
        System.out.println("\n");
    }
    void UpdateToDone(String wordSearch){
        Iterator<Notes> checkForUpdate= todoList.iterator();
        while(checkForUpdate.hasNext()){
            Notes foundWord=checkForUpdate.next();
            if(wordSearch.equals(foundWord.title)){
               if(foundWord.getDone()==false){
                   System.out.println(foundWord.getNumberOfDaysLeft()+" Have Left");
               }
            }
        }

    }
    void DeleteTask(String wordToSearch){
        Iterator<Notes> checkForNotes= todoList.iterator();
        while(checkForNotes.hasNext()){
            Notes selectedTask= checkForNotes.next();
            if(selectedTask.getTitle()==wordToSearch){
                checkForNotes.remove();

            }
        }

    }
    int CheckHowManyDaysBeforeDueDate(String Date,LocalDate DateGen){

            LocalDate DatetoComplete= LocalDate.parse(Date);
            Period FindtheDiffernce=Period.between(DateGen,DatetoComplete);
            //DuedateFound.setNumberOfDaysLeft();
            return FindtheDiffernce.getDays();

        //Fuction Find out how many days left from the start day they have from their due date
    }
    void ViewTask(String task){
        Iterator<Notes> checkForNotes= todoList.iterator();
        while(checkForNotes.hasNext()){
            Notes selectedTask= checkForNotes.next();
            if(selectedTask.getTitle()==task){
                System.out.println("Task: "+selectedTask.title+"\n"+selectedTask.description);
            }
        }
    }
}
