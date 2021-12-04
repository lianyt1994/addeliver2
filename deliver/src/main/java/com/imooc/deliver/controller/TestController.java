package com.imooc.deliver.controller;

import com.imooc.deliver.config.AdUserConfig;
import com.imooc.deliver.model.AdUser;
import com.imooc.deliver.service.AdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class TestController {

	@Autowired
	private AdUserService adUserService;

	@Autowired
	private AdUserConfig adUserConfig;

	@GetMapping("/find")
	public AdUser find(@Valid Integer id) {
		return adUserService.findById(id);
	}

	@GetMapping("/findConfig")
	public AdUserConfig findConfig() {
		return adUserConfig;
	}
}
