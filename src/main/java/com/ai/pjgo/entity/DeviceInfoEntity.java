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
@TableName("t_device_info")
public class DeviceInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 设备ID
	 */
	@TableId
	private Integer deviceId;
	/**
	 * 设备种类
	 */
	private String deviceKind;
	/**
	 * 设备状态
	 */
	private String deviceStatus;
	/**
	 * 设备数量
	 */
	private Integer deviceNum;
	/**
	 * 控制权限ID
	 */
	private Integer ctrlId;
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 更新人
	 */
	private String updatedBy;
	/**
	 * 更新时间
	 */
	private Date updatedTime;
	/**
	 * 备注
	 */
	private String note;

}
