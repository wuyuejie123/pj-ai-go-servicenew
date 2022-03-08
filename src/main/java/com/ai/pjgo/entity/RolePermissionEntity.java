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
@TableName("t_role_permission")
public class RolePermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 角色ID
	 */
	private Integer roleId;
	/**
	 * 权限ID
	 */
	private Integer perId;
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
