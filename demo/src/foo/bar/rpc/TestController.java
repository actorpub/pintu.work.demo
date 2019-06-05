package foo.bar.rpc;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class TestController implements Controller {
	
	/*
	 * something wrong here, can not find View (named user)
	 */
	
	@RequestMapping("/user.json")
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("here");
		Map<String, String> result = new LinkedHashMap<String, String>();
		result.put("username", "goodJob");
		result.put("password", "cannotRemeber");
		return new ModelAndView().addObject("ffff", "111").addObject("ccc","kkk").addAllObjects(result);
	}

}
