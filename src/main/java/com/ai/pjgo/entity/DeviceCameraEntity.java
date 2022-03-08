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
@TableName("t_device_camera")
public class DeviceCameraEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer cameraId;
	/**
	 * 
	 */
	private String cameraName;
	/**
	 * 
	 */
	private String cameraStatus;
	/**
	 * 
	 */
	private Integer onOff;
	/**
	 * 
	 */
	private String cameraLocation;
	/**
	 * 
	 */
	private Integer deviceId;
	/**
	 * 
	 */
	private Integer serviceId;
	/**
	 * 
	 */
	private String createdBy;
	/**
	 * 
	 */
	private Date createdTime;
	/**
	 * 
	 */
	private String updatedBy;
	/**
	 * 
	 */
	private Date updatedTime;
	/**
	 * 
	 */
	private String note;

}
