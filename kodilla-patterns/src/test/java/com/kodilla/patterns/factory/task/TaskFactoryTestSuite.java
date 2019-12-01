package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreatingShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        System.out.println("Task: " + shoppingTask.getTaskName());
        shoppingTask.executeTask();
        //then
        Assert.assertTrue(shoppingTask.isExecuted());
        Assert.assertEquals("comprar patatas", shoppingTask.getTaskName());
    }

    @Test
    public void testCreatingPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        System.out.println("Task: " + paintingTask.getTaskName());
        paintingTask.executeTask();
        //then
        Assert.assertTrue(paintingTask.isExecuted());
        Assert.assertEquals("pintar mi comedor" , paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        System.out.println("Task: " + drivingTask.getTaskName());
        drivingTask.executeTask();
        //then
        Assert.assertTrue(drivingTask.isExecuted());
        Assert.assertEquals("viajar a mexico", drivingTask.getTaskName());
    }
}
