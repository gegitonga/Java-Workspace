package main.medium;

import java.util.List;

public class ArrayAndGenerics {
    public static void main(String[] args){
        Integer[] intpair = new Integer[]{100, 200};
        double sum = sum(intpair);
        System.out.println(sum);

        Float[] floats = {3.2F, 5.2F};
        double sum2 = sum(floats);
        System.out.println(sum2);

        List<Integer> pair = List.of(300, 400);
        Integer fp = pair.get(1);
        System.out.println(fp);
    }

    private static double sum(Number[] nums){
        double result = 0;
        for (Number num: nums){
            result += num.doubleValue();
        }
        return result;
    }

    private static <T extends Number> double sumList(List<T> nums){
        double result = 0;
        for(Number num: nums){
            result =+ num.doubleValue();
        }
        return result;
    }

    public static double sumListWild(List<? extends Number> nums){
        double result = 0;
        for(Number num: nums){
            result =+ num.doubleValue();
        }
        return result;
    }

    public static <T extends Number> double sumArray(T[] t){
        double result = 0;
        for(T num: t){    
            result =+ num.doubleValue();
        }
        return result;
    }
}
