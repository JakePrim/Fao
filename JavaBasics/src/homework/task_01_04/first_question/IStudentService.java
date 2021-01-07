package homework.task_01_04.first_question;

import java.util.List;

public interface IStudentService<T> {
    void add(T t);

    void remove(T t);

    boolean remove(int number);

    void update(T t);

    T find(int number);

    T find(String name);

    List<T> findAll();

    void add(List<T> t);
}
