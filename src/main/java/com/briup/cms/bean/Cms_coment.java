package com.briup.cms.bean;

public class Cms_coment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.content_time
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private Long contentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.status
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.user_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.article_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.parent_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_coment.content
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.id
     *
     * @return the value of cms_coment.id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.id
     *
     * @param id the value for cms_coment.id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.content_time
     *
     * @return the value of cms_coment.content_time
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public Long getContentTime() {
        return contentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.content_time
     *
     * @param contentTime the value for cms_coment.content_time
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setContentTime(Long contentTime) {
        this.contentTime = contentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.status
     *
     * @return the value of cms_coment.status
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.status
     *
     * @param status the value for cms_coment.status
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.user_id
     *
     * @return the value of cms_coment.user_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.user_id
     *
     * @param userId the value for cms_coment.user_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.article_id
     *
     * @return the value of cms_coment.article_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.article_id
     *
     * @param articleId the value for cms_coment.article_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.parent_id
     *
     * @return the value of cms_coment.parent_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.parent_id
     *
     * @param parentId the value for cms_coment.parent_id
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_coment.content
     *
     * @return the value of cms_coment.content
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_coment.content
     *
     * @param content the value for cms_coment.content
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}