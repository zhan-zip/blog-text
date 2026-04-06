package com.lrm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("com.lrm")
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("--index---");
        System.out.println("控制器执行了");
        return "index";
    }

    @GetMapping("/archives")
    public String archives() {
        return "archives";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/tag")
    public String tag() {
        return "tag";
    }

    @GetMapping("/types")
    public String types() {
        return "types";
    }

    @GetMapping("/me")
    public String me() {
        return "me";
    }

    @GetMapping("/adminHome")
    public String adminHome() {
        return "admin/index";
    }

    @GetMapping("/blogsInput")
    public String blogsInput() {
        return "admin/blogs-input";
    }

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }

    @GetMapping("/typesInput")
    public String typesInput() {
        return "admin/types-input";
    }


}
