package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
/**
 Java基础-集合：HashSet
 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 红色球号码从1—33中选择；蓝色球号码从1—16中选择；
 请随机生成一注双色球号码。（要求同色号码不重复）
 */
public class Main {
    public static void main(String[] args) {
//        获取红色球
        HashSet hashSet = new HashSet();
        Random random = new Random();
            while(hashSet.size()<6){
                int i = random.nextInt(33) +1;
                hashSet.add(i);
            }
//            获取蓝色球
        int i = (int) (1 + Math.random() * (16 - 1 + 1));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println(i);
    }
}