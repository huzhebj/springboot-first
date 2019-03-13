package com.itheima.boot.first;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.boot.mapper.TbItemMapper;
import com.itheima.boot.pojo.TbItem;

@RestController
public class FirstController {

	@Autowired
	private TbItemMapper itemMapper;
	
	@RequestMapping("/hello")
	public Map showHello() {
		Map data = new HashMap<>();
		data.put("hello", "张三");
		data.put("world", "beijing");
		return data;
	}
	
	@RequestMapping("/item/{itemId}")
	public TbItem getItemById(@PathVariable long itemId) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}
}
