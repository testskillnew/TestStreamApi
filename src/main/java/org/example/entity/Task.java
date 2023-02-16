package org.example.entity;

import lombok.Builder;
import lombok.Data;
import org.example.entity.enums.TASK_STATUS;

import java.time.LocalDateTime;

@Data
@Builder
public class Task {

    private Long id;
    private LocalDateTime creation;
    private LocalDateTime deadline;
    private Long rewardPoints;
    private Long penaltyPoints;
    private String title;
    private String description;

    private TASK_STATUS taskStatus;
}
