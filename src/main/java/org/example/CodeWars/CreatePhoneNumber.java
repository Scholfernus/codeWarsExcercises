package org.example.CodeWars;

public class CreatePhoneNumber {
    public static void main(String[] args) {
       int[]numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
    }
    public static String createPhoneNumber(int[] numbers) {
        String result = "(";
        String part2 = "";
        String part3 = "";
        for (int i = 0; i < 3 ; i++) {
            result+=numbers[i];
        }
        for (int i = 3; i < 6; i++) {
            part2+=numbers[i];
        }
        for (int i = 6; i <10 ; i++) {
            part3 +=numbers[i];
        }

        return result + ") " + part2 + "-" + part3;
    }
}

// return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],
// numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------
// return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------
// String phoneNumber = new String("(xxx) xxx-xxxx");//
//    for (int i : numbers) {
//      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
//    }
//    return phoneNumber;
//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------
// StringBuffer str = new StringBuffer("(");
//    for(int i = 0; i < 10; i++){
//      str.append(String.valueOf(numbers[i]));
//      if(i == 2)
//        str.append(") ");
//      if(i == 5)
//        str.append("-");
//    }
//    return str.toString();
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
// return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
//---------------------------------------------------------------------------------------

