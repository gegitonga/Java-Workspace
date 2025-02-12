package LowLevelDesign.loggingframework.logappender;

import java.io.FileWriter;

import LowLevelDesign.loggingframework.LogMessage;

public class Fileappender implements LogAppender {
    private final String filepath;

    public Fileappender(String filepath){
        this.filepath = filepath;
    }

    @Override
    public void append(LogMessage logmessage) {
        try(FileWriter writer = new FileWriter(filepath,true)) {
            writer.write(logmessage.toString() + "\n");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    
}
