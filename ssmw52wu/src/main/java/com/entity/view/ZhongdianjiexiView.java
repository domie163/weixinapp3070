package com.entity.view;

import com.entity.ZhongdianjiexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 重点解析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
@TableName("zhongdianjiexi")
public class ZhongdianjiexiView  extends ZhongdianjiexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongdianjiexiView(){
	}
 
 	public ZhongdianjiexiView(ZhongdianjiexiEntity zhongdianjiexiEntity){
 	try {
			BeanUtils.copyProperties(this, zhongdianjiexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
