package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("comprar patatas", "muchos patatas", 150.0);
            case PAINTING_TASK:
                return new PaintingTask("pintar mi comedor", "amarillo", "comedor");
            case DRIVING_TASK:
                return new DrivingTask("viajar a mexico", "a la playa", "un camion");
            default:
                return null;
        }
    }
}
