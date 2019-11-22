package com.briup.cms.dao;

import com.briup.cms.bean.Cms_article;
import com.briup.cms.bean.Cms_articleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Cms_articleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    long countByExample(Cms_articleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int deleteByExample(Cms_articleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int insert(Cms_article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int insertSelective(Cms_article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    List<Cms_article> selectByExample(Cms_articleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    Cms_article selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Cms_article record, @Param("example") Cms_articleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int updateByExample(@Param("record") Cms_article record, @Param("example") Cms_articleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int updateByPrimaryKeySelective(Cms_article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Wed Nov 13 09:31:53 CST 2019
     */
    int updateByPrimaryKey(Cms_article record);
}