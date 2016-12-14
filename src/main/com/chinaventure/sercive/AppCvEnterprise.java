package com.chinaventure.sercive;

import org.apache.ibatis.annotations.Param;

/**
 * Created by Rock on 2016/12/9.
 */
public interface AppCvEnterprise {
    //数据删除
    int deleteKey(@Param("apeId") Integer apeId);
}
