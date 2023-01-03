package singleton.lazy;

/**
 * @Author 程序员小张
 * @Date 2023-01-03 22:27
 * @Desc 线程安全
 */
public class DCL {

    private volatile static DCL uniqueInstance;

    private DCL() {
    }

    public static DCL getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DCL.class) {
                if (uniqueInstance == null) {
                    return new DCL();
                }
            }
        }
        return uniqueInstance;
    }

}
