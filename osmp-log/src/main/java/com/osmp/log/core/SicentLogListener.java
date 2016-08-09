/*   
 * Project: OSMP
 * FileName: SicentLogListener.java
 * version: V1.0
 */
package com.osmp.log.core;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

import com.osmp.log.pool.LogPool;

/**
 * 日志监听器
 * @author heyu
 *
 */
public class SicentLogListener implements LogListener{
    private LogPool logPool;
    
    public void setLogPool(LogPool logPool) {
        this.logPool = logPool;
    }

    @Override
    public void logged(LogEntry paramLogEntry) {
        if(logPool == null) return;
        logPool.addLog(paramLogEntry);
    }
    
}
