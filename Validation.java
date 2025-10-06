public class Validation {
    public static String nameError(String name){
        if(name == null || name.isEmpty()){
            return "Ошибка в веденном имени";
        }
        if(name.length()<2){
            return "Ошибка в веденном имени";
        }
        if (name.length()>10){
            return "Ошибка в веденном имени";
        }
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if(!Character.isLetter(c)){
                return "Ошибка в веденном имени";
            }
        }
        return null;
    }
    public static int errorInArray(int[] number){
        if(number == null) {
            return 1;  // null - ошибка
        }
        for (int i = 0; i < number.length; i++){
            if(number[i] < 2 || number[i] >5){
                return 1;
            }
        }
        return 0;
    }

}

