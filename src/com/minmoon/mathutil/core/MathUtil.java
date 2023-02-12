
package com.minmoon.mathutil.core;

/**
 *
 * @author mint_leo
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó mà ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4....n
    //ko có giai thừa âm
    //0! = 1 = 1! quy ước
    //giai thừa tăng rất nhanh, dốc dứng
    //20! 18 con số 0, vừa kịp đủ cho kiểu long
    //bài này quy ước tính n! trong khoảng (0, 20)
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argumnent. N must be from 0 to 20");
        if (n == 0 || n == 1)
            return 1; //gtri đặc biệt
        long product = 1; //tích nhân dồn, thuật toán con heo đất
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
}
