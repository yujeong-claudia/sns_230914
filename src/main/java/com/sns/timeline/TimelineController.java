package com.sns.timeline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/timeline")
@Controller	
public class TimelineController {
	@GetMapping("/timeline-view")
	public String signUpView(Model model) {
		model.addAttribute("viewName", "user/signUp");
		return "template/layout";
	}
}
