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


import com.dao.KechengjiedaDao;
import com.entity.KechengjiedaEntity;
import com.service.KechengjiedaService;
import com.entity.vo.KechengjiedaVO;
import com.entity.view.KechengjiedaView;

@Service("kechengjiedaService")
public class KechengjiedaServiceImpl extends ServiceImpl<KechengjiedaDao, KechengjiedaEntity> implements KechengjiedaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengjiedaEntity> page = this.selectPage(
                new Query<KechengjiedaEntity>(params).getPage(),
                new EntityWrapper<KechengjiedaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengjiedaEntity> wrapper) {
		  Page<KechengjiedaView> page =new Query<KechengjiedaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengjiedaVO> selectListVO(Wrapper<KechengjiedaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengjiedaVO selectVO(Wrapper<KechengjiedaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengjiedaView> selectListView(Wrapper<KechengjiedaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengjiedaView selectView(Wrapper<KechengjiedaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
