package org.example.entity;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Family {

    private Long id;
    private String familyName;
}
