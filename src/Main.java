public class Main {
    public static void main(String[] args) {
        Student first = new Student("Azhikulov Altynbek ","OshTU", "Development and operation of oil and gas fields",5,2016,198);
        Student second = new Student("Bolotov Bolot","Sharaga","TOE",3,2014,56);
        Student third = new Student("Timurov Timur","Garvard","PTO",5,2011,211);
        System.out.println(first.getInfo());
        System.out.println("\n"+second.getInfo());
        System.out.println("\n"+third.getInfo());
    }
}