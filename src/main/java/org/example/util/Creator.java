package org.example.util;

import org.example.entity.Family;
import org.example.entity.Task;
import org.example.entity.User;
import org.example.entity.enums.TASK_STATUS;
import org.example.entity.enums.USER_ROLE;

import java.util.List;

public class Creator {

    private Long userId = 0L;
    private Long familyId = 0L;
    private Long taskId = 0L;

    public User getUser(String name, USER_ROLE userRole, Family family, List<Task> tasks) {
        userId++;
        return User.builder()
                .id(userId)
                .name(name)
                .user_role(userRole)
                .family(family)
                .tasks(tasks)
                .build();
    }

    public Task getTask(String title, TASK_STATUS taskStatus) {
        taskId++;
        return Task.builder()
                .id(taskId)
                .title(title)
                .taskStatus(taskStatus)
                .build();
    }

    public Family getFamily() {
        familyId++;
        return Family.builder()
                .id(familyId)
                .build();
    }
}
