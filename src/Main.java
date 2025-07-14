public class Main {
    public static void main(String[] args) {
        System.out.println("задания 1");
        var dog =8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);

        System.out.println("задания 2");
        dog = dog + 4;
        System.out.println(dog);
        cat =cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("задания 3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);

        System.out.println("задания 4");
        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2) / 7;
        System.out.println(friend);

        System.out.println("задания 5");
        var frod = 3.5;
        System.out.println(frod);
        frod = (frod * 10) / 3.5;
        System.out.println(frod);
        frod = frod + 4;
        System.out.println(frod);

        System.out.println("задания 6");
        var b1= 78.2;
        System.out.println(b1);
        var b2 = 82.7;
        System.out.println(b2);
        var totalWeight = b1 + b2;
        System.out.println("общая масса " + totalWeight + " кг!");
        var weightDifference = b2 - b1;
        System.out.println("разница в весе " + weightDifference + " кг!");

        System.out.println("задания 7");
        var remainder = (b2 % b1);
        System.out.println(remainder);

        System.out.println("задания 8");
        var hoursTotal = 640;
        System.out.println(hoursTotal);
        var workingHours =8;
        System.out.println(workingHours);
        var Human = hoursTotal/workingHours;
        System.out.println("Всего работников в компании " + Human + " человек");

        var humans = Human + 94;
        System.out.println(humans);
        var hours = humans * 8;
        System.out.println("если в компании работает " + humans + " человек, то всего " + hours + " часов  работы может быть" +
                " проделено между сотрудниками");




    }
}