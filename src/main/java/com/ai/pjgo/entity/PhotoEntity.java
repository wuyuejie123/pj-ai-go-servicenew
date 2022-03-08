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
@TableName("t_photo")
public class PhotoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 图片ID
	 */
	@TableId
	private Integer photoId;
	/**
	 * 图片名称
	 */
	private String photoName;
	/**
	 * 图片路径
	 */
	private String photUrl;
	/**
	 * 拍摄时间
	 */
	private Date takeTime;
	/**
	 * 拍摄设备ID
	 */
	private Integer cameraId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updatedTime;
	/**
	 * 备注
	 */
	private String note;

}
