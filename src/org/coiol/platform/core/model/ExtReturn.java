

package org.coiol.platform.core.model;

/**
 *  系统返回信息扩展
 *
 */
public class ExtReturn
{

	/**
	 * 成功状态
	 */
	private boolean success;
	
	/**
	 * 返回码
	 */
	private int resultCode;
	
	/**
	 * 附加信息
	 */
	private Object o;


	public ExtReturn(boolean success, int resultCode)
	{
		this.success = success;
		this.resultCode = resultCode;
		o = "";
	}

	public ExtReturn(boolean success, int resultCode, Object other)
	{
		this.success = success;
		this.resultCode = resultCode;
		o = other;
	}

	public ExtReturn(int _resultCode)
	{
		success = false;
		resultCode = _resultCode;
		o = "";
	}

	public boolean isSuccess()
	{
		return success;
	}

	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public Object getO()
	{
		return o;
	}

	public void setO(Object o)
	{
		this.o = o;
	}
}
