package org.example.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ChildDto {

    private String name;
    private String photo;
    private Long numberOfCompletedTasks;
    private Long numberOfActiveTasks;
    private List<Long> taskRequestIdsDtos;
}
