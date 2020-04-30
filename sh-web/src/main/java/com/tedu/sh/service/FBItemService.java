package com.tedu.sh.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.tedu.sh.pojo.Item;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class FBItemService implements ItemService {

	@Override
	public void addItem(Item item) {
		throw new RuntimeException("服务器忙,请稍后再试");
	}

	@Override
	public void deleteItem(Integer id) {
		throw new RuntimeException("服务器忙,请稍后再试");
	}

	@Override
	public Item update(Item item) {
		throw new RuntimeException("服务器忙,请稍后再试");
	}

	@Override
	public Item Select(Integer id) {
		return new Item(100, "原始数据", 1000);
	}

	@Override
	public String getPort() {
		return ""+112233;
	}



}
