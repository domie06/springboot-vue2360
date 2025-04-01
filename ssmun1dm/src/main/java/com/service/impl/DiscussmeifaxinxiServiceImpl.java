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


import com.dao.DiscussmeifaxinxiDao;
import com.entity.DiscussmeifaxinxiEntity;
import com.service.DiscussmeifaxinxiService;
import com.entity.vo.DiscussmeifaxinxiVO;
import com.entity.view.DiscussmeifaxinxiView;

@Service("discussmeifaxinxiService")
public class DiscussmeifaxinxiServiceImpl extends ServiceImpl<DiscussmeifaxinxiDao, DiscussmeifaxinxiEntity> implements DiscussmeifaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeifaxinxiEntity> page = this.selectPage(
                new Query<DiscussmeifaxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussmeifaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeifaxinxiEntity> wrapper) {
		  Page<DiscussmeifaxinxiView> page =new Query<DiscussmeifaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeifaxinxiVO> selectListVO(Wrapper<DiscussmeifaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeifaxinxiVO selectVO(Wrapper<DiscussmeifaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeifaxinxiView> selectListView(Wrapper<DiscussmeifaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeifaxinxiView selectView(Wrapper<DiscussmeifaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
