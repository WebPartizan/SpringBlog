package com.kosmocourses.springblogtest.model;

import lombok.Data;

//Зарегистрированные пользователи блога
@Data
public class Users {
    private String login;
    private String parol;
}
