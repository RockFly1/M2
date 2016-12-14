package com.chinaventure.action;

import com.chinaventure.sercive.AppCvEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Rock on 2016/12/9.
 */
@Controller
@RequestMapping(value = "/ap")
public class AppCvEnterpriseAction {
    @Autowired
    private AppCvEnterprise appCvEnterprise;

    @RequestMapping(value = "/dek")
    public java.lang.String apPage(HttpServletRequest request){
        int spi=2122;
        appCvEnterprise.deleteKey(spi);
        return "ap/dek";
    }
}
