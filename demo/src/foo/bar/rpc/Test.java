package foo.bar.rpc;
/**
 * @author Silence
 * �������controller�ķ���
 * �Ժ���Ŀ����ҪһЩ
 * ���Խ���request body��json�ַ���
 * װ����һ��map��ܷ���
 */

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("*.json")
public class Test {
	

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Object get() {
		System.out.println("getting...");
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		result.put("username", "goodJob");
		result.put("password", "cannotRemeber");
		result.put("u2", new User("tom",3,"secret"));
		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Object post(@RequestBody LinkedHashMap<String, Object> jsonObject) {
		System.out.println("posting... json is " + jsonObject);
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		result.put("resp", "ok");
		result.put("response other", "ok2");
		result.put("u2", new User("tom",3,"secret"));
		return result;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Object put(@RequestBody LinkedHashMap<String, Object> jsonObject) {
		System.out.println("putting... json is " + jsonObject);
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		result.put("resp", "ok");
		result.put("response other", "ok2");
		result.put("u2", new User("tom",3,"secret"));
		return result;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public Object delete(@RequestBody LinkedHashMap<String, Object> jsonObject) {
		System.out.println("deleting... json is " + jsonObject);
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		result.put("resp", "ok");
		result.put("response other", "ok2");
		result.put("u2", new User("tom",3,"secret"));
		return result;
	}
}
