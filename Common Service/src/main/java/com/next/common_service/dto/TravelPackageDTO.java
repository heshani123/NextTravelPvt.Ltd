package com.next.common_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelPackageDTO {
    private int id;
    private String packageName;
    private int starRate;
    private String description;
}
