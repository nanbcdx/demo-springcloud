package cn.tedu.sh.service.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.sh.pojo.Item;
@RestController
@RequestMapping("/")
public interface ItemService {

	@PostMapping("add")
	void addItem(@RequestBody Item item);
	
	@GetMapping("delete")
	void deleteItem(Integer id);
	
	@PostMapping("update")
	Item update(@RequestBody Item item);
	
	@GetMapping("select")
	Item Select(Integer id);
	
	@GetMapping("getPort")
	String getPort();
	
	@GetMapping("getUser")
	String getUser();
	
}
