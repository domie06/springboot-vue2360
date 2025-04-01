package com.dao;

import com.entity.MeifaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeifaxinxiVO;
import com.entity.view.MeifaxinxiView;


/**
 * 美发信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface MeifaxinxiDao extends BaseMapper<MeifaxinxiEntity> {
	
	List<MeifaxinxiVO> selectListVO(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
	
	MeifaxinxiVO selectVO(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
	
	List<MeifaxinxiView> selectListView(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);

	List<MeifaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
	
	MeifaxinxiView selectView(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
	
}
