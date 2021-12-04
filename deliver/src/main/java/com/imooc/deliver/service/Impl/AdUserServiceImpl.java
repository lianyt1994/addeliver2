package com.imooc.deliver.service.Impl;

import com.imooc.deliver.model.AdUser;
import com.imooc.deliver.repository.AdUserRepository;
import com.imooc.deliver.service.AdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdUserServiceImpl implements AdUserService {

	@Autowired
	private AdUserRepository adUserRepository;

	@Override
	public AdUser findById(Integer id) {
		Optional<AdUser> byId = adUserRepository.findById(id);
		return byId.get();
	}

}
