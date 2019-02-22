public class Runner {
    //Warmup 1: SleepIn

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == false && weekday == true){
            return false;
        }
        return true;
    }
//Warmup 2: stringTimes

    public String stringTimes(String str, int n) {
        String newS = "";

        for(int i= 0; i < n; i++){
            newS = newS +  str;
        }
        return newS;
    }

    //Warmup 3:
    public String firstTwo(String str) {
        if(str.length() > 2){
            return "error";
        }else {
            return str.substring(0,2);
        }
    }


    //Warmup 4:
    public int[] plusTwo(int[] a, int[] b) {
        int[] myArray = new int[4];
        myArray[0] = a[0];
        myArray[1] = a[1];
        myArray[2] = b[0];
        myArray[3] = b[1];

        return myArray;

    }

    //Warmup 5:
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;

        if ((isMorning||isMom)||!isMorning)){
            return true;

    } else{
        return false;
    }
}

    // Warmup 6:
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }
        int sumA = 21 - a;
        int sumB = 21 - b;

        if (sumA > sumB) {
            return b;
        } else {
            return a;
        }

    }

    //Warmup 7:
    public String starOut(String str) {
        int len = str.length();
        String finalString = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
                finalString = finalString.substring(0,finalString.length()-1);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
                finalString += str.charAt(i);


        }

        return finalString;
    }


    //Warmup 8:
    public boolean gHappy(String str) {
        boolean happiness = true;
        int len = str.length();

        for (int i = 0; i < len; i++) {

            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g')
                    happiness = true;
                else if (i < len-1 && str.charAt(i+1) == 'g')
                    happiness = true;
                else
                    happiness = false;
            }
        }
        return happiness;
    }

    //Warmup 9:
    public int[] fizzArray(int n) {

        int[] end = new int[n];
        for (int i = 0; i < n; i++)
            end[i] = i;
        return end;

    }

    //Warmup 10:
    public int maxMirror(int[] nums) {
        int len = nums.length;
        int number= 0;
        int max = 0;

        for (int i = 0; i < len; i++){
            number=0;

            for (int j = len-1; i +  number < len && j > -1; j--){
                if(nums[i+number] == nums[j]){
                    number++;
                }
                else{

                    if (number > 0){
                        max = Math.max(number,max);
                        number = 0;
                    }
                }
            }
            max = Math.max(number,max);
        }
        return max;
    }


