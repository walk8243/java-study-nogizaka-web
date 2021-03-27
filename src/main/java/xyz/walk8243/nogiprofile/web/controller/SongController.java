package xyz.walk8243.nogiprofile.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.walk8243.nogiprofile.web.service.SongService;

@Controller
@RequestMapping(path = "/song")
public class SongController {
	@Autowired
	SongService songService;

	@GetMapping(path = {"", "/all"})
	public String all(Model model) {
		model.addAttribute("songs", songService.getAll());
		return "songs";
	}
}
