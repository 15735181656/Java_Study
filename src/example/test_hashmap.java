package example;

import java.lang.reflect.Field;
import java.util.HashMap;

public class test_hashmap {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = HashMap.class.getDeclaredField("threshold");
        f.setAccessible(true);

        //1.无参构造,初始化填充因子=0.75,此时table=null,threshold=0,size=0
        HashMap<String, Integer> map = new HashMap<>();

        Object m = f.get(map);
        System.out.println("1.threshold: " + m);
        System.out.println("1.size: " + map.size());

        //2.采用此构造函数,初始化填充=0.75(默认),计算threshold为最小的2^n=1,table=null,size=0
        HashMap<String, Integer> map1 = new HashMap<>(1);

        Object m1 = f.get(map1);
        System.out.println("2.threshold: " + m1);
        System.out.println("2.size: " + map1.size());

        //3.采用此构造函数,初始化填充=0.75(默认),计算threshold为最小的2^n=2,table=null,size=0
        // Note:此处的threshold是虚假阈值，因为在第一次加元素的时候，会经历
        // 一.table = threshold = 2   二.threshold=(int)2*0.75=1
        HashMap<String, Integer> map2 = new HashMap<>(2);

        Object m2 = f.get(map2);
        System.out.println("3.threshold: " + m2);
        System.out.println("3.size: " + map2.size());

        //4.采用此构造函数,初始化填充=0.75,计算threshold为最小的2^n=8,table=null,size=0
        // Note:此处的threshold是虚假阈值，因为在第一次加元素的时候，会经历
        // 一.table = threshold = 8   二.threshold=(int)2*0.75=6   构造以此类推
        HashMap<String, Integer> map3 = new HashMap<>(5,0.75f);

        Object m3 = f.get(map3);
        System.out.println("4.threshold: " + m3);
        System.out.println("4.size: " + map3.size());

        //5.采用此构造函数,传入(实际长度)size>0才进行下一步操作,计算threshold=0,table=null,size=0
        HashMap<String, Integer> map4 = new HashMap<>(map);

        Object m4 = f.get(map4);
        System.out.println("5.threshold: " + m4);
        System.out.println("5.size: " + map4.size());

        //6.无参构造的map会在第一次添加元素的时候进行扩容,table=16(默认),threshold=12(16*0.75),size=1(实际个数)
        map.put("zzh", 66);

        Object m7 = f.get(map);
        System.out.println("6.threshold: " + m7);
        System.out.println("6.size: " + map.size());

        //7.此时size=1>0,  扩容一次
        // 计算threshold为最小的2^n=1,table=2,size=1
        HashMap<String, Integer> map5 = new HashMap<>(map);

        Object m5 = f.get(map5);
        System.out.println("7.threshold: " + m5);
        System.out.println("7.size: " + map5.size());

        map.put("ghh", 66);
        //8.此时size=1>0,计算threshold为最小的2^n=3,table=4,size=2
        //经历 一.2>threshold(1)  二.扩容table=2 threshold=1 三.扩容table=4 threshold=3
        HashMap<String, Integer> map6 = new HashMap<>(map);

        Object m6 = f.get(map6);
        System.out.println("8.threshold: " + m6);
        System.out.println("8.size: " + map6.size());

        //9.此时加入一个元素,进行实际的扩容操作,threshold=1,table=2,size=1
        map1.put("ghh",66);

        Object m8 = f.get(map1);
        System.out.println("9.threshold: " + m8);
        System.out.println("9.size: " + map1.size());

        //10.此时加入一个元素,进行实际的扩容操作,threshold=1,table=2,size=1
        map2.put("ghh",66);

        Object m9 = f.get(map2);
        System.out.println("10.threshold: " + m9);
        System.out.println("10.size: " + map2.size());

        //11.此时加入一个元素,进行实际的扩容操作,threshold=6,table=8,size=1
        map3.put("ghh",66);

        Object m10 = f.get(map3);
        System.out.println("11.threshold: " + m10);
        System.out.println("11.size: " + map3.size());
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(1);
//
//        System.out.println(list.equals(list1));
    }
}
