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


import com.dao.YouhuihuodongDao;
import com.entity.YouhuihuodongEntity;
import com.service.YouhuihuodongService;
import com.entity.vo.YouhuihuodongVO;
import com.entity.view.YouhuihuodongView;

@Service("youhuihuodongService")
public class YouhuihuodongServiceImpl extends ServiceImpl<YouhuihuodongDao, YouhuihuodongEntity> implements YouhuihuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouhuihuodongEntity> page = this.selectPage(
                new Query<YouhuihuodongEntity>(params).getPage(),
                new EntityWrapper<YouhuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouhuihuodongEntity> wrapper) {
		  Page<YouhuihuodongView> page =new Query<YouhuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouhuihuodongVO> selectListVO(Wrapper<YouhuihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouhuihuodongVO selectVO(Wrapper<YouhuihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouhuihuodongView> selectListView(Wrapper<YouhuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouhuihuodongView selectView(Wrapper<YouhuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
