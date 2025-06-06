package com.entity.view;

import com.entity.KechengjiedaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程解答
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
@TableName("kechengjieda")
public class KechengjiedaView  extends KechengjiedaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengjiedaView(){
	}
 
 	public KechengjiedaView(KechengjiedaEntity kechengjiedaEntity){
 	try {
			BeanUtils.copyProperties(this, kechengjiedaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
