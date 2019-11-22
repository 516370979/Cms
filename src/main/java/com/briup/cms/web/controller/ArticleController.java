package com.briup.cms.web.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.cms.bean.Cms_article;
import com.briup.cms.bean.extend.ArticleExtend;
import com.briup.cms.service.IArticleService;
import com.briup.cms.utils.Message;
import com.briup.cms.utils.MessageUtil;

/**
 * @program: cms_jd1911
 * @description: 文章控制器类
 * @author: charles
 * @create: 2019-11-12 10:22
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleService articleService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Cms_article> list =articleService.findAll();
        return MessageUtil.success("success",list);
    }

    @GetMapping("cascadeFindAll")
    public Message cascadeFindAll(){
        List<ArticleExtend> list = articleService.cascadeFindAll();
        return MessageUtil.success("success",list);
    }

    @GetMapping("findById")
    public Message findById(long id){
        ArticleExtend articleExtend = articleService.findById(id);
        return MessageUtil.success("success",articleExtend);
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Cms_article cms_article){
        articleService.saveOrUpdate(cms_article);
        return MessageUtil.success("更新成功");
    }

}
