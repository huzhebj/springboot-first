package com.itheima.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.boot.mapper.TbItemMapper;
import com.itheima.boot.pojo.TbItem;
import com.itheima.boot.pojo.TbItemExample;
import com.itheima.boot.pojo.TbItemExample.Criteria;
import com.itheima.boot.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public List<TbItem> getItemList() {
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdLessThan(907012l);
		List<TbItem> list = itemMapper.selectByExample(example);
		return list;
	}

}
