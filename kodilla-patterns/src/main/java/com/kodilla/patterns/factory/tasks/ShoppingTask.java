package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
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
        if(taskName==null || whatToBuy==null || quantity==0)
            return false;
        else
            return true;
    }
}
