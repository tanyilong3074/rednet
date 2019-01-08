package com.tangyilong.item.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tangyilong.item.pojo.Item;

@Service
public class ItemService{
	public static final Map<Long,Item> itemMap=new HashMap<>();
	
	static{
		itemMap.put(1L, new Item(1L,"商品1",20.1,"测试1",new Date()));
		itemMap.put(2L, new Item(2L,"商品2",20.1,"测试2",new Date()));
		itemMap.put(3L, new Item(3L,"商品3",20.1,"测试3",new Date()));
		itemMap.put(4L, new Item(4L,"商品4",20.1,"测试4",new Date()));
		itemMap.put(5L, new Item(5L,"商品5",20.1,"测试5",new Date()));
		itemMap.put(6L, new Item(6L,"商品6",20.1,"测试6",new Date()));
	}
	//根据商品名返回商品信息
	public Item queryItemById(Long id){
		return itemMap.get(id);
	}
}
