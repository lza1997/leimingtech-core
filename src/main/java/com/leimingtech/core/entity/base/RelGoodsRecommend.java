package com.leimingtech.core.entity.base;

import lombok.Data;
import lombok.ToString;

/**
 * 商品栏目与商品关联
 * @author guo
 * 2015年08月24日16:23:44
 */
@Data
@ToString
public class RelGoodsRecommend {
	private Integer relId;
	/**
	 *栏目Id
	 */
	private Integer reCommendId;
	/**
	 *商品Id
	 */
	private Integer goodsId;
	/**
	 *排序
	 */
	private Integer sort;
	/**
	 *关联的商品
	 */
	private Goods goods;
	
}
