package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String TASK_LIST_NAME = "Test list: completed";
    private static final String TASK_LIST_DESCRIPTION = "Test description";

    @Test
    public void testFindByListName() {
        //given
        TaskList taskList = new TaskList(TASK_LIST_NAME, TASK_LIST_DESCRIPTION);

        //when
        taskListDao.save(taskList);

        //then
        String listName = taskList.getListName();
        int id = taskList.getId();
        List<TaskList> readListName = taskListDao.findByListName(listName);
        Assert.assertFalse(readListName.isEmpty());
        Assert.assertEquals(TASK_LIST_NAME, listName);

        //cleanUp
        taskListDao.deleteById(id);
    }
}
