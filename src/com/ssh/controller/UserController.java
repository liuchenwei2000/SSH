/**
 * 
 */
package com.ssh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
	public ModelAndView add(@RequestParam("code") String code, @RequestParam("name") String name) {
		if(StringUtil.isEmpty(code) || StringUtil.isEmpty(name)){
			throw new IllegalArgumentException("code or name cannot be null");
		}
		User user = new User(code, name);

		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", userService.addNewUser(user));
		return mv;
	}
}
