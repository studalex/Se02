
public class Main {
    public static void main(String[] str)
    {
        GroupList allGroup=new GroupList();
        //Создаем группы по рисованию и литературе
        Group<Integer> groupIzo = new Group(discipline.PAINTING);
        Group<Double> groupLit = new Group(discipline.LITERATURE);

        //Добавляем группы в список всех групп
        allGroup.addGroup(groupIzo);
        allGroup.addGroup(groupLit);

        System.out.println("Список всех групп до заполнения студентами:");
        allGroup.showAllGroup();

        //Добавляем студентов в группы
        groupIzo.addStudent("Иван Айвазовский");
        groupIzo.addStudent("Илья Репин");
        groupIzo.addStudent("Владимир Маяковский");

        groupLit.addStudent("Александр Пушкин");
        groupLit.addStudent("Владимир Маяковский");

        System.out.println("Список всех групп после заполнения студентами:");
        allGroup.showAllGroup();

        System.out.println("Выставляем студентам оценки:");
        groupIzo.setMark(2, "Александр Пушкин");
        groupIzo.setMark(2, "Илья Репин");
        groupIzo.setMark(3, "Илья Репин");
        groupIzo.setMark(5, "Илья Репин");
        groupIzo.setMark(4, "Владимир Маяковский");
        groupIzo.setMark(5, "Владимир Маяковский");
        groupIzo.setMark(5, "Владимир Маяковский");
        groupIzo.setMark(2, "Иван Айвазовский");

        groupLit.setMark(20.0, "Александр Пушкин");
        groupLit.setMark(30.0, "Александр Пушкин");
        groupLit.setMark(40.0, "Александр Пушкин");
        groupLit.setMark(20.0, "Илья Репин");
        groupLit.setMark(50.0, "Владимир Маяковский");
        groupLit.setMark(20.0, "Владимир Маяковский");
        groupLit.setMark(10.0, "Владимир Маяковский");
        groupLit.setMark(20.0, "Иван Айвазовский");

        System.out.println();
        System.out.println("Список всех групп после заполнения студентами и выставления оценок:");
        allGroup.showAllGroup();

        System.out.println("Поиск студента Владимир Маяковский");
        allGroup.infoAboutStudent("Владимир Маяковский");
        System.out.println();

        System.out.println("Сравнение оценок Владимира Маяковского по литературе и по рисованию:");
        allGroup.studentCompareTo("Владимир Маяковский");

        System.out.println();
        System.out.println("Сравнение оценок Ивана Айвазовского по литературе и по рисованию:");
        allGroup.studentCompareTo("Иван Айвазовский");

        System.out.println();
        System.out.println("Средний балл Владимира Маяковского");
        allGroup.averageMarkStudent("Владимир Маяковский");
    }
}
