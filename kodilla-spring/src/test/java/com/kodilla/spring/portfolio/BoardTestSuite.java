package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTask("do grocery shopping");
        inProgressList.addTask("take the dog out");
        doneList.addTask("do java");

        //When
        String toDoTask = toDoList.getTask(0);
        String inProgressTask = inProgressList.getTask(0);
        String doneTask = doneList.getTask(0);

        //Then
        Assert.assertEquals("do grocery shopping", toDoTask);
        Assert.assertEquals("take the dog out", inProgressTask);
        Assert.assertEquals("do java", doneTask);
    }

}
