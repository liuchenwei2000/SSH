/**
 * 
 */
package com.ssh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssh.service.IUserService;

/**
 * 
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��10��24��
 */
@Controller
@RequestMapping("/freemarker")
public class FreeMarkerController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Hello FreeMarker!");
		mv.addObject("users", userService.getAllUser());
		mv.setViewName("user_list");
		return mv;
	}
}
