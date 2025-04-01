package com.entity.view;

import com.entity.YouhuihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优惠活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
@TableName("youhuihuodong")
public class YouhuihuodongView  extends YouhuihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouhuihuodongView(){
	}
 
 	public YouhuihuodongView(YouhuihuodongEntity youhuihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, youhuihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
