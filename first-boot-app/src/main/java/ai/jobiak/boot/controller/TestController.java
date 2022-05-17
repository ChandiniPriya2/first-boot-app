package ai.jobiak.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
@RequestMapping(path="/test",method=RequestMethod.GET)
public String test(@RequestParam(name="ioc",defaultValue="Boston",required=true)String ioc,Model model) {
	model.addAttribute("com","jobiak");
	model.addAttribute("ho",ioc);
	model.addAttribute("ai","vizag");
	
	return "success";
}
}
