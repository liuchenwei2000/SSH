/**
 * 
 */
package com.ssh.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssh.service.IUserService;
import com.ssh.util.StringUtil;
import com.ssh.vo.User;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年10月24日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private IUserService userService;

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", userService.getAllUser());
		mv.setViewName("user");
		return mv;
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ModelAndView add(User user) {
		if(StringUtil.isEmpty(user.getCode()) || StringUtil.isEmpty(user.getName())){
			logger.error("code or name cannot be null");
			throw new IllegalArgumentException("code or name cannot be null");
		}
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", userService.addNewUser(user));
		return mv;
	}
	
	@RequestMapping(path = "/delete/{userid}")
	public ModelAndView delete(@PathVariable String userid) {
		if(StringUtil.isEmpty(userid)){
			logger.error("userid cannot be null");
			throw new IllegalArgumentException("userid cannot be null");
		}

		userService.deleteUser(userid);
		
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", userid);
		return mv;
	}
}
