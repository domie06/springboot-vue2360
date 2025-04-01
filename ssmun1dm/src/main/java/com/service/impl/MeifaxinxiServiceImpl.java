package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MeifaxinxiDao;
import com.entity.MeifaxinxiEntity;
import com.service.MeifaxinxiService;
import com.entity.vo.MeifaxinxiVO;
import com.entity.view.MeifaxinxiView;

@Service("meifaxinxiService")
public class MeifaxinxiServiceImpl extends ServiceImpl<MeifaxinxiDao, MeifaxinxiEntity> implements MeifaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeifaxinxiEntity> page = this.selectPage(
                new Query<MeifaxinxiEntity>(params).getPage(),
                new EntityWrapper<MeifaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeifaxinxiEntity> wrapper) {
		  Page<MeifaxinxiView> page =new Query<MeifaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeifaxinxiVO> selectListVO(Wrapper<MeifaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeifaxinxiVO selectVO(Wrapper<MeifaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeifaxinxiView> selectListView(Wrapper<MeifaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeifaxinxiView selectView(Wrapper<MeifaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
