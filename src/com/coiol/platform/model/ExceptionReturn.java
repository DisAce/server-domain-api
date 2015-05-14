

package com.coiol.platform.model;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionReturn
{

	private boolean success;
	private Object exceptionMessage;

	public ExceptionReturn()
	{
	}

	public ExceptionReturn(Throwable exceptionMessage)
	{
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exceptionMessage.printStackTrace(pw);
		success = false;
		this.exceptionMessage = exceptionMessage.getMessage();
	}

	public boolean isSuccess()
	{
		return success;
	}

	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	public Object getExceptionMessage()
	{
		return exceptionMessage;
	}

	public void setExceptionMessage(Object exceptionMessage)
	{
		this.exceptionMessage = exceptionMessage;
	}
}
