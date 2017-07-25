package lxing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lxing.entity.Article;
import lxing.entity.Page;
import lxing.service.SearchService;

import java.util.HashMap;

/**
 * Created by lxing on 2017/3/11.
 */

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public String view(String queryString, HttpServletRequest request) {
        request.setAttribute("queryString", queryString);
        return "content";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list(String id ,HttpServletRequest request) {
        System.out.println(id);
        System.out.println();
        HashMap<String,String> map = new HashMap<>();
        map.put("aaa","aaa1");
        map.put("bbb","bbb1");
        map.put("ccc","ccc1");
        return map;
    }


    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "index";
    }
}
