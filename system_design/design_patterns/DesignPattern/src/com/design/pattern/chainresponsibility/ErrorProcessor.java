package com.design.pattern.chainresponsibility;

public class ErrorProcessor extends LoggingProcessor{

    private LoggingProcessor nextLoggingProcessor;
    public ErrorProcessor(LoggingProcessor nextLoggingProcessor) {
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == ErrorProcessor.ERROR){
            System.out.println("error:" + message);
        }else{
            super.log(level, message);
        }
    }
}
