package org.example;
import java.time.LocalDate;
public class Notes {
    String description;
    Boolean isDone;
    String title;
    int numberOfDaysLeft;
    LocalDate DateNoteGenerated;
    String DueDate;



    Notes(String title, String description, Boolean isDone, String DueDate ){
        this.title=title;
        this.description=description;
        //this.numberOfDaysLeft=numberOfDaysLeft;
        this.isDone=isDone;
        this.DateNoteGenerated=LocalDate.now();
        this.DueDate=DueDate;

    }
    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public LocalDate getDateNoteGenerated() {
        return DateNoteGenerated;
    }

    public void setDateNoteGenerated(LocalDate dateNoteGenerated) {
        DateNoteGenerated = dateNoteGenerated;
    }

    public int getNumberOfDaysLeft() {
        return numberOfDaysLeft;
    }

    public void setNumberOfDaysLeft(int numberOfDaysLeft) {
        this.numberOfDaysLeft = numberOfDaysLeft;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

