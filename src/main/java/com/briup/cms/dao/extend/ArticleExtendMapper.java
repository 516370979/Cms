package com.briup.cms.dao.extend;

import java.util.List;
//hfjd
import com.briup.cms.bean.extend.ArticleExtend;
public interface ArticleExtendMapper {
    List<ArticleExtend> selectAll();

    ArticleExtend selectById(long id);
}
