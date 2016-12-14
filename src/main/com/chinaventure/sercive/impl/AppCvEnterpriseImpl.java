package com.chinaventure.sercive.impl;

import com.chinaventure.mapper.AppCvEnterpriseMapper;
import com.chinaventure.sercive.AppCvEnterprise;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rock on 2016/12/9.
 */
@Service("appCvEnterpriseImpl")
public class AppCvEnterpriseImpl implements AppCvEnterprise {
    @Autowired
    private AppCvEnterpriseMapper appCvEnterpriseMapper;

    @Override
    public int deleteKey(@Param("apeId") Integer apeId) {
        return appCvEnterpriseMapper.deleteByPrimaryKey(apeId);
    }
}
