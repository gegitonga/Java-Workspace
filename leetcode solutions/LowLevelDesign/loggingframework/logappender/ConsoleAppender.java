package LowLevelDesign.loggingframework.logappender;

import LowLevelDesign.loggingframework.LogMessage;

public class ConsoleAppender implements LogAppender{

    @Override
    public void append(LogMessage logmessage) {
        System.out.println(logmessage);
    }
    
}
