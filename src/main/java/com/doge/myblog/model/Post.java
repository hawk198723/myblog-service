package com.doge.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String id;
    private String name;
    private String post;
    private String email;

    private String image;
    private String profilePic;
    private String timeStamp;
    private String file;
}
