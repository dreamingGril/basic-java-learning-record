/*throw 关键字用于在当前方法中抛出一个异常。
通常情况下，当代码执行到某个条件下无法继续正常执行时，可以使用 throw 关键字抛出异常，以告知调用者当前代码的执行状态。
例如，下面的代码中，在方法中判断 num 是否小于 0，如果是，则抛出一个 IllegalArgumentException 异常。*/

package com.try_catch_study;

public class Throw {
    public static void main(String[] args) {
        // 1. 模拟一个非法数据（负数）
        int inputNum = -5;

        System.out.println("程序开始执行...");

        // 2. 使用 try-catch 包裹可能出错的调用
        try {
            checkNumber(inputNum);
            // 如果上面没有报错，说明数字合法，继续执行后续逻辑
            System.out.println("数字 " + inputNum + " 校验通过，正在处理业务...");
        } catch (IllegalArgumentException e) {
            // 3. 捕获异常：如果 checkNumber 抛出了异常，程序会跳到这里
            System.out.println("⚠️ 捕获到异常！");
            System.out.println("错误信息: " + e.getMessage());
            // e.printStackTrace(); // 如果需要看详细的堆栈信息，可以取消注释这行
        }

        System.out.println("程序继续执行其他任务...");
    }

    /**
     * 校验数字是否为正数
     * @param num 待校验的数字
     */
    public static void checkNumber(int num) {
        // 如果数字小于 0，主动抛出异常
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive, but got: " + num);
        }
        // 如果代码能运行到这里，说明 num >= 0，校验通过
    }
}
/*
throw 是“扔炸弹”：
在 checkNumber 里，throw new IllegalArgumentException(...) 就像是扔出了一个炸弹。一旦执行这行代码，checkNumber 方法会立即停止，不再往下执行。
catch 是“拆弹专家”：
main 方法里的 catch 块负责接住这个炸弹。如果没有 catch，程序会因为Unhandled Exception（未处理的异常）直接崩溃并退出。有了 catch，程序可以优雅地打印错误信息，然后继续执行后面的代码（比如“程序继续执行其他任务...”）。*/

