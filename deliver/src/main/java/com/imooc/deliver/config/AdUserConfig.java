package com.imooc.deliver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Component
@Data
@ConfigurationProperties("user")
public class AdUserConfig {

	@Id
	private Integer id;

	/** 订单id. */
	private String name;

	/** 商品id. */
	private String feature;
}
