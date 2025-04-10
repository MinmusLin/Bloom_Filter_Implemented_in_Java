package cn.minmuslin;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

@SuppressWarnings("UnstableApiUsage")
public class Main {
    public static void main(String[] args) {
        BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), 1500, 0.01);
        System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(2));
        filter.put(1);
        filter.put(2);
        System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(2));
    }
}
