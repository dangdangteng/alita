package com.angle.alita.mimor;

import org.springframework.boot.autoconfigure.cache.CacheProperties;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class demo1 {
    private static final int aaa = 12;
    private static final String name = "baiyang";

    /**
     * @param : null
     * @return : null
     * @description : 主方法
     */
    public static void main(String[] args) {
        Long along = 1231231L;
        List rq = new ArrayList();
        f1(rq);

        System.out.println(along.toString());
        System.out.println(along.hashCode());
        BigDecimal bigDecimal = new BigDecimal(1232);
        Integer a = 128;
        Integer b = 128;
        if (a.equals(b)) {
            System.out.println("yes");
        }
        for (int i = 0; i < 109; i++) {

        }
        Integer abc = new Integer(1);
        int aint = 123;
    }

    private static void f1(List atlist) {
        for (int i = 0; i < atlist.size(); i++) {

        }
    }

    static enum demo {
        ;

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
