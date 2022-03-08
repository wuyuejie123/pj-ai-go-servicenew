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
@TableName("t_device_sensor")
public class DeviceSensorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 传感器ID
	 */
	@TableId
	private Integer sensorId;
	/**
	 * 传感器名称
	 */
	private String sensorName;
	/**
	 * 所属设备ID
	 */
	private Integer deviceId;
	/**
	 * 传感器状态
	 */
	private String sensorStatus;
	/**
	 * 保障记录
	 */
	private Integer serviceId;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 备注
	 */
	private String note;

}
