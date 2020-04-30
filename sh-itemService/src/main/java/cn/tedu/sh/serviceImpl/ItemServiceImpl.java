package cn.tedu.sh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import cn.tedu.sh.mapper.ItemMapper;
import cn.tedu.sh.pojo.Item;
import cn.tedu.sh.service.api.ItemService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RefreshScope
public class ItemServiceImpl implements ItemService {
	
	@Value("${server.port}")
	private Integer port;
	
	@Value("${sp.user-service.users}")
	private String userJson;
	
	
	
	@Autowired
	private ItemMapper itemMapper;
	
	public void addItem(Item item) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		itemMapper.insert(item);
	}

	@Override
	public void deleteItem(Integer id) {
		itemMapper.deleteById(id);
	}

	@Override
	public Item update(Item item) {
		itemMapper.updateById(item);
		return item;
	}

	@Override
	public Item Select(Integer id) {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Item item = itemMapper.selectById(id);
		return item;
	}

	@Override
	public String getPort() {
		try {
			Thread.sleep(100);
			return "端口号是"+port;
		} catch (InterruptedException e) {
			return "连接超时";
		}
	}

	@Override
	public String getUser() {
		return userJson;
	}


}
