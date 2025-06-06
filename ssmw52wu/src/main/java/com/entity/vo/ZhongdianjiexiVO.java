package com.entity.vo;

import com.entity.ZhongdianjiexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 重点解析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public class ZhongdianjiexiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 重点介绍
	 */
	
	private String zhongdianjieshao;
		
	/**
	 * 难点解析
	 */
	
	private String nandianjiexi;
		
	/**
	 * 解题思路
	 */
	
	private String jietisilu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：科目
	 */
	 
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
				
	
	/**
	 * 设置：重点介绍
	 */
	 
	public void setZhongdianjieshao(String zhongdianjieshao) {
		this.zhongdianjieshao = zhongdianjieshao;
	}
	
	/**
	 * 获取：重点介绍
	 */
	public String getZhongdianjieshao() {
		return zhongdianjieshao;
	}
				
	
	/**
	 * 设置：难点解析
	 */
	 
	public void setNandianjiexi(String nandianjiexi) {
		this.nandianjiexi = nandianjiexi;
	}
	
	/**
	 * 获取：难点解析
	 */
	public String getNandianjiexi() {
		return nandianjiexi;
	}
				
	
	/**
	 * 设置：解题思路
	 */
	 
	public void setJietisilu(String jietisilu) {
		this.jietisilu = jietisilu;
	}
	
	/**
	 * 获取：解题思路
	 */
	public String getJietisilu() {
		return jietisilu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
