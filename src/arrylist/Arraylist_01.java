/*ArrayList 类位于 java.util 包中，使用前需要引入它，语法格式如下：

import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
E: 泛型数据类型，用于设置
objectName 的数据类型，只能为引用数据类型。
objectName: 对象名。
ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
ArrayList 的主要方法如下：

add(E e): 向列表末尾添加指定元素。
add(int index, E element): 在列表的指定位置插入指定元素。
remove(int index): 删除列表中指定位置的元素。
remove(E element): 删除列表中第一个匹配的元素。
get(int index): 返回列表中指定位置的元素。
set(int index, E element): 用指定元素替换列表中指定位置的元素。
size(): 返回列表中元素的数量。
isEmpty(): 判断列表是否为空。
contains(E element): 判断列表是否包含指定元素。
clear(): 删除列表中的所有元素。
addAll(Collection<? extends E> c): 将指定集合中的所有元素添加到列表中。
toArray(): 将列表中的元素转换为数组。

 */
package arrylist;
import java.util.ArrayList;

public class Arraylist_01 {
        public static void main(String[] args) {
            ArrayList<String> sites = new ArrayList<String>();
            sites.add("Google");
            sites.add("Runoob");
            sites.add("Taobao");
            sites.add("Weibo");
            System.out.println(sites);
        }
    }

//直观的感受一下 用基础C语言写的时候吧  几十行VS Java几行  简直就是天壤之别
/*#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 1. 以前你得先定义一个复杂的结构体
typedef struct {
    char **data;  // 二级指针，用来存字符串数组
    int size;     // 当前元素个数
    int capacity; // 总容量
} StringList;

// 2. 初始化函数
void initList(StringList *list) {
    list->capacity = 2;
    list->size = 0;
    list->data = (char**)malloc(sizeof(char*) * list->capacity);
}

// 3. 极其繁琐的添加函数（核心痛点）
void add(StringList *list, char *str) {
    // 手动检查扩容
    if (list->size >= list->capacity) {
        int newCapacity = list->capacity * 2;
        char **newData = (char**)malloc(sizeof(char*) * newCapacity);
        // 手动拷贝数据
        for(int i=0; i<list->size; i++) {
            newData[i] = list->data[i];
        }
        free(list->data); // 手动释放旧内存
        list->data = newData;
        list->capacity = newCapacity;
    }
    // 最后才是赋值
    list->data[list->size] = str;
    list->size++;
}

// 4. 打印函数
void printList(StringList *list) {
    printf("[");
    for(int i=0; i<list->size; i++) {
        printf("%s", list->data[i]);
        if(i < list->size - 1) printf(", ");
    }
    printf("]\n");
}

int main() {
    StringList sites;
    initList(&sites); // 初始化

    // 调用添加
    add(&sites, "Google");
    add(&sites, "Runoob");
    add(&sites, "Taobao");
    add(&sites, "Weibo");

    printList(&sites);

    // 5. 别忘了手动释放内存，否则就是内存泄漏！
    free(sites.data);

    return 0;
}

 */
//再来感受一下普通Java语言实现相同功能所需要的繁琐代码量吧

/*
public class MySimpleList {
    private int[] data; // 底层用数组存数据
    private int size;   // 记录当前存了多少个元素

    // 1. 初始化：一开始给个固定大小，比如 2
    public MySimpleList() {
        data = new int[2];
        size = 0;
    }

    // 2. 添加元素（最复杂的部分）
    public void add(int num) {
        // 【核心痛点】：如果满了，必须手动扩容！
        if (size == data.length) {
            System.out.println("数组满了，正在扩容...");
            // 1. 算出新容量（通常是原来的 1.5 倍或 2 倍）
            int newCapacity = data.length * 2;
            // 2. 创建一个新的大数组
            int[] newData = new int[newCapacity];
            // 3. 把旧数组的数据一个个拷过去
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // 4. 把旧数组引用断开，指向新数组
            data = newData;
        }
        // 最后才是把数据放进去
        data[size] = num;
        size++;
    }

    // 3. 打印所有元素
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MySimpleList list = new MySimpleList();
        list.add(10);
        list.add(20);
        list.add(30); // 这里会触发扩容逻辑
        list.add(40);
        list.print();
    }
}

 */