/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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
 * The constants of this enumerated type provide a simple classification of the
 * syntactic locations where annotations may appear in a Java program. These
 * constants are used in {@link Target java.lang.annotation.Target}
 * meta-annotations to specify where it is legal to write annotations of a
 * given type.
 *
 * 这些枚举常量可以为自定义注解提供一套可以出现在java程序位置的语法规范
 * 这些被用于@Target元注解里的枚举常量指定一个给定类型的注解可以编写在代码的哪个位置（类、接口、方法？等等...）
 *
 * <p>The syntactic locations where annotations may appear are split into
 * <em>declaration contexts</em> , where annotations apply to declarations, and
 * <em>type contexts</em> , where annotations apply to types used in
 * declarations and expressions.
 *
 * 这些语法规则指定注解可以出现在声明上下文的哪些地方，可以应用于哪些声明和类型的上下文环境，
 *
 * <p>The constants {@link #ANNOTATION_TYPE} , {@link #CONSTRUCTOR} , {@link
 * #FIELD} , {@link #LOCAL_VARIABLE} , {@link #METHOD} , {@link #PACKAGE} ,
 * {@link #PARAMETER} , {@link #TYPE} , and {@link #TYPE_PARAMETER} correspond
 * to the declaration contexts in JLS 9.6.4.1.
 *
 * <p>For example, an annotation whose type is meta-annotated with
 * {@code @Target(ElementType.FIELD)} may only be written as a modifier for a
 * field declaration.
 *
 * <p>The constant {@link #TYPE_USE} corresponds to the 15 type contexts in JLS
 * 4.11, as well as to two declaration contexts: type declarations (including
 * annotation type declarations) and type parameter declarations.
 *
 * <p>For example, an annotation whose type is meta-annotated with
 * {@code @Target(ElementType.TYPE_USE)} may be written on the type of a field
 * (or within the type of the field, if it is a nested, parameterized, or array
 * type), and may also appear as a modifier for, say, a class declaration.
 *
 * <p>The {@code TYPE_USE} constant includes type declarations and type
 * parameter declarations as a convenience for designers of type checkers which
 * give semantics to annotation types. For example, if the annotation type
 * {@code NonNull} is meta-annotated with
 * {@code @Target(ElementType.TYPE_USE)}, then {@code @NonNull}
 * {@code class C {...}} could be treated by a type checker as indicating that
 * all variables of class {@code C} are non-null, while still allowing
 * variables of other classes to be non-null or not non-null based on whether
 * {@code @NonNull} appears at the variable's declaration.
 *
 * @author  Joshua Bloch
 * @since 1.5
 * @jls 9.6.4.1 @Target
 * @jls 4.1 The Kinds of Types and Values
 */
public enum ElementType {
    /** Class, interface (including annotation type), or enum declaration 类、接口（包括注解的注解），枚举 注解 */
    TYPE,

    /** Field declaration (includes enum constants) 类字段注解 */
    FIELD,

    /** Method declaration 方法注解 */
    METHOD,

    /** Formal parameter declaration 入参注解 */
    PARAMETER,

    /** Constructor declaration 构造函数注解 */
    CONSTRUCTOR,

    /** Local variable declaration 局部变量注解 */
    LOCAL_VARIABLE,

    /** Annotation type declaration 注解的注解 */
    ANNOTATION_TYPE,

    /** Package declaration 包注解 */
    PACKAGE,

    /**
     * Type parameter declaration
     *
     * 泛型上的注解
     *
     * @since 1.8
     */
    TYPE_PARAMETER,

    /**
     * Use of a type
     *
     * 主要用于约束类的注解
     *
     * @since 1.8
     */
    TYPE_USE
}
