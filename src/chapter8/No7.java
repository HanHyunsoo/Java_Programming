package chapter8;

import java.io.*;

public class No7 {
    public static void main(String[] args) {
        File FileToCopy = new File("D:\\Temp\\a.jpg");
        File CopiedFile = new File("D:\\Temp\\b.jpg");
        long FileSize = FileToCopy.length();
        long CopiedSize = 0;

        byte[] buf = new byte[1024];

        try {
            FileOutputStream fos = new FileOutputStream(CopiedFile);
            FileInputStream fis = new FileInputStream(FileToCopy);
            System.out.printf("a.jpg의 용량 = %d 바이트\na.jpg를 b,jpg로 복사합니다.\n", FileSize);
            
            while (true) {
                int readCount = fis.read(buf);
                fos.write(buf, 0, readCount);
                if (readCount < buf.length) {
                    Thread.sleep(250);
                    System.out.print("*");
                    break;
                } else {
                    CopiedSize += 1024;
                    if (FileSize / 10 <= CopiedSize) {
                        Thread.sleep(250);
                        System.out.print("*");
                        CopiedSize = 0;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("오류.");
            e.printStackTrace();
        }
    }
}
