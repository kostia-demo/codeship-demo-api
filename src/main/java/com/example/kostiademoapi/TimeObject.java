package com.example.kostiademoapi;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class TimeObject {
    @NotNull
    @Min(0)
    public Integer year;

    @NotNull
    @Min(1)
    @Max(12)
    public Integer month;

    @NotNull
    @Min(1)
    @Max(31)
    public Integer day;

    @NotNull
    @Min(0)
    @Max(23)
    public Integer hour;

    @NotNull
    @Min(0)
    @Max(59)
    public Integer minute;

    @NotNull
    @Min(0)
    @Max(59)
    public Integer second;
}
