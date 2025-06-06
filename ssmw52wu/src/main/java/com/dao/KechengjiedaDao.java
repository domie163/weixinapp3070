package com.dao;

import com.entity.KechengjiedaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengjiedaVO;
import com.entity.view.KechengjiedaView;


/**
 * 课程解答
 * 
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public interface KechengjiedaDao extends BaseMapper<KechengjiedaEntity> {
	
	List<KechengjiedaVO> selectListVO(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
	
	KechengjiedaVO selectVO(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
	
	List<KechengjiedaView> selectListView(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);

	List<KechengjiedaView> selectListView(Pagination page,@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
	
	KechengjiedaView selectView(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
	
}
