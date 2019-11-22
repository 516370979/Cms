package com.briup.cms.dao.extend;



import java.util.List;

import com.briup.cms.bean.Cms_coment;



public interface CommentExtendMapper {

    List<Cms_coment> selectByArticleId(long article_id);
}
