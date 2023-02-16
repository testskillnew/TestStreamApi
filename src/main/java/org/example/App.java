package org.example;

import org.example.entity.Family;
import org.example.entity.Task;
import org.example.entity.User;
import org.example.entity.enums.TASK_STATUS;
import org.example.entity.enums.USER_ROLE;
import org.example.service.MapperService;
import org.example.util.Creator;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        MapperService mapperService = new MapperService();
        mapperService.getChildDto(1L, getUserList());
    }

































    private static List<User> getUserList() {
        Creator creator = new Creator();

        List<Family> families = new ArrayList<>();
        List<User> users = new ArrayList<>();

        families.add(creator.getFamily());
        List<Task> tasks1 = new ArrayList<>();
        tasks1.add(creator.getTask("Задача 1", TASK_STATUS.ACTIVE));
        tasks1.add(creator.getTask("Задача 2", TASK_STATUS.ACTIVE));
        tasks1.add(creator.getTask("Задача 3", TASK_STATUS.COMPLETED));
        tasks1.add(creator.getTask("Задача 4", TASK_STATUS.PENDING));
        tasks1.add(creator.getTask("Задача 5", TASK_STATUS.PENDING));

        users.add(creator.getUser("Artem", USER_ROLE.CHILD, families.get(0), tasks1));

        List<Task> tasks2 = new ArrayList<>();
        tasks2.add(creator.getTask("Задача 12", TASK_STATUS.COMPLETED));
        tasks2.add(creator.getTask("Задача 23", TASK_STATUS.ACTIVE));
        tasks2.add(creator.getTask("Задача 11", TASK_STATUS.COMPLETED));
        tasks2.add(creator.getTask("Задача 24", TASK_STATUS.PENDING));
        tasks2.add(creator.getTask("Задача 54", TASK_STATUS.ACTIVE));

        users.add(creator.getUser("Misha", USER_ROLE.CHILD, families.get(0), tasks2));

        families.add(creator.getFamily());
        List<Task> tasks3 = new ArrayList<>();
        tasks3.add(creator.getTask("Задача 111", TASK_STATUS.ACTIVE));
        tasks3.add(creator.getTask("Задача 222", TASK_STATUS.ACTIVE));
        tasks3.add(creator.getTask("Задача 333", TASK_STATUS.ACTIVE));
        tasks3.add(creator.getTask("Задача 451", TASK_STATUS.COMPLETED));
        tasks3.add(creator.getTask("Задача 512", TASK_STATUS.COMPLETED));

        users.add(creator.getUser("Nastya", USER_ROLE.CHILD, families.get(1), tasks3));

        List<Task> tasks4 = new ArrayList<>();
        tasks4.add(creator.getTask("Задача 123", TASK_STATUS.PENDING));
        tasks4.add(creator.getTask("Задача 41", TASK_STATUS.PENDING));
        tasks4.add(creator.getTask("Задача 214", TASK_STATUS.ACTIVE));
        tasks4.add(creator.getTask("Задача 17", TASK_STATUS.COMPLETED));
        tasks4.add(creator.getTask("Задача 98", TASK_STATUS.COMPLETED));

        users.add(creator.getUser("Nastya", USER_ROLE.PARENT, families.get(0), tasks4));
        return users;
    }
}
