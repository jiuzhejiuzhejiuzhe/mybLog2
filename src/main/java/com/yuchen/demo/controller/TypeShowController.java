package com.yuchen.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuchen.demo.pojo.Type;
import com.yuchen.demo.queryVo.FirstPageBlog;
import com.yuchen.demo.service.BlogService;
import com.yuchen.demo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: 清峰
 * @date: 2020/9/24 13:17
 * @code: 愿世间永无Bug!
 * @description:
 */
@Controller
public class TypeShowController {

    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/types/{id}")
    public String listType(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                           @PathVariable Long id, Model model){
        List<Type> types = typeService.listTypesAndBlogs();
        if (id==-1){
            id=types.get(0).getId();
        }
        model.addAttribute("types",types);
        List<FirstPageBlog> blogs = blogService.getBlogsByTypeId(id);
        PageHelper.startPage(pageNum,1000);
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("activeTypeId",id);//增添样式 id传回去，当前分类颜色会变深
        return "types";
    }
}
