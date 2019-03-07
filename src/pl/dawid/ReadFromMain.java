package pl.dawid;

public class ReadFromMain {
    public static void readNumbersFromMainClass(String args[]) {
        for (String str : args) {
            Data.numberList.add(Integer.parseInt(str));
        }
    }

    public static void loadToClassList() {
        for (int i = 0; i < Data.numberList.size(); i++) {
            Number number = new Number(Data.numberList.get(0), i);
            Data.numbersClassList.add(number);
        }
        
    }
}
