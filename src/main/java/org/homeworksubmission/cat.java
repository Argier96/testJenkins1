package org.homeworksubmission;

public class cat {


    void sum(int integer1,
    int integer2){
        int sum = integer1 + integer2;
        System.out.println(sum);
    }
    void sub(int integer1,
             int integer2){
        int sum = integer1 - integer2;
        System.out.println(sum);
    }
    void mul(int integer1,
             int integer2){
        int sum = integer1 * integer2;
        System.out.println(sum);
    }
    void div(int integer1,
             int integer2){
        int sum = integer1 / integer2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        cat cat = new cat();
        cat.sum(1,2);
        cat.sub(2,2);
        cat.mul(2,2);
        cat.div(2,2);

    }
}
