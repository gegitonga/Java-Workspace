package main;

public class StringMutable {
    public static void main(String[] args){
        StringBuffer sbf = new StringBuffer("Hello");
        char[] data = {'W','o','r','l','d'};

//       //append char[]
//        char[] data = {' ','w','o','r','l','d'};
//        sbf.append(data);
//        System.out.println(sbf);

//        //append char[] , offset:int, len: int
//        sbf.append(data, 1,3);
//        System.out.println(sbf);

        sbf.insert(5, data, 0, 3);
        System.out.println(sbf);
    }
}
