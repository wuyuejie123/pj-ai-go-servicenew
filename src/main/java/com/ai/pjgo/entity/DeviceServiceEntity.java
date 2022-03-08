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
@TableName("t_device_service")
public class DeviceServiceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 服务编号
	 */
	@TableId
	private Integer serviceId;
	/**
	 * 设备ID
	 */
	private Integer deviceId;
	/**
	 * 设备种类 表明哪种设备
	 */
	private String deviceKind;
	/**
	 * 详细设备ID 可控制，传感器，摄像头ID
	 */
	private Integer deviceDetailId;
	/**
	 * 详细设备名称 表明具体的哪一个设备
	 */
	private String deviceName;
	/**
	 * 维修时间
	 */
	private Date serviceTime;
	/**
	 * 故障说明
	 */
	private String errorNote;
	/**
	 * 维修内容
	 */
	private String serviceNote;
	/**
	 * 维修员ID
	 */
	private Integer userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 备注
	 */
	private String note;

}
