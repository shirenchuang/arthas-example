package com.shirc.arthasexample.jvm;


import java.util.Map;

/**
 *
 */
public class MemoryLeak {


    static class BadKey {
        // no hashCode or equals();
        public final String key;
        public BadKey(String key) { this.key = key; }
    }
    /**
     * 内存泄漏
     * https://stackoverflow.com/questions/6470651/creating-a-memory-leak-with-java
     */
    public static void mapLeak(){
        Map map = System.getProperties();

        while (true){
            map.put(new BadKey("key"), "value"); // Memory leak even if your threads die
        }
    }








    public static void main(String[] args) {
        mapLeak();
    }
}
