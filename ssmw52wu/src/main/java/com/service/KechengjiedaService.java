package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengjiedaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengjiedaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengjiedaView;


/**
 * 课程解答
 *
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public interface KechengjiedaService extends IService<KechengjiedaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengjiedaVO> selectListVO(Wrapper<KechengjiedaEntity> wrapper);
   	
   	KechengjiedaVO selectVO(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
   	
   	List<KechengjiedaView> selectListView(Wrapper<KechengjiedaEntity> wrapper);
   	
   	KechengjiedaView selectView(@Param("ew") Wrapper<KechengjiedaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengjiedaEntity> wrapper);
   	
}

