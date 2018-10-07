package com.songhaozhi.mayday.service;

import com.github.pagehelper.PageInfo;
import com.songhaozhi.mayday.model.domain.Attachment;

/**
 * @author 作者:宋浩志
 * @createDate 创建时间：2018年9月7日 上午10:34:32
 */
public interface AttachmentService {
	/**
	 * 保存
	 * @param attachment
	 */
	void save(Attachment attachment);
	/**
	 * 分页查询附件
	 * @param page
	 * @param limit
	 * @return
	 */
	PageInfo<Attachment> getAttachment(int page, int limit);

}
