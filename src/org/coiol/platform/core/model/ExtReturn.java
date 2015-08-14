

package org.coiol.platform.core.model;


public class ExtReturn
{

	private boolean success;
	private Object msg;
	private Object o;

	public ExtReturn()
	{
	}

	public ExtReturn(boolean success, Object msg)
	{
		this.success = success;
		this.msg = msg;
		o = "";
	}

	public ExtReturn(boolean success, Object msg, Object other)
	{
		this.success = success;
		this.msg = msg;
		o = other;
	}

	public ExtReturn(Object errormsg)
	{
		success = false;
		msg = errormsg;
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

	public Object getMsg()
	{
		return msg;
	}

	public void setMsg(Object msg)
	{
		this.msg = msg;
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
