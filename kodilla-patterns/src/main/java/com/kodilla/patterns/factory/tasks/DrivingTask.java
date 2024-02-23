package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
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
        if(taskName==null || where==null || using == null)
        return false;
        else
            return true;
    }
}
