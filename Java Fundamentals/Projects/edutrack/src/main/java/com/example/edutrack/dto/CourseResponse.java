
package com.example.edutrack.dto;

import java.math.BigDecimal;

public record CourseResponse(
    Long id,
    String title,
    String description,
    Integer durationInWeeks,
    BigDecimal fee,
    Boolean active
) {
}
