package com.hhit.travelVerificationSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class CheckAddrUtil {
    public  static  List<String> getDangerAddr() {
        List<String> addrs = new ArrayList<>();
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\project\\springFramework\\day05_homework\\src\\main\\resources\\addr.properties");
            properties.load(inputStream);
            Set<Map.Entry<Object, Object>> entries = properties.entrySet();
            for (Map.Entry<Object, Object> entry : entries) {
                addrs.add((String) entry.getKey());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return addrs;
    }

    public static  boolean checkAddr(String addr) {
        List<String> dangerAddr = getDangerAddr();
        for (String string : dangerAddr) {
            if (string.equals(addr)) {
                return true;
            }
        }
        return false;
    }
}
