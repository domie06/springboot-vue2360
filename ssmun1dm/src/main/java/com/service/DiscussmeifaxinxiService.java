package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeifaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeifaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeifaxinxiView;


/**
 * 美发信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface DiscussmeifaxinxiService extends IService<DiscussmeifaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeifaxinxiVO> selectListVO(Wrapper<DiscussmeifaxinxiEntity> wrapper);
   	
   	DiscussmeifaxinxiVO selectVO(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
   	
   	List<DiscussmeifaxinxiView> selectListView(Wrapper<DiscussmeifaxinxiEntity> wrapper);
   	
   	DiscussmeifaxinxiView selectView(@Param("ew") Wrapper<DiscussmeifaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeifaxinxiEntity> wrapper);
   	
}

