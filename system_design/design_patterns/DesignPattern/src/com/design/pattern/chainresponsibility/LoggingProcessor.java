package com.design.pattern.chainresponsibility;

public abstract class LoggingProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private LoggingProcessor nextLoggingProcessor;
    public LoggingProcessor(LoggingProcessor nextLoggingProcessor){
        this.nextLoggingProcessor = nextLoggingProcessor;
    }

    public void log(int level, String message){
        if(this.nextLoggingProcessor != null){
            this.nextLoggingProcessor.log(level, message);
        }
    }
}
