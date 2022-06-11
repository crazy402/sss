package day.Day22Demo;

import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/10 18:09
 * @description //
 **/
public class Test1 {
    public static void main(String[] args) {
       // getBoot();
        getExt();

    }

    /**
     * JDK中的核心类库的加载器  BootClassLoader
     * 可以获取到一个类的加载器
     * java.lang.ClassLoader
     *
     * @param
     * @return
     * @author crazy402
     */

    public static void getBoot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);
    }

    /**
     * jdk中的扩展器ExtClassLoader
     */
    public static void getExt() {
        ClassLoader classLoader = DNSNameService.class.getClassLoader();
        System.out.println(classLoader);
    }

}
