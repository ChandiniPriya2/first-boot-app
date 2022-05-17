package ai.jobiak.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseDemo {
@RequestMapping("/hello")
@ResponseBody
public String demo() {
	return "hello ResponseBody Controller";
}
}
