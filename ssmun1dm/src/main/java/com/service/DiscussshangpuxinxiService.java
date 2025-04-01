package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangpuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangpuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangpuxinxiView;


/**
 * 商铺信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussshangpuxinxiService extends IService<DiscussshangpuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangpuxinxiVO> selectListVO(Wrapper<DiscussshangpuxinxiEntity> wrapper);
   	
   	DiscussshangpuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
   	
   	List<DiscussshangpuxinxiView> selectListView(Wrapper<DiscussshangpuxinxiEntity> wrapper);
   	
   	DiscussshangpuxinxiView selectView(@Param("ew") Wrapper<DiscussshangpuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangpuxinxiEntity> wrapper);
   	
}

