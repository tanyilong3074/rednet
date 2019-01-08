package com.tangyilong.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tangyilong.item.pojo.Item;
import com.tangyilong.item.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/item/{id}")
	public Item getItem(@PathVariable Long id){
		return itemService.queryItemById(id);
	}
}
