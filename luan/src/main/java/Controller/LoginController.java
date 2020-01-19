package Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController implements Login {

	@Override
	public ModelAndView login() {		
			ModelAndView mav = new ModelAndView();
			mav.setViewName("Login");
			return mav;
	}


}
