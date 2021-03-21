package xyz.walk8243.nogiprofile.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import xyz.walk8243.nogiprofile.web.service.IndexService;

@Controller
public class IndexController {
	@Autowired
	IndexService indexService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("be", indexService.getResponse());
		return "index";
	}
}
