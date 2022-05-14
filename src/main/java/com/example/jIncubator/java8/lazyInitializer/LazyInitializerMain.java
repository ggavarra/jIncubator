package com.example.jIncubator.java8.lazyInitializer;

import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.apache.commons.lang3.concurrent.LazyInitializer;


/**
 * Lazy initialization is a performance optimization. It's used when data is deemed to be 'expensive' for some reason. For example:
 * if the hashCode value for an object might not actually be needed by its caller, always calculating the hashCode for all instances of the object may be felt to be unnecessary.
 * since accessing a file system or network is relatively slow, such operations should be put off until they are absolutely required.
 * Lazy initialization has two objectives:
 * delay an expensive operation until it's absolutely necessary
 * store the result of that expensive operation, such that you won't need to repeat it again
 * 
 * http://www.javapractices.com/topic/TopicAction.do?Id=34
 */

public class LazyInitializerMain {
    public void execute() throws ConcurrentException {

       /* ComplexObjectInitializer initializer= new ComplexObjectInitializer<Trade>();
        initializer.get();*/
                
    }

    public static void main(String[] args) {
        LazyInitializerMain main= new LazyInitializerMain();
        try {
            main.execute();
        } catch (ConcurrentException e) {
            e.printStackTrace();
        }
    }
    
    

   /* 
    private class ComplexObjectInitializer<T> extends LazyInitializer{

        @Override
        protected T initialize() throws ConcurrentException {
            System.out.println("Inside ComplexObjectInitializer ");
           return new T();
           
        }
    }
    */
    
    
    private class Trade {
        private String tradeId;
        private Long version;

        public Trade(String tradeId, Long version) {
            this.tradeId = tradeId;
            this.version = version;
            loadOtherObjects(); //assume this is memory intensive.hence  want to defer the initialization process
        }

        private void loadOtherObjects() {
        }

        public String getTradeId() {
            return tradeId;
        }

        public void setTradeId(String tradeId) {
            this.tradeId = tradeId;
        }

        public Long getVersion() {
            return version;
        }

        public void setVersion(Long version) {
            this.version = version;
        }
    }
    
    
}
