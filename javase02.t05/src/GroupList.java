import java.util.ArrayList;

/**
 * Класс организует работу со всеми группами
 */
public class GroupList {
    /**
     * Содержит список всех групп
     */
    ArrayList<Group> groupList;

    /**
     * Конструктор класса
     */
    public GroupList() {
        groupList = new ArrayList<>();
    }

    /**
     * Метод добавляет группу в список групп
     *
     * @param group добавляемая группа
     */
    public void addGroup(Group group) {
        groupList.add(group);
    }

    /**
     * Выводит информацию о всех группах
     */
    public void showAllGroup() {
        for (Group eachGroup : groupList) {
            System.out.println(eachGroup.getGroupList());
        }
    }

    /**
     * Выводит на экран информацию о заданном студенте
     *
     * @param studentName
     */
    public void infoAboutStudent(String studentName) {
        for (Group eachGroup : groupList) {
            System.out.println(eachGroup.studInfo(studentName));
        }
    }

    /**
     * Метод выводит на экран средний балл заданного студента по всем дисциплинам
     *
     * @param studentName имя студента
     */
    public void averageMarkStudent(String studentName) {
        for (Group eachGroup : groupList) {
            System.out.println(eachGroup.averageMark(studentName) + " по " + eachGroup.getDisciplineName());
        }
    }

    /**
     * Метод сравнивает средний балл заданного студента по всем дисциплинам
     *
     * @param studentName имя студента
     */
    public void studentCompareTo(String studentName) {
        //проходим по всем дисциплинам
        for (Group firstGroup : groupList) {
            for (Group secondGroup : groupList) {
                //Не сравниваем средний балл по одному и тому же предмету
                if (firstGroup.getDisciplineName() != secondGroup.getDisciplineName()) {
                    //Если студент есть в данной группе
                    if (firstGroup.findStudent(studentName)) {
                        if (secondGroup.findStudent(studentName)) {

                            //сравниваем средний балл и выводим соответствующие сообщения
                            int resultCompareTo = firstGroup.averageMark(studentName).compareTo(secondGroup.averageMark(studentName));
                            if (resultCompareTo == 1) {
                                System.out.print("Студент " + studentName + " по дисциплине " + firstGroup.getDisciplineName());
                                System.out.print(" имеет более высокй средний балл(" + firstGroup.averageMark(studentName));
                                System.out.println(") чем по дисциплине " + secondGroup.getDisciplineName() + "(" + secondGroup.averageMark(studentName) + ")");
                            } else {
                                if (resultCompareTo == -1) {
                                    System.out.print("Студент " + studentName + " по дисциплине " + firstGroup.getDisciplineName());
                                    System.out.print(" имеет менее высокй средний балл(" + firstGroup.averageMark(studentName));
                                    System.out.println(") чем по дисциплине " + secondGroup.getDisciplineName() + "(" + secondGroup.averageMark(studentName) + ")");
                                } else {
                                    System.out.print("Студент " + studentName);
                                    System.out.print(" имеет одинаковый средний балл(" + firstGroup.averageMark(studentName));
                                    System.out.println(") по дисциплине " + secondGroup.getDisciplineName() + " и " + secondGroup.getDisciplineName());
                                }
                            }
                        } else
                            System.out.println("Заданного студента нету в группе по:" + secondGroup.getDisciplineName()+", сравнивать не с чем");

                    } else System.out.println("Заданного студента нету в группе по:" + firstGroup.getDisciplineName()+", сравнивать не с чем");
                }
            }
        }
    }
}
