package test.nio;

/**
 * @author laijunlin
 * @date 2021-01-19 15:46
 */
public class Test {
    public static void main(String[] args) {
        String readFilePath = "C:\\Users\\laijunlin\\Desktop\\zjff-10-10.00-new.xlsx";
        String writeFilePath = "C:\\Users\\laijunlin\\Desktop\\write.txt";
        try{
            ReadAndWriteFileByChannel.fastCopy(readFilePath,writeFilePath);
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
