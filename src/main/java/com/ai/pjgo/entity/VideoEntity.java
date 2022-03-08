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
@TableName("t_video")
public class VideoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 视频ID
	 */
	@TableId
	private Integer videoId;
	/**
	 * 视频名称
	 */
	private String videoName;
	/**
	 * 视频存储路径
	 */
	private String videoUrl;
	/**
	 * 拍摄时间
	 */
	private Date takeTime;
	/**
	 * 拍摄设备
	 */
	private Integer cameraId;
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
