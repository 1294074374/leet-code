package test.se.io;

import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * @author laijunlin
 * @date 2021-03-26 14:58
 */
public class MyNIO {
    public static void main(String[] args) {
        // 分配内存大小为10的缓存区
        IntBuffer buffer = IntBuffer.allocate(10);
        // 往buffer里写入数据
        for (int i = 0; i < 5; ++i) {
            int randomNumber = new SecureRandom().nextInt(20);
            buffer.put(randomNumber);
        }
        // 将Buffer从写模式切换到读模式（必须调用这个方法）
        //buffer.flip();
        // 读取buffer里的数据
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
