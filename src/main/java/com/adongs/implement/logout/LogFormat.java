package com.adongs.implement.logout;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author adong
 * @version 1.0
 */
public interface LogFormat {

    /**
     * 默认格式化内容
     * @param logOutInfo LogOutInfo
     * @return 输出字符串
     */
    public  StringBuffer format(LogOutInfo logOutInfo);

    /**
     * 自定义内容
     * @param logOutInfo LogOutInfo
     * @param content 自定义内容
     * @return 输出字符串
     */
    public StringBuffer customize(LogOutInfo logOutInfo,String content);

    public static class LogOutInfo {

        private String label;

        private Method method;

        private Map<String,Object> paramAndValue;

        private Object returnInfo;

        private Throwable throwInfo;

        public LogOutInfo(JoinPoint joinPoint, String label, Map<String,Object> paramAndValue, Object returnInfo, Throwable throwInfo) {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            this.method = signature.getMethod();
            this.label = label;
            this.paramAndValue = paramAndValue;
            this.returnInfo = returnInfo;
            this.throwInfo = throwInfo;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public Map<String, Object> getParamAndValue() {
            return paramAndValue;
        }

        public void setParamAndValue(Map<String, Object> paramAndValue) {
            this.paramAndValue = paramAndValue;
        }

        public Object getReturnInfo() {
            return returnInfo;
        }

        public void setReturnInfo(Object returnInfo) {
            this.returnInfo = returnInfo;
        }

        public Throwable getThrowInfo() {
            return throwInfo;
        }

        public void setThrowInfo(Throwable throwInfo) {
            this.throwInfo = throwInfo;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
}
