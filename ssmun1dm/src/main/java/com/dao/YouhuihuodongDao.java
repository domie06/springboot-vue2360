package com.dao;

import com.entity.YouhuihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouhuihuodongVO;
import com.entity.view.YouhuihuodongView;


/**
 * 优惠活动
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface YouhuihuodongDao extends BaseMapper<YouhuihuodongEntity> {
	
	List<YouhuihuodongVO> selectListVO(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
	
	YouhuihuodongVO selectVO(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
	
	List<YouhuihuodongView> selectListView(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);

	List<YouhuihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
	
	YouhuihuodongView selectView(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
	
}
