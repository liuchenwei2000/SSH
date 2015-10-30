/**
 * 
 */
package com.ssh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssh.service.IUserService;
import com.ssh.util.StringUtil;

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
@RequestMapping("/freemarker")
public class FreeMarkerController {

	@Resource
	private IUserService userService;
	
	@RequestMapping
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Hello FreeMarker!");
		mv.addObject("users", userService.getAllUser());
		mv.setViewName("user_list");
		return mv;
	}
	
	@RequestMapping(path = "/delete/{userid}")
	public ModelAndView delete(@PathVariable String userid) {
		if(StringUtil.isEmpty(userid)){
			throw new IllegalArgumentException("userid cannot be null");
		}

		userService.deleteUser(userid);
		
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", userid);
		return mv;
	}
}
