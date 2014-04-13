package org.springframework.samples.mvc.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MappingController {

	
	@RequestMapping(value="/mapping/userpass", method=RequestMethod.GET)
	public @ResponseBody String userPass(@RequestParam("username") String user, @RequestParam("password") String pass) {
		return "Username is "+ user + " password is " + pass ;
	}

}
