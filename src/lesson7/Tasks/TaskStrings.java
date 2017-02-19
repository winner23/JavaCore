package lesson7.Tasks;

public class TaskStrings {

    private boolean checkSubstring(String string, String subString){
        return string.contains(subString);
    }

    public static void main(String[] args) {

        TaskStrings task = new TaskStrings();
        String str1 = "IT Academy";
        String str2 = "IT";

        System.out.println(task.checkSubstring(str1,str2));


    }
}
