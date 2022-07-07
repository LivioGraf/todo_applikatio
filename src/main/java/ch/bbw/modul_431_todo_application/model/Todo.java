package ch.bbw.modul_431_todo_application.model;

import javax.persistence.*;

@Entity
@Table(name = "Todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "todoName")
    private String todoName;

    public Todo() {

    }

    public Todo(String todoName) {
        this.todoName = todoName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todoName='" + todoName + '\'' +
                '}';
    }
}
