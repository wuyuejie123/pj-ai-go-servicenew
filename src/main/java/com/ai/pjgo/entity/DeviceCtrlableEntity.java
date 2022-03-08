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
@TableName("t_device_ctrlable")
public class DeviceCtrlableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer ctrlableId;
	/**
	 * 可控制设备名称
	 */
	private String ctrlableName;
	/**
	 * 开关 0表示关，1表示开
	 */
	private Integer onOff;
	/**
	 * 可控制设备状态
	 */
	private String ctrlableStatus;
	/**
	 * 保障记录
	 */
	private Integer serviceId;
	/**
	 * 所属设备ID
	 */
	private Integer deviceId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 备注
	 */
	private String note;

}
