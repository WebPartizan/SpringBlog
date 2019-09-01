package com.kosmocourses.springblogtest.controler;

import com.kosmocourses.springblogtest.model.Post;
import com.kosmocourses.springblogtest.model.Search;
import com.kosmocourses.springblogtest.model.Users;
import com.kosmocourses.springblogtest.service.PostService;
import com.kosmocourses.springblogtest.service.SearchPost;
import com.kosmocourses.springblogtest.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controler {
    @Autowired
    PostService postService;
    SearchPost searchPost;
    UsersService usersService;


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "It is my blog!";
    }

    public Post getPost() {
        return postService.getPost();
    }

    public Search getSearchPost() {
        return searchPost.getSearchPost();
    }

    public Users getUsers() {
        return usersService.getUsers();
    }


}
