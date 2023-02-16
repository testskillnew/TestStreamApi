package org.example.service;

import org.example.dto.ChildDto;
import org.example.entity.Family;
import org.example.entity.Task;
import org.example.entity.User;
import org.example.entity.enums.TASK_STATUS;
import org.example.entity.enums.USER_ROLE;
import org.example.util.Creator;

import java.util.ArrayList;
import java.util.List;

public class MapperService {


    // пройтись по массиву users.
    // Найти пользователей, у которых family Id = 1.
    // Отфильтровать список, чтобы осталис только user с ролью CHILD.
    // Заммапить все нужные поля для childDto из user
    // numberOfCompletedTasks - количество тасок со статусом COMPLETED
    // numberOfActiveTasks - количество тасок со статусом ACTIVE
    // taskRequestIdsDtos - список id тасок, у которых статус PENDING;

    public List<ChildDto> getChildDto(Long familyId, List<User> users) {

        return null;
    }
}
