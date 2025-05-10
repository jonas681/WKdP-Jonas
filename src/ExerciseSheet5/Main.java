package ExerciseSheet5;

public class Main {
    public static void main(String[] args) {

    }
    //Primitive datentypen(Können primitive Operationen durchführen z.B. int + int) sind keine Objekte,
    // deswegen brauchen wir Wrapperklassen, sodass auch z.B. Listen(welche nur Objekte speichern können) int als Integer
    //speichern können. Integer + Integer -> Ist nur möglich wegen Unboxing, Java wandelt automatisch Integer in int um
    public int countPrimitive(char [] values){
        int count = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] >= '1' &&  values[i] <= '9'){
                count++;
            }
        }return count;
    }


    public int countPrimitiveWhithIsDigit(char[] values){
        int count = 0;
        for(int i=0; i<values.length; i++){
            if(Character.isDigit(values[i]) == true){
                count++;
            }
        }return count;
    }
    public int findMax(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }return max;
    }
    public int finMaxWithCompare(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(Integer.compare(max, nums[i]) > 0){
                max = nums[i];
            }
        }return max;
    }

}
