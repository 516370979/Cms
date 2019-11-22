package com.briup.cms.bean.extend;


import java.util.List;
import com.briup.cms.bean.Cms_article;
import com.briup.cms.bean.Cms_category;
import com.briup.cms.bean.Cms_coment;

/**
 * @program: cms_jd1911
 * @description: 文章拓展类
 * @author: charles
 * @create: 2019-11-12 10:26
 **/
public class ArticleExtend extends Cms_article {
    public static final String STATUS_UNCHECK="未审核";
    public static final String STATUS_CHECK_PASS="审核通过";
    public static final String STATUS_CHECK_NOPASS="审核未通过";

    private Cms_category cms_category;
    private List<Cms_coment> cms_coment;
	public Cms_category getCms_category() {
		return cms_category;
	}
	public void setCms_category(Cms_category cms_category) {
		this.cms_category = cms_category;
	}
	public List<Cms_coment> getCms_coment() {
		return cms_coment;
	}
	public void setCms_coment(List<Cms_coment> cms_coment) {
		this.cms_coment = cms_coment;
	}

}
