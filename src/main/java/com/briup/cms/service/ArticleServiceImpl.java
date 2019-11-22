package com.briup.cms.service;



import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.cms.utils.CustomerException;
import com.briup.cms.bean.Cms_article;
import com.briup.cms.bean.Cms_articleExample;
import com.briup.cms.bean.extend.ArticleExtend;
import com.briup.cms.dao.Cms_articleMapper;
import com.briup.cms.dao.extend.ArticleExtendMapper;

/**
 * @program: cms_jd1911
 * @description: 文章的业务实现类
 * @author: charles
 * @create: 2019-11-12 10:21
 **/
@Service
public class ArticleServiceImpl implements IArticleService {
    @Resource
    private Cms_articleMapper cms_articleMapper;
    @Resource
    private ArticleExtendMapper articleExtendMapper;

    @Override
    public List<Cms_article> findAll() {
        return cms_articleMapper.selectByExample(new Cms_articleExample());
    }

    @Override
    public List<ArticleExtend> cascadeFindAll() {
        return articleExtendMapper.selectAll();
    }

    @Override
    public ArticleExtend findById(long id) {
        return articleExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Cms_article cms_article) throws CustomerException {
        if(cms_article.getId()!=null){
        	cms_articleMapper.updateByPrimaryKey(cms_article);
        } else {
            // 标题不能重名
        	Cms_articleExample example = new Cms_articleExample();
            example.createCriteria().andTitleEqualTo(cms_article.getTitle());

            List<Cms_article> articles = cms_articleMapper.selectByExample(example);
            if(articles.size()>0){
                throw new CustomerException("标题不能重复");
            }
            // 初始化
            cms_article.setPublishTime(new Date().getTime());
            cms_article.setStatus(ArticleExtend.STATUS_UNCHECK);
            cms_article.setThumpDown(0l);
            cms_article.setThumpUp(0l);
            cms_articleMapper.insert(cms_article);
        }
    }
}
