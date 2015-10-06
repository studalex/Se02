import java.util.ArrayList;
import java.util.List;

/**
 * Класс организует работу со списком студентов в группе
 * @param <T> тип оценок для заданного предмета
 */
public class Group<T extends  Number> {
    /**
     * Переменная содержит название предмета
     */
    private discipline disciplineName;
    /**
     * Список содержит имя и фамилию студентов в группе
     */
    private ArrayList<String> students = new ArrayList<String>();
    /**
     * Список содержит список оценок для каждого студента
     */
    private ArrayList<ArrayList<Mark<T>>> allMark = new ArrayList<ArrayList<Mark<T>>>();

    /**
     * Метод возвращает название дисциплины
     *
     * @return название дисциплины
     */
    public discipline getDisciplineName() {
        return disciplineName;
    }

    /**
     * Устанавливает название дисциплины
     *
     * @param disciplineName название дисциплины
     */
    private void setDisciplineName(discipline disciplineName) {
        this.disciplineName = disciplineName;
    }

    /**
     * Конструктор класса
     *
     * @param discipline название дисциплины
     */
    public Group(discipline discipline) {
        setDisciplineName(discipline);
    }

    /**
     * Возвращает строку, которая содержит информацию о списке группы и оценках студентов
     *
     * @return список группы
     */
    public String getGroupList() {
        String groupList = "Список группы  по " + getDisciplineName() + ": \n";
        int numberStudent;
        for (String studentName : students) {
            groupList += studentName + ":";
            numberStudent = students.indexOf(studentName);
            groupList += allMark.get(numberStudent) + " ";
            groupList += "\n";
        }
        return groupList;
    }

    /**
     * Возвращает информацию о выбранном студенте в виде строки
     *
     * @param studentName имя студента
     * @return информация о студенте
     */
    public String studInfo(String studentName) {
        int numberStudent = students.indexOf(studentName);
        if (numberStudent != -1) {
            String groupList = "Студент с именем " + studentName + " имеет оценки:";
            groupList += allMark.get(numberStudent) + " ";
            groupList += " по " + getDisciplineName();
            return groupList;
        } else {
            System.out.println("Студента с именем " + studentName + " нету в группе по " + this.disciplineName);
            return null;
        }
    }

    /**
     * Возвращает среднюю оценку выбранного студента
     *
     * @param studentName Имя студента
     * @return средняя оценка
     */
    public Mark averageMark(String studentName) {
        Mark mark = new Mark(0);
        int numberStudent = students.indexOf(studentName);
        if (numberStudent != -1) {
            for (Mark eachMark : allMark.get(numberStudent)) {
                int i = 0;
                mark.setMark(mark.roundMark() + eachMark.roundMark());
            }
            mark.setMark(mark.roundMark() / allMark.get(numberStudent).size());
        } else {
            System.out.println("Студента с именем " + studentName + " нету в группе по " + this.disciplineName);
        }
        return mark;
    }

    /**
     * Поиск студента в данной группе
     *
     * @param studentName имя студента
     * @return true - есть, false - нету
     */
    public boolean findStudent(String studentName) {
        if (students.indexOf(studentName) == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Метод позволяет выставить студенту оценку
     *
     * @param mark        Выставляемая оценка
     * @param studentName Имя студента
     */
    public void setMark(T mark, String studentName) {
        Mark<T> newMark = new Mark<>(mark);
        int numberStudent = students.indexOf(studentName);
        if (numberStudent != -1) {
            System.out.println("Студент с именем " + studentName + " получил по " + this.disciplineName + " оценку:" + newMark);
            allMark.get(numberStudent).add(newMark);
        } else {
            System.out.println("Студента с именем " + studentName + " нету в группе по " + this.disciplineName);
        }
    }

    /**
     * Метод позволяет добавлять студента в группу
     *
     * @param studentName
     */
    public void addStudent(String studentName) {
        students.add(studentName);
        this.allMark.add(new ArrayList<Mark<T>>());
    }
}
