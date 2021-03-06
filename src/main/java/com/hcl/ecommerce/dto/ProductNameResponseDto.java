package com.hcl.ecommerce.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vasavi
 *
 */
@Setter
@Getter
@ToString
public class ProductNameResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String productName;
	private Float productPrice;
	private Integer storeId;
	
	
}
