package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }



    @Override
    public void executeTask() {
            System.out.println("Executing painting task");
            isExecuted = true;
    }

    @Override
    public boolean isExecuted() {
        return isExecuted;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                '}';
    }
}
