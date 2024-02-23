package com.kodilla.patterns.factory.tasks;

public enum TaskFactory {
    SHOPPING_TASK,PAINTING_TASK, DRIVING_TASK;
    public static Task makeTask(TaskFactory taskFactory){
        return switch (taskFactory){
            case DRIVING_TASK -> new DrivingTask("Collect cake","Bakery", "Car");
            case PAINTING_TASK -> new PaintingTask("Paint wall","Red", "Paintbrush");
            case SHOPPING_TASK -> new ShoppingTask("Buy snacks",null,25.5);
        };

    }
}
