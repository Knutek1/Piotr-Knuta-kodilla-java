package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return ("Processing "+taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskName==null || whatToPaint==null || color==null)
        return false;
        else
            return true;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
