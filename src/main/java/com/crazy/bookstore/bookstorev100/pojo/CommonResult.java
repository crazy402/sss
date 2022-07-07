package com.crazy.bookstore.bookstorev100.pojo;

/**
 * 异步请求，响应CommonResult对象（存储请求的结果）
 * CommonResult对象转成JSON响应
 */
public class CommonResult {
    /**
     * 服务器端处理请求的标示
     */
    private boolean flag;

    /**
     * 当服务器端处理请求成功的时候要显示给客户端的数据(主要针对于查询)
     */
    private Object resultData;

    /**
     * 当服务器端处理请求失败的时候要响应给客户端的错误信息
     */
    private String message;
    public CommonResult(){}

    public CommonResult(boolean flag, Object resultData, String message) {
        this.flag = flag;
        this.resultData = resultData;
        this.message = message;
    }

    /**
     * 处理请求成功
     * @return
     */
    public static CommonResult ok(){
        return new CommonResult().setFlag(true);
    }

    /**
     * 处理请求失败
     * @return
     */
    public static CommonResult error(){
        return new CommonResult().setFlag(false);
    }

    public boolean isFlag() {
        return flag;
    }

    private CommonResult setFlag(boolean flag) {
        this.flag = flag;
        return this;
    }

    public Object getResultData() {
        return resultData;
    }

    public CommonResult setResultData(Object resultData) {
        this.resultData = resultData;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResult setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "flag=" + flag +
                ", resultData=" + resultData +
                ", message='" + message + '\'' +
                '}';
    }
}

