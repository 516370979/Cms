package com.briup.cms.bean;

public class Cms_articleWithBLOBs extends Cms_article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_article.content
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_article.source
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    private String source;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_article.content
     *
     * @return the value of cms_article.content
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_article.content
     *
     * @param content the value for cms_article.content
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_article.source
     *
     * @return the value of cms_article.source
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_article.source
     *
     * @param source the value for cms_article.source
     *
     * @mbg.generated Tue Nov 12 16:34:11 CST 2019
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}