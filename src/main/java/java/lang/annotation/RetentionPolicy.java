/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang.annotation;

/**
 * Annotation retention policy.  The constants of this enumerated type
 * describe the various policies for retaining annotations.  They are used
 * in conjunction with the {@link Retention} meta-annotation type to specify
 * how long annotations are to be retained.
 *
 * 注解保存策略
 * 这些枚举常量描述了不同策略的保存细节
 * 它们和@Retention一起使用来指定自定义注解的保存策略
 *
 * @author  Joshua Bloch
 * @since 1.5
 */
public enum RetentionPolicy {
    /**
     * Annotations are to be discarded by the compiler.
     *
     * 自定义注解会被编译器抛弃，只存在源码中
     */
    SOURCE,

    /**
     * Annotations are to be recorded in the class file by the compiler
     * but need not be retained by the VM at run time.  This is the default
     * behavior.
     *
     * 自定义注解会被编译器编译进类文件，但不加载到虚拟机运行时里，这个是缺省的策略
     */
    CLASS,

    /**
     * Annotations are to be recorded in the class file by the compiler and
     * retained by the VM at run time, so they may be read reflectively.
     *
     * 自定义注解会被编译器编译到类文件里和被虚拟机加载到运行时，所以这些注解可以通过反射读取
     *
     * @see java.lang.reflect.AnnotatedElement
     */
    RUNTIME
}
