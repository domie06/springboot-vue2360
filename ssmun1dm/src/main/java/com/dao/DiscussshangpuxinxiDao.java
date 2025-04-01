package com.dao;

import com.entity.DiscussshangpuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangpuxinxiVO;
import com.entity.view.DiscussshangpuxinxiView;


/**
 * 商铺信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussshangpuxinxiDao extends BaseMapper<DiscussshangpuxinxiEntity> {
	
	List<DiscussshangpuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
	
	DiscussshangpuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
	
	List<DiscussshangpuxinxiView> selectListView(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);

	List<DiscussshangpuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
	
	DiscussshangpuxinxiView selectView(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
	
}
