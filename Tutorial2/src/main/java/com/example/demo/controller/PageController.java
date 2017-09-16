package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
	@RequestMapping("/hello")
	public String index ()
	{
		return "hello";
	}
	
	@RequestMapping("/greeting")
	public String greeting (@RequestParam(value = "name") String name, Model model)
	{
		model.addAttribute ("name​", name);
		return "greeting";
	}
	@RequestMapping(value = {"/greeting", "greeting/{name}"})
	public String greetingPath(@PathVariable Optional<String> name, Model model) {
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		} 
		else {
			model.addAttribute("name", "dengklek");
		}
		return "greeting";
	}
	
	@RequestMapping("/perkalian")
	public String greetingPath (@RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b ,Model model)
	{

		if(a == null && b == null) {
			int c = 0;
			a = 0;
			b = 0;
			model.addAttribute("c", c);
			model.addAttribute("b", b);
			model.addAttribute("a", a);
			
		}
		else if(a == null) {
			
			a = 0;
			
			int c = a * b;
			model.addAttribute("c", c);
			model.addAttribute("b", b);
			model.addAttribute("a", a);
			
		}
		
		else if(b == null) {
			
			b = 0;
			
			int c = a * b;
			model.addAttribute("c", c);
			model.addAttribute("b", b);
			model.addAttribute("a", a);
			
		}
		
		else {
			int c = a * b;
			model.addAttribute("c", c);
			model.addAttribute("b", b);
			model.addAttribute("a", a);
		}
		return "perkalian";
	
	}

	


}