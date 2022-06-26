package com.emrhnsyts.leaveamark.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class CommentChangeRequest {
    private Long commentId;
    @NotBlank(message = "Text field can not be null")
    private String text;
}
