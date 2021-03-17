package com.lining.another;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * @author lining
 * @date 2021/2/25 15:10
 * map转 自定义方法
 */
public class Test {
    public static <T> T mapToObject(Map<String, Object> map, Class<T> beanClass) {
        if (map == null) {
            return null;
        }
        T object = null;
        try {
            object = beanClass.newInstance();
            Field[] fields = object.getClass().getFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                //static final
                if (Modifier.isFinal(modifiers) || Modifier.isStatic(modifiers)) {
                    continue;
                }
                //作用就是让我们在用反射时访问私有变量
                field.setAccessible(true);
                //将指定对象变量上此 Field 对象表示的字段设置为指定的新值.
                field.set(object, map.get(field.getName()));
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }


}
