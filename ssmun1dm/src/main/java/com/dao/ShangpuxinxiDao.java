package com.dao;

import com.entity.ShangpuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpuxinxiVO;
import com.entity.view.ShangpuxinxiView;


/**
 * 商铺信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface ShangpuxinxiDao extends BaseMapper<ShangpuxinxiEntity> {
	
	List<ShangpuxinxiVO> selectListVO(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
	
	ShangpuxinxiVO selectVO(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
	
	List<ShangpuxinxiView> selectListView(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);

	List<ShangpuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
	
	ShangpuxinxiView selectView(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
	
}
