@file:JvmName("StringUtil")
package com.wcang.kotlindemo;

@JvmOverloads
fun <E> stupidFunction(aCollection: Collection<E>, separator: String = " "): String {
    val result = StringBuilder("[")

    for ((index, element) in aCollection.withIndex()) {
        result.append("$element ")
        if (index != aCollection.size - 1) {
            result.append(separator)
        }
    }

    return result.append("]").toString()
}