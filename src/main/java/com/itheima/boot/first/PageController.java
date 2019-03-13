package com.itheima.boot.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.boot.pojo.TbItem;
import com.itheima.boot.service.ItemService;

/**
 * 展示页面
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PageController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/list")
	public String showItemList(Model model) {
		List<TbItem> list = itemService.getItemList();
		model.addAttribute("itemList", list);
		return "hello";
	}
}
