package pl.dawid;

public class ReadFromMain {
    public static void readNumbersFromMainClass(String args[]) {
        for (String str : args) {
            Data.numberList.add(Integer.parseInt(str));
        }
    }
}
