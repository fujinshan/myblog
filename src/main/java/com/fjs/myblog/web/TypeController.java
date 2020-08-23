package com.fjs.myblog.web;

import com.fjs.myblog.entity.Type;
import com.fjs.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fjs72 on 2020/8/23 12:30
 */
@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @GetMapping("/types")
    public String list(@PageableDefault(size = 10,sort = {"id"},direction = Sort.Direction.DESC) Pageable pageable, Model model)
    {
        model.addAttribute("page",typeService.listType(pageable));
        return "admin/types";
    }

    @GetMapping("/types/input")
    public String input()
    {
        return "admin/types-input";
    }

    @PostMapping("/types")
     public String input(Type type)
    {
        Type t = typeService.saveType(type);
        if(t==null)
        {

        }
        else{

        }
        return "redirect:/admin/types";

    }
}
