package god.com.cmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GodComIndexController {

	@RequestMapping("/main.do")
	public String index(ModelMap model) {
		return "god/com/cmm/EgovUnitMain";
	}

}
