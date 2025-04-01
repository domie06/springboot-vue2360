package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangpuxinxiEntity;
import com.entity.view.ShangpuxinxiView;

import com.service.ShangpuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 商铺信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-26 22:27:10
 */
@RestController
@RequestMapping("/shangpuxinxi")
public class ShangpuxinxiController {
    @Autowired
    private ShangpuxinxiService shangpuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpuxinxiEntity shangpuxinxi, 
		HttpServletRequest request){

        EntityWrapper<ShangpuxinxiEntity> ew = new EntityWrapper<ShangpuxinxiEntity>();
		PageUtils page = shangpuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpuxinxiEntity shangpuxinxi, HttpServletRequest request){
        EntityWrapper<ShangpuxinxiEntity> ew = new EntityWrapper<ShangpuxinxiEntity>();
		PageUtils page = shangpuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpuxinxiEntity shangpuxinxi){
       	EntityWrapper<ShangpuxinxiEntity> ew = new EntityWrapper<ShangpuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpuxinxi, "shangpuxinxi")); 
        return R.ok().put("data", shangpuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpuxinxiEntity shangpuxinxi){
        EntityWrapper< ShangpuxinxiEntity> ew = new EntityWrapper< ShangpuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpuxinxi, "shangpuxinxi")); 
		ShangpuxinxiView shangpuxinxiView =  shangpuxinxiService.selectView(ew);
		return R.ok("查询商铺信息成功").put("data", shangpuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpuxinxiEntity shangpuxinxi = shangpuxinxiService.selectById(id);
        return R.ok().put("data", shangpuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpuxinxiEntity shangpuxinxi = shangpuxinxiService.selectById(id);
        return R.ok().put("data", shangpuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ShangpuxinxiEntity shangpuxinxi = shangpuxinxiService.selectById(id);
        if(type.equals("1")) {
        	shangpuxinxi.setThumbsupnum(shangpuxinxi.getThumbsupnum()+1);
        } else {
        	shangpuxinxi.setCrazilynum(shangpuxinxi.getCrazilynum()+1);
        }
        shangpuxinxiService.updateById(shangpuxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpuxinxiEntity shangpuxinxi, HttpServletRequest request){
    	shangpuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpuxinxi);

        shangpuxinxiService.insert(shangpuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpuxinxiEntity shangpuxinxi, HttpServletRequest request){
    	shangpuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpuxinxi);

        shangpuxinxiService.insert(shangpuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpuxinxiEntity shangpuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpuxinxi);
        shangpuxinxiService.updateById(shangpuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangpuxinxiEntity> wrapper = new EntityWrapper<ShangpuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shangpuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
