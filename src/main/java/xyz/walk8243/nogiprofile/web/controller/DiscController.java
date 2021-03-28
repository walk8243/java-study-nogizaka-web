package xyz.walk8243.nogiprofile.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.walk8243.nogiprofile.web.service.DiscService;

@Controller
@RequestMapping(path = "/disc")
public class DiscController {
	@Autowired
	DiscService discService;

	@GetMapping(path = {"", "/all"})
	public String getAll(Model model) {
		model.addAttribute("discs", discService.getAll());
		return "discs";
	}

	@GetMapping(path = "/{id}")
	public String get(@PathVariable("id") Integer discId, Model model) {
		model.addAttribute("disc", discService.get(discId));
		return "disc";
	}
}
