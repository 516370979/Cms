package com.briup.cms.service;



import java.util.List;

import com.briup.cms.utils.CustomerException;
import com.briup.cms.bean.Cms_article;
import com.briup.cms.bean.extend.ArticleExtend;
/** 
 * @Description:  
 * @Param:  
 * @return:  
 * @Author: charles 
 * @Date: 2019-11-12 
 */ 
public interface IArticleService {
    /** 
     * @Description:
     * @Param: [] 
     * @return: java.util.List<com.briup.apps.cms.bean.Article> 
     * @Author: charles 
     * @Date: 2019-11-12 
     */ 
    List<Cms_article> findAll();

    List<ArticleExtend> cascadeFindAll();

    ArticleExtend findById(long id);

    void saveOrUpdate(Cms_article cms_article) throws CustomerException;
}
