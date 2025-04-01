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


import com.dao.DiscussyouhuihuodongDao;
import com.entity.DiscussyouhuihuodongEntity;
import com.service.DiscussyouhuihuodongService;
import com.entity.vo.DiscussyouhuihuodongVO;
import com.entity.view.DiscussyouhuihuodongView;

@Service("discussyouhuihuodongService")
public class DiscussyouhuihuodongServiceImpl extends ServiceImpl<DiscussyouhuihuodongDao, DiscussyouhuihuodongEntity> implements DiscussyouhuihuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouhuihuodongEntity> page = this.selectPage(
                new Query<DiscussyouhuihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussyouhuihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouhuihuodongEntity> wrapper) {
		  Page<DiscussyouhuihuodongView> page =new Query<DiscussyouhuihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouhuihuodongVO> selectListVO(Wrapper<DiscussyouhuihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouhuihuodongVO selectVO(Wrapper<DiscussyouhuihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouhuihuodongView> selectListView(Wrapper<DiscussyouhuihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouhuihuodongView selectView(Wrapper<DiscussyouhuihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
