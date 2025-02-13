package org.homeworksubmission;

public class cat {

    int sum(int integer1,
            int integer2){

        int sum = integer1 + integer2;
        System.out.println(sum);
        return sum;
    }
    int sub(int integer1,
             int integer2){
        int sum = integer1 - integer2;
        System.out.println(sum);
        return sum;
    }
    int mul(int integer1,
             int integer2){
        int sum = integer1 * integer2;
        System.out.println(sum);
        return sum;
    }
    int div(int integer1,
             int integer2){
        int sum = integer1 / integer2;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        cat cat = new cat();
        cat.sum(1,2);
        cat.sub(2,2);
        cat.mul(2,2);
        cat.div(2,2);

    }
}
