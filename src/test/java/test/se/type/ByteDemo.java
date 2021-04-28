package test.se.type;

public class ByteDemo {
    public static void main(String[] args){
        byte byte1 = 1;
        byte byte2 = 2;
        byte num = (byte) (byte1 + byte2);
        System.out.println(num);

        final byte byte3 = 3;
        final byte byte4 = 4;
        byte c = byte3 + byte4;
        System.out.println(c);
    }
}
