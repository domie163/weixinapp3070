package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongdianjiexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongdianjiexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongdianjiexiView;


/**
 * 重点解析
 *
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public interface ZhongdianjiexiService extends IService<ZhongdianjiexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongdianjiexiVO> selectListVO(Wrapper<ZhongdianjiexiEntity> wrapper);
   	
   	ZhongdianjiexiVO selectVO(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
   	
   	List<ZhongdianjiexiView> selectListView(Wrapper<ZhongdianjiexiEntity> wrapper);
   	
   	ZhongdianjiexiView selectView(@Param("ew") Wrapper<ZhongdianjiexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongdianjiexiEntity> wrapper);
   	
}

