package com.example.demo.userdemo.ctl;

import com.example.demo.common.baseModel.NCCommonSVO;
import com.example.demo.userdemo.service.IUserDemoService;
import com.example.demo.userdemo.svo.UsersDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private IUserDemoService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("/index");
        return mav;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("/views/home");
        return mav;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView listUsers1(NCCommonSVO param) {
        ModelAndView mav = new ModelAndView("/views/list");
        List<NCCommonSVO> userList = userService.selList(param);
        mav.addObject("list", userList);

        return mav;
    }
}