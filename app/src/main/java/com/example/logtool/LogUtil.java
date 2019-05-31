package com.example.logtool;

    /*
    * DACHUNG 19-5-31
    *  日志打印工具
    *  源于郭霖
    */


public class LogUtil {
    private LogUtil mLog;

    /*
    *  常量，表信息等级
     */
    public static final int DEBUG = 0;
    public static final int INFO = 1;
    public static final int WARN = 2;
    public static final int ERROR = 3;

    /*
    * 变量，表要打印的等级
     */
    public int level = DEBUG;

    /*
    * 空构造函数，为实现单例模式
     */
    LogUtil(){}

    /*
    * 唯一获取单例方法，对外接口
     */
    public LogUtil getinstance(){

        /*
        * 第一层锁，避免多线程调用该方法受同步锁影响性能
         */
        if (mLog==null){

            /*
            * 线程锁，避免多线程状态下多次实例对象
             */
            synchronized (LogUtil.class){

                /*
                * 第二层锁，保证单例
                 */
                if (mLog==null){
                    mLog = new LogUtil();
                }
            }
        }
        return mLog;
    }

    public void debug(String msg){
        if (DEBUG >= level){
            System.out.println(msg);
        }
    }

    public void info(String msg){
        if (INFO >= level){
            System.out.println(msg);
        }
    }

    public void warn(String msg){
        if (WARN >= level){
            System.out.println(msg);
        }
    }

    public void error(String msg){
        if (ERROR >= level){
            System.out.println(msg);
        }
    }
}
