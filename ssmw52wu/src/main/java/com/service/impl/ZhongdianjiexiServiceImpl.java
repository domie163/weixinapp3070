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


import com.dao.ZhongdianjiexiDao;
import com.entity.ZhongdianjiexiEntity;
import com.service.ZhongdianjiexiService;
import com.entity.vo.ZhongdianjiexiVO;
import com.entity.view.ZhongdianjiexiView;

@Service("zhongdianjiexiService")
public class ZhongdianjiexiServiceImpl extends ServiceImpl<ZhongdianjiexiDao, ZhongdianjiexiEntity> implements ZhongdianjiexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongdianjiexiEntity> page = this.selectPage(
                new Query<ZhongdianjiexiEntity>(params).getPage(),
                new EntityWrapper<ZhongdianjiexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongdianjiexiEntity> wrapper) {
		  Page<ZhongdianjiexiView> page =new Query<ZhongdianjiexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongdianjiexiVO> selectListVO(Wrapper<ZhongdianjiexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongdianjiexiVO selectVO(Wrapper<ZhongdianjiexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongdianjiexiView> selectListView(Wrapper<ZhongdianjiexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongdianjiexiView selectView(Wrapper<ZhongdianjiexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
