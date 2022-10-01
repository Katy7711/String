public class Main {
   public static void main(String[] args) {
       task_1_2 ();
       task_2 ();

   }

   public static void task_1_2 () {

    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
    System.out.println("ФИО сотрудника - " + fullName);
    String fullNames1 = fullName.toUpperCase();
       System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNames1);

   }

   public static void task_2 () {
       String fullName = "Иванов Семён Семёнович";
       String fullName1 = fullName.replace ('ё', 'e');
       System.out.println("Данные ФИО сотрудника — " + fullName1);
   }
}
