public class Main {

    public static void main(String[] args) {
        Task_1();
        Task_2();
    }


    public static void Task_1(){
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
//        fullName = fullName.replace( "",  " ");
       // fullName.replaceAll("(?!^)([A-Z])", " $1");
        System.out.println("ФИО сотрудника - " + fullName.replaceAll("([a-z]+)([A-Z])", "$1 $2"));
//        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("");
        System.out.println("Задание 2");

//        String fullName = "Ivanov Ivan Ivanovich";
//        String fullName1 = fullName.toUpperCase();
        String x = " ";
        char [] charArray = fullName.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray [i] > 'A' && charArray [i] < 'Z'){
                x += " " + charArray[i]; 
            } else {
                x += charArray[i];
            }
        }
                
        //fullName1.replaceAll("\\s+", " ");
        //fullName1.replaceAll("\\s([А-ЯЁ])", ". $1");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + x.toUpperCase());
        System.out.println("");


    }

    public static void Task_2(){
        System.out.println("Задание 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё' , 'е');
//        String[] words = fullName.split(" ");
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}