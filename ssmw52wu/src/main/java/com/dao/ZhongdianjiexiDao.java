package com.dao;

import com.entity.ZhongdianjiexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongdianjiexiVO;
import com.entity.view.ZhongdianjiexiView;


/**
 * 重点解析
 * 
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public interface ZhongdianjiexiDao extends BaseMapper<ZhongdianjiexiEntity> {
	
	List<ZhongdianjiexiVO> selectListVO(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
	
	ZhongdianjiexiVO selectVO(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
	
	List<ZhongdianjiexiView> selectListView(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);

	List<ZhongdianjiexiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
	
	ZhongdianjiexiView selectView(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
	
}
