package com.mftplus.mftautomationsystemapplication.workflow.exeption;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ExceptionMessage
{
    private boolean error;
    private String message;
    private LocalDateTime timestamp;
}