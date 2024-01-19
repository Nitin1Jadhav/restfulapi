package com.myblog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private Long id;
    @NotNull
    @Size(min = 2, message = "Post Title Should Have At Least 2 Charecters")
    private String title;
    @NotNull
    @Size(min = 10, message = "post Description Should Have At Least 10 Or More Charecters")
    private String description;
    @NotNull
    @NotEmpty
    private String content;
}
