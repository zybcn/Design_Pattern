package singleton.eager;

/**
 * @Author 程序员小张
 * @Date 2023-01-03 22:21
 * @Desc 线程安全
 */
public class EagerInstantiation {

    private static EagerInstantiation uniqueInstance = new EagerInstantiation();

    private EagerInstantiation() {
    }

    public static EagerInstantiation getUniqueInstance() {
        return uniqueInstance;
    }
}
