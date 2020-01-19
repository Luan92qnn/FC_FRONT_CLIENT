package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public interface Login {

	@RequestMapping("/")
	ModelAndView login ();
	
}
