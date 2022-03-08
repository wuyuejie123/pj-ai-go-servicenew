package com.ai.pjgo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lao_He_and_lao_Wu
 * @email 180054421@qq.com;1679737434@qq.com
 * @date 2022-03-08 13:45:38
 */
@Data
@TableName("t_user_info")
public class UserInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID 用户的ID
	 */
	@TableId
	private Integer userId;
	/**
	 * 用户名字 用户的名字
	 */
	private String userName;
	/**
	 * 用户性别 0代表男，一代表女
	 */
	private Integer gender;
	/**
	 * 出生日期 用户的生日
	 */
	private Date birthday;
	/**
	 * 地址 用户的地址
	 */
	private String address;
	/**
	 * 个人技能 用户技能
	 */
	private String userSkill;
	/**
	 * 身份信息 用户的角色
	 */
	private String characters;
	/**
	 * 创建时间
	 */
	private Date establishTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String note;

}
