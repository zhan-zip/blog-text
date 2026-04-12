package com.lrm.web.admin;

import com.lrm.service.BlogService;
import com.lrm.service.TypeService;
import com.lrm.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("com.lrm")
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @GetMapping("/")
    public String index(@PageableDefault(size = 3,sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable, BlogQuery blog, Model model) {
        model.addAttribute("page",blogService.listBlog(pageable));
        model.addAttribute("types",typeService.listTypeTop(6)); //嗯显示几个分类
        System.out.println("--index控制器执行了---");
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
