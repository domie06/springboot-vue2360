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


import com.dao.ShangpuxinxiDao;
import com.entity.ShangpuxinxiEntity;
import com.service.ShangpuxinxiService;
import com.entity.vo.ShangpuxinxiVO;
import com.entity.view.ShangpuxinxiView;

@Service("shangpuxinxiService")
public class ShangpuxinxiServiceImpl extends ServiceImpl<ShangpuxinxiDao, ShangpuxinxiEntity> implements ShangpuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpuxinxiEntity> page = this.selectPage(
                new Query<ShangpuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShangpuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpuxinxiEntity> wrapper) {
		  Page<ShangpuxinxiView> page =new Query<ShangpuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpuxinxiVO> selectListVO(Wrapper<ShangpuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpuxinxiVO selectVO(Wrapper<ShangpuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpuxinxiView> selectListView(Wrapper<ShangpuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpuxinxiView selectView(Wrapper<ShangpuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
