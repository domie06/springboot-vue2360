package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouhuihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouhuihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouhuihuodongView;


/**
 * 优惠活动
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface YouhuihuodongService extends IService<YouhuihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouhuihuodongVO> selectListVO(Wrapper<YouhuihuodongEntity> wrapper);
   	
   	YouhuihuodongVO selectVO(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
   	
   	List<YouhuihuodongView> selectListView(Wrapper<YouhuihuodongEntity> wrapper);
   	
   	YouhuihuodongView selectView(@Param("ew") Wrapper<YouhuihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouhuihuodongEntity> wrapper);
   	
}

