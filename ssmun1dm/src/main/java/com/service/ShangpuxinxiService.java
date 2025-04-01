package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpuxinxiView;


/**
 * 商铺信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface ShangpuxinxiService extends IService<ShangpuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpuxinxiVO> selectListVO(Wrapper<ShangpuxinxiEntity> wrapper);
   	
   	ShangpuxinxiVO selectVO(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
   	
   	List<ShangpuxinxiView> selectListView(Wrapper<ShangpuxinxiEntity> wrapper);
   	
   	ShangpuxinxiView selectView(@Param("ew") Wrapper<ShangpuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpuxinxiEntity> wrapper);
   	
}

