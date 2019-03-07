package pl.dawid;

public class Main {
    public static void main(String[] args) {
        ReadFromMain.readNumbersFromMainClass(args);
        for (int i = 0; i < Data.numberList.size(); i++) {
            System.out.println(Data.numberList.get(i));
        }
    }
}
