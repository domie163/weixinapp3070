package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanzixunView;


/**
 * 校园资讯
 *
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public interface XiaoyuanzixunService extends IService<XiaoyuanzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanzixunVO> selectListVO(Wrapper<XiaoyuanzixunEntity> wrapper);
   	
   	XiaoyuanzixunVO selectVO(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
   	
   	List<XiaoyuanzixunView> selectListView(Wrapper<XiaoyuanzixunEntity> wrapper);
   	
   	XiaoyuanzixunView selectView(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanzixunEntity> wrapper);
   	
}

