package assignment.assignment6;

import java.util.HashSet;

public class VampireNumber {

    public static void main(String[] args) {

        System.out.println("First 100 Vampire Number");
        System.out.println(first100VampireNumber());
    }

    static String first100VampireNumber(){

        StringBuffer storeOutPut = new StringBuffer();
        HashSet<Integer> checkDuplicationVampireNumber = new HashSet<>();
        int countVampireNumber = 0 ;
        int firstVampireFactor = 1;

        while(countVampireNumber<100){

            int secondVampireFactor = firstVampireFactor;

            while(Integer.toString(firstVampireFactor).length() == Integer.toString(secondVampireFactor).length()){

                if(isFactorFollowVampireRule(firstVampireFactor,secondVampireFactor)){

                    int vampireNumber = firstVampireFactor*secondVampireFactor;

                    if(!checkDuplicationVampireNumber.contains(vampireNumber)){
                        checkDuplicationVampireNumber.add(vampireNumber);
                        storeOutPut.append(Integer.toString(vampireNumber)+"\n");
                        countVampireNumber++;
                    }
                }
                secondVampireFactor++;
            }

            firstVampireFactor++;
        }

        return new String(storeOutPut);
    }

    static boolean isFactorFollowVampireRule(int f, int s){

        if((f%10 == 0) &&(s%10 == 0))
            return false;

        return true;
    }
}
