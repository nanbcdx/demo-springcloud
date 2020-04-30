package com.tedu.sh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.sh.service.ItemService;

import cn.tedu.sh.pojo.Item;
import cn.tedu.sh.vo.JsonResult;


@RestController
@RequestMapping("/")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("select")
	public JsonResult<Item> getItemById(Integer id){
		Item item=itemService.Select(id);
		if(null!=item) {
			return JsonResult.ok(item);
		}
		return JsonResult.err("没有该商品信息");
	}
	
	@GetMapping("getPort")
	public String getPort() {
		return itemService.getPort();
	}
	
	@PostMapping("add")
	public JsonResult<Item> add(Item item){
		
		try {
			itemService.addItem(item);
			return JsonResult.ok("添加成功");
		} catch (Exception e) {
		}
		return JsonResult.err("添加失败");
	}
	
}
