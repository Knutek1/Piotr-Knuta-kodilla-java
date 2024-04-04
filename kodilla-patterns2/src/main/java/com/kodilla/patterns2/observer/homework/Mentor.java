package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    public Mentor(String nameMentor) {
        this.nameMentor = nameMentor;
    }

    String nameMentor;
    int counter;
    @Override
    public void update(TaskList taskList) {
        System.out.println(taskList.getName() + " was updated, message sent to: " + nameMentor);
        counter++;
    }

    public String getNameMentor() {
        return nameMentor;
    }

    public int getCounter() {
        return counter;
    }
}
