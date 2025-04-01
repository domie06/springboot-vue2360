package com.dao;

import com.entity.DiscussyouhuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouhuihuodongVO;
import com.entity.view.DiscussyouhuihuodongView;


/**
 * 优惠活动评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussyouhuihuodongDao extends BaseMapper<DiscussyouhuihuodongEntity> {
	
	List<DiscussyouhuihuodongVO> selectListVO(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
	
	DiscussyouhuihuodongVO selectVO(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
	
	List<DiscussyouhuihuodongView> selectListView(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);

	List<DiscussyouhuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
	
	DiscussyouhuihuodongView selectView(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
	
}
