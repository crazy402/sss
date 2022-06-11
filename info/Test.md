### 1、break、continue、return的区别？
* break : 循环中直接结束语句
* continue: 跳出当前循环 继续执行下一个循环
* return: 返回值 结束当前方法

### 2、请列出一些常用的类、接口、包，各至少5个
* 类: Math  Random String FileInPutStream  FileOutPutStream
* 接口: Runable Comparable，Comparator，Serializable，Collection
* 包: lang  util Io Exception net

### 3、访问修饰符的作用范围由大到小，及各自的范围是什么？可以修饰什么？
* private xxx√
* 默认的  xx√√
* protected  x√√√
* public  √√√√

###4、请对public static void main(String[] args)的每一个单词做解释
* public : 公共的 谁都可以访问
* static : 静态的 类直接调用 不用创建对象
* void : 当前方法没有返回值
* main : 方法名
* String[] : 字符串数组，这是main方法的形参类型，可以通过命令行参数传值
* args : 这是main方法的形参名，如果要在main中使用命令行参数，可以遍历该args数组

### 5、请解释Overload与Override的区别
* Overload : 方法重载 方法名相同 参数不同
* Override : 方法重写 方法名相同 方法体不同  子类继承父类时 
重写必须遵守方法名和形参列表与父类的被重写的方法相同

### 6、final、finalize、finally的区别
* final : 被final的修饰的 无法改变且无法继承 
* finalize : 对象被垃圾处理的时候调用
* finally : 被finally修饰的方法一定会执行

###7、面向对象的基本特征有哪些？并作出解释
* 封装 : 安全 将代码私有化封装只需要暴露外部接口 可以不用关心方法的实现直接使用
* 继承 : 代码的复用和扩展
* 多态 : 解耦

###8、请解释String、StringBuilder、StringBuffer的区别
* String : 被final修饰 不可变
* StringBuilder : 线程安全 效率低
* StringBuffer : 线程不安全 效率高


