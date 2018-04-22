package com.wcang.kotlindemo;

class Person(val name: String, var age: Int, var isMarried: Boolean) {
    override fun toString() = "${name} is $age years old and ${ if (isMarried) "married" else "single" }"
}