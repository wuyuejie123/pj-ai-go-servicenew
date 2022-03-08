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
@TableName("t_user_roles")
public class UserRolesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id 表示
	 */
	@TableId
	private Integer id;
	/**
	 * 用户ID 关联用户ID
	 */
	private Integer userId;
	/**
	 * 角色ID 角色ID
	 */
	private Integer roleId;
	/**
	 * 创建时间
	 */
	private Date establishTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String note;

}
