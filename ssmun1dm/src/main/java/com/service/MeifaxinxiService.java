package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeifaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeifaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeifaxinxiView;


/**
 * 美发信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
public interface MeifaxinxiService extends IService<MeifaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeifaxinxiVO> selectListVO(Wrapper<MeifaxinxiEntity> wrapper);
   	
   	MeifaxinxiVO selectVO(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
   	
   	List<MeifaxinxiView> selectListView(Wrapper<MeifaxinxiEntity> wrapper);
   	
   	MeifaxinxiView selectView(@Param("ew") Wrapper<MeifaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeifaxinxiEntity> wrapper);
   	
}

