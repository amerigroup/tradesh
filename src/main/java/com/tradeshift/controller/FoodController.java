package com.tradeshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.tradeshift.model.Food;
import com.tradeshift.service.FoodService;


/**
 * <p>User: Jimkang
 * <p>Date: 16-12-22
 * <p>Version: 1.0
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/food")
public class FoodController {
	  @Autowired
	    private FoodService foodService;

	  @RequestMapping
	    public PageInfo<Food> getAll(Food food) {
	        List<com.tradeshift.model.Food> foodList = foodService.getAll(food);
	        return new PageInfo<Food>(foodList);
	    }
    @RequestMapping("/{id}")
    private Food view(@PathVariable("id") Integer id) {
    	Food food = foodService.getById(id);
         return food;
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodController.class);
    }
}
