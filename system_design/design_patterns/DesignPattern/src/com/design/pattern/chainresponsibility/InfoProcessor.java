package com.design.pattern.chainresponsibility;

public class InfoProcessor extends LoggingProcessor{

    private LoggingProcessor nextLoggingProcessor;
    public InfoProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == InfoProcessor.INFO){
            System.out.println("info:" + message);
        }else{
            super.log(level, message);
        }
    }
}
