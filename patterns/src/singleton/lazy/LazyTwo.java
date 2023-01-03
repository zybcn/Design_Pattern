package singleton.lazy;

/**
 * @Author 程序员小张
 * @Date 2023-01-03 22:26
 * @Desc 线程安全  该方法有性能问题 不推荐使用
 */
public class LazyTwo {

    private static LazyTwo uniqueInstance;


    private LazyTwo() {
    }

    public static synchronized LazyTwo getUniqueInstance() {
        if (uniqueInstance == null) {
            return new LazyTwo();
        }
        return uniqueInstance;
    }
}
