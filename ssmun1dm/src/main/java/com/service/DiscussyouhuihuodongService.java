package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouhuihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouhuihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouhuihuodongView;


/**
 * 优惠活动评论表
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussyouhuihuodongService extends IService<DiscussyouhuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouhuihuodongVO> selectListVO(Wrapper<DiscussyouhuihuodongEntity> wrapper);
   	
   	DiscussyouhuihuodongVO selectVO(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
   	
   	List<DiscussyouhuihuodongView> selectListView(Wrapper<DiscussyouhuihuodongEntity> wrapper);
   	
   	DiscussyouhuihuodongView selectView(@Param("ew") Wrapper<DiscussyouhuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouhuihuodongEntity> wrapper);
   	
}

