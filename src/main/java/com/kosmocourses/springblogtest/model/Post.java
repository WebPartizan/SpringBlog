package com.kosmocourses.springblogtest.model;

import lombok.Data;

import java.util.Date;

//Основной бизнес-объект Post
@Data
public class Post {
    private String text;
    private String foto;
    private String author;
    private Date date;
    private String comment;

}
