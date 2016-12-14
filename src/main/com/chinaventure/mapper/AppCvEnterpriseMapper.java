package com.chinaventure.mapper;

import com.chinaventure.entiy.AppCvEnterprise;

/**
 * Created by Rock on 2016/12/9.
 */
public interface AppCvEnterpriseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AppCvEnterprise record);

    int insertSelective(AppCvEnterprise record);

    AppCvEnterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(AppCvEnterprise record);
}
