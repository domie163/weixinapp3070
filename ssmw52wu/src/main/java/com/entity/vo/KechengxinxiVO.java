package com.entity.vo;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课程信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-01 13:25:31
 */
public class KechengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 课程简介
	 */
	
	private String kechengjianjie;
		
	/**
	 * 课程内容
	 */
	
	private String kechengneirong;
		
	/**
	 * 课程视频
	 */
	
	private String kechengshipin;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
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
	 * 设置：课程简介
	 */
	 
	public void setKechengjianjie(String kechengjianjie) {
		this.kechengjianjie = kechengjianjie;
	}
	
	/**
	 * 获取：课程简介
	 */
	public String getKechengjianjie() {
		return kechengjianjie;
	}
				
	
	/**
	 * 设置：课程内容
	 */
	 
	public void setKechengneirong(String kechengneirong) {
		this.kechengneirong = kechengneirong;
	}
	
	/**
	 * 获取：课程内容
	 */
	public String getKechengneirong() {
		return kechengneirong;
	}
				
	
	/**
	 * 设置：课程视频
	 */
	 
	public void setKechengshipin(String kechengshipin) {
		this.kechengshipin = kechengshipin;
	}
	
	/**
	 * 获取：课程视频
	 */
	public String getKechengshipin() {
		return kechengshipin;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
