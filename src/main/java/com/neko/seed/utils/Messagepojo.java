package com.neko.seed.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Messagepojo implements Serializable {

	private static final long serialVersionUID = -6451812593150428369L;

	private String sourse;// 信息来源
	private String messageType;// 消息类型
	private String msgContent;// 消息内容
	private String target;// 发送目的地
	private String infoSourceIP;// 信息来源ip
	private String createtime;// 消息保存时间
	private String otherContent;// 其他信息
}