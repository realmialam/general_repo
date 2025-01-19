package com.design.pattern.chainresponsibility;

public class DebugProcessor extends LoggingProcessor{

    private LoggingProcessor nextLoggingProcessor;
    public DebugProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == DebugProcessor.DEBUG){
            System.out.println("debug:" + message);
        }else{
            super.log(level, message);
        }
    }
}
