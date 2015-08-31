package org.coiol.platform.core.model;

import java.io.Serializable;
import java.util.Date;

public class UserToken implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3424086135721457963L;

	/**
	 * ID
	 */
	private String id;
	
	/**
	 * 用户帐号
	 */
	private String account;
	
	/**
	 * token
	 */
	private String token;
	
	/**
	 * 状态
	 */
	private int status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserToken [id=" + id + ", account=" + account + ", token=" + token + ", status=" + status
				+ ", createTime=" + createTime + "]";
	}
	
}
