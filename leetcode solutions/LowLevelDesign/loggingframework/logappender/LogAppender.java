package LowLevelDesign.loggingframework.logappender;

import LowLevelDesign.loggingframework.LogMessage;

public interface LogAppender {
    void append(LogMessage logmessage);
}