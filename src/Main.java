public class Main {
    public static void main(String[] args) {
        //1 задача
        var dog = 8.0;
        System.out.println( dog);
        var cat = 3.6;
        System.out.println( cat);
        var paper = 763789;
        System.out.println(paper);

        // 2 Задача
        dog = dog + 4;
        System.out.println( "dog + 4 = " + dog);
        cat = cat + 4;
        System.out.println("cat + 4 = " + cat);
        paper = paper + 4;
        System.out.println("paper + 4 = " + paper);

        //3 задача
        dog = dog - 3.6;
        System.out.println("dog - 3.6 = " + dog);
        cat = cat - 1.6;
        System.out.println("cat - 1.6 = " + cat );
        paper = paper - 7639;
        System.out.println("paper - 7639 = " + paper);

        //4 Задача
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend/7;
        System.out.println("friend / 7 = " + friend);

        //5 Задача
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println("frog + 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);

        //6 Задача
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var fightersWeight = oneBoxer + twoBoxer;
        fightersWeight = twoBoxer + oneBoxer;
        System.out.println("Общий вес бойцов = " + fightersWeight);
        fightersWeight = twoBoxer - oneBoxer;
        System.out.println("Разница между бойцами = " + fightersWeight);

        //7 Задача
        fightersWeight = twoBoxer - oneBoxer;
        fightersWeight = twoBoxer % oneBoxer;

        //8 Задача (1)
        var hour = 640;
        var employeeTime = 8;
        var employees = hour / employeeTime;
        employees = hour / employeeTime;
        System.out.println("Всего работников в компании — " + employees + " человек");
        // 8 Задача (2)
        var newHour = employees * 8;
        employees = employees + 94;
        newHour = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + newHour + " часов работы может быть поделено между сотрудниками");
    }

}