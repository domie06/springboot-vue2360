package com.entity.view;

import com.entity.MeifaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美发信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
@TableName("meifaxinxi")
public class MeifaxinxiView  extends MeifaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeifaxinxiView(){
	}
 
 	public MeifaxinxiView(MeifaxinxiEntity meifaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, meifaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
