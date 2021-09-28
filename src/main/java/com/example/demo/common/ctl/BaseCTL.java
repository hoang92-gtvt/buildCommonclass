package com.example.demo.common.ctl;

import org.springframework.web.servlet.ModelAndView;

public class BaseCTL extends CommonCTL{
    protected ModelAndView setView(String viewName, String attribute, String value){
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        if(attribute!=null && value!=null){
            mav.addObject(attribute, value);
        }
        return mav;
    }
}
