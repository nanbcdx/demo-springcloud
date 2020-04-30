package com.tedu.sh.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.sh.pojo.Item;
@FeignClient(name = "item-service", fallback =FBItemService.class  )
public interface ItemService {

	@PostMapping("add")
	void addItem(Item item);
	
	@GetMapping("delete")
	void deleteItem(@RequestParam Integer id);
	
	@PostMapping("update")
	Item update(Item item);
	
	@GetMapping("select")
	Item Select(@RequestParam Integer id);
	
	@GetMapping("getPort")
	String getPort();
	

}
