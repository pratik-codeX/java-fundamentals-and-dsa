
package com.example.edutrack.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record CourseRequest(

    @NotBlank(message = "Course title is required")
    @Size(max = 150, message = "Title cannot exceed 150 characters")
    String title,

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    String description,

    @NotNull(message = "Duration is required")
    @Min(value = 1, message = "Duration must be at least 1 week")
    Integer durationInWeeks,

    @NotNull(message = "Fee is required")
    @DecimalMin(value = "0.0", message = "Fee cannot be negative")
    @Digits(integer = 8, fraction = 2, message = "Fee supports up to 2 decimal places")
    BigDecimal fee,

    @NotNull(message = "Active status is required")
    Boolean active

) {
}
