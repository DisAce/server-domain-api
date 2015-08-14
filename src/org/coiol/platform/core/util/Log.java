/**   
* @Project: PlatFormCore 
* @Title: Log.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:06:15 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import org.coiol.platform.core.log.LogContext;
import org.coiol.platform.core.log.LogContextHolder;
import org.coiol.platform.core.log.ZbupLoggerWrapper;

/** 
 * @ClassName Log  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class Log
{

	  private ZbupLoggerWrapper log;
	  private static final String defaultLogName = "com.zbiti.core.util.Log";

	  private Log(String name)
	  {
	    this.log = new ZbupLoggerWrapper(name);
	  }

	  public static Log getLog(String name)
	  {
	    String s = name;
	    if (s == null)
	      s = "com.zbiti.core.util.Log";
	    return new Log(s);
	  }

	  public static Log getLog(Class clazz)
	  {
	    String s = "com.zbiti.core.util.Log";
	    if (clazz != null)
	      s = clazz.getName();
	    return getLog(s);
	  }

	  private static LogModel getLogModel()
	  {
	    LogModel model = LogModel.RunTimeClose;
	    LogContext logContext = LogContextHolder.getLogContext();
	    if (logContext != null) {
	      if (logContext.getLogSwitch())
	        model = LogModel.RunTimeOpen;
	      else
	        model = LogModel.RunTimeClose;
	    }
	    else {
	      model = LogModel.Develop;
	    }
	    return model;
	  }

	  private static boolean isLogOpen(LogModel model)
	  {
	    return (model == LogModel.RunTimeOpen) || (model == LogModel.Develop);
	  }

	  private static boolean isLogOpen()
	  {
	    return isLogOpen(getLogModel());
	  }

	  private static String buildLogContextInfo()
	  {
	    long threadId = Thread.currentThread().getId();
	    String staff = null;
	    LogContext logContext = LogContextHolder.getLogContext();
	    if (logContext != null) {
	      staff = logContext.getStaff();
	    }
	    StringBuilder sb = new StringBuilder();
	    sb.append("ZBUP_LOGGER:threadId=");
	    sb.append(threadId);
	    sb.append(",staff=");
	    sb.append(staff);
	    sb.append(",info=");
	    return sb.toString();
	  }

	  public void debug(String message, Object[] args)
	  {
	    try
	    {
	      LogModel model = getLogModel();
	      if (isLogOpen(model))
	        if (model == LogModel.RunTimeOpen)
	          this.log.debug(buildLogContextInfo() + message, args);
	        else
	          this.log.debug(message, args);
	    }
	    catch (Throwable e) {
	      e.printStackTrace();
	    }
	  }

	  public void info(String message, Object[] args)
	  {
	    try
	    {
	      LogModel model = getLogModel();
	      if (isLogOpen(model))
	        if (model == LogModel.RunTimeOpen)
	          this.log.info(buildLogContextInfo() + message, args);
	        else
	          this.log.info(message, args);
	    }
	    catch (Throwable e) {
	      e.printStackTrace();
	    }
	  }

	  public void warn(String message, Object[] args)
	  {
	    try
	    {
	      LogModel model = getLogModel();
	      if (isLogOpen(model))
	        if (model == LogModel.RunTimeOpen)
	          this.log.warn(buildLogContextInfo() + message, args);
	        else
	          this.log.warn(message, args);
	    }
	    catch (Throwable e) {
	      e.printStackTrace();
	    }
	  }

	  public void trace(String message, Object[] args)
	  {
	    try
	    {
	      LogModel model = getLogModel();
	      if (isLogOpen(model))
	        if (model == LogModel.RunTimeOpen)
	          this.log.trace(buildLogContextInfo() + message, args);
	        else
	          this.log.trace(message, args);
	    }
	    catch (Throwable e) {
	      e.printStackTrace();
	    }
	  }

	  public void error(String message, Object[] args)
	  {
	    try
	    {
	      LogModel model = getLogModel();

	      if (model == LogModel.RunTimeOpen)
	        this.log.error(buildLogContextInfo() + message, args);
	      else
	        this.log.error(message, args);
	    }
	    catch (Throwable e) {
	      e.printStackTrace();
	    }
	  }

	  public void error(String message, Throwable e)
	  {
	    try
	    {
	      LogModel model = getLogModel();

	      if (model == LogModel.RunTimeOpen)
	        this.log.error(buildLogContextInfo() + message, e);
	      else
	        this.log.error(message, e);
	    }
	    catch (Throwable error) {
	      error.printStackTrace();
	    }
	  }

	  public boolean isDebugEnabled()
	  {
	    try
	    {
	      if (this.log == null) {
	        return false;
	      }
	      return (isLogOpen()) && (this.log.isDebugEnabled()); } catch (Throwable e) {
	    }
	    return false;
	  }

	  public boolean isErrorEnabled()
	  {
	    try
	    {
	      if (this.log == null) {
	        return false;
	      }

	      return this.log.isErrorEnabled(); } catch (Throwable e) {
	    }
	    return false;
	  }

	  public boolean isInfoEnabled()
	  {
	    try
	    {
	      if (this.log == null)
	        return false;
	      return (isLogOpen()) && (this.log.isInfoEnabled()); } catch (Throwable e) {
	    }
	    return false;
	  }

	  public boolean isTraceEnabled()
	  {
	    try
	    {
	      if (this.log == null)
	        return false;
	      return (isLogOpen()) && (this.log.isTraceEnabled()); } catch (Throwable e) {
	    }
	    return false;
	  }

	  public boolean isWarnEnabled()
	  {
	    try
	    {
	      if (this.log == null)
	        return false;
	      return (isLogOpen()) && (this.log.isWarnEnabled()); } catch (Throwable e) {
	    }
	    return false;
	  }

	  public synchronized void debug4Thread(String message, Object[] args)
	  {
	    LogTask task = new LogTask(message, Integer.valueOf(10000), this, args);
	    new Thread(new LogConsumer(task), "Log4Thread").start();
	  }

	  public synchronized void info4Thread(String message, Object[] args) {
	    LogTask task = new LogTask(message, Integer.valueOf(20000), this, args);
	    new Thread(new LogConsumer(task), "Log4Thread").start();
	  }

	  public synchronized void warn4Thread(String message, Object[] args) {
	    LogTask task = new LogTask(message, Integer.valueOf(30000), this, args);
	    new Thread(new LogConsumer(task), "Log4Thread").start();
	  }

	  public synchronized void error4Thread(String message, Object[] args) {
	    LogTask task = new LogTask(message, Integer.valueOf(40000), this, args);
	    new Thread(new LogConsumer(task), "Log4Thread").start();
	  }

	  class LogConsumer implements Runnable
	  {
	    private Log.LogTask task = null;

	    public LogConsumer(Log.LogTask task)
	    {
	      this.task = task;
	    }

	    public void run()
	    {
	      int level = this.task.getLevel().intValue();
	      switch (level) {
	      case 10000:
	        this.task.getLog().debug(this.task.getObjMessage(), this.task.getObj());
	        break;
	      case 20000:
	        this.task.getLog().info(this.task.getObjMessage(), this.task.getObj());
	        break;
	      case 40000:
	        this.task.getLog().error(this.task.getObjMessage(), this.task.getObj());
	        break;
	      case 5000:
	        this.task.getLog().trace(this.task.getObjMessage(), this.task.getObj());
	        break;
	      case 30000:
	        this.task.getLog().warn(this.task.getObjMessage(), this.task.getObj());
	      }
	    }
	  }

	  private static enum LogModel
	  {
	    RunTimeOpen, RunTimeClose, Develop;
	  }

	  class LogTask
	  {
	    private String objMessage = null;
	    private Integer level = null;

	    private Log log = null;
	    private Object[] obj = null;

	    public LogTask(String objMessage, Integer level, Log log, Object[] obj)
	    {
	      this.objMessage = objMessage;
	      this.level = level;
	      this.log = log;
	      this.obj = obj;
	    }

	    public String getObjMessage() {
	      return this.objMessage;
	    }

	    public void setObjMessage(String objMessage) {
	      this.objMessage = objMessage;
	    }

	    public Integer getLevel() {
	      return this.level;
	    }

	    public void setLevel(Integer level) {
	      this.level = level;
	    }

	    public Log getLog() {
	      return this.log;
	    }

	    public void setLog_C(Log log) {
	      this.log = log;
	    }

	    public Object[] getObj() {
	      return this.obj;
	    }

	    public void setObj(Object[] obj) {
	      this.obj = obj;
	    }
	  }
}
