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


import com.dao.DiscussshangpuxinxiDao;
import com.entity.DiscussshangpuxinxiEntity;
import com.service.DiscussshangpuxinxiService;
import com.entity.vo.DiscussshangpuxinxiVO;
import com.entity.view.DiscussshangpuxinxiView;

@Service("discussshangpuxinxiService")
public class DiscussshangpuxinxiServiceImpl extends ServiceImpl<DiscussshangpuxinxiDao, DiscussshangpuxinxiEntity> implements DiscussshangpuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpuxinxiEntity> page = this.selectPage(
                new Query<DiscussshangpuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpuxinxiEntity> wrapper) {
		  Page<DiscussshangpuxinxiView> page =new Query<DiscussshangpuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangpuxinxiVO> selectListVO(Wrapper<DiscussshangpuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangpuxinxiVO selectVO(Wrapper<DiscussshangpuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangpuxinxiView> selectListView(Wrapper<DiscussshangpuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpuxinxiView selectView(Wrapper<DiscussshangpuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
