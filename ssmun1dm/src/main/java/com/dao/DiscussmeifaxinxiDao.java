package com.dao;

import com.entity.DiscussmeifaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeifaxinxiVO;
import com.entity.view.DiscussmeifaxinxiView;


/**
 * 美发信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussmeifaxinxiDao extends BaseMapper<DiscussmeifaxinxiEntity> {
	
	List<DiscussmeifaxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
	
	DiscussmeifaxinxiVO selectVO(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
	
	List<DiscussmeifaxinxiView> selectListView(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);

	List<DiscussmeifaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
	
	DiscussmeifaxinxiView selectView(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
	
}
