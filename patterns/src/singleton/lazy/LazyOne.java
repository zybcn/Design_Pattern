package singleton.lazy;

/**
 * @Author 程序员小张
 * @Date 2023-01-03 22:17
 * @Desc 线程不安全
 */
public class LazyOne {

    private static LazyOne uniqueInstance;


    private LazyOne() {
    }

    public static LazyOne getUniqueInstance() {
        if (uniqueInstance == null) {
            return new LazyOne();
        }
        return uniqueInstance;
    }


}
