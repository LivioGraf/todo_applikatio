package ch.bbw.modul_431_todo_application;

import ch.bbw.modul_431_todo_application.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.stream.Collectors;

@Controller
public class TodoController {
    @Autowired UserRepo user;

/* Routen um alle Todos zu sehen */
    @GetMapping("/")
    public String getTodos() {
        return "todo";
    }

/* Routen um ein Todo zu erstellen. */
    @GetMapping("/createtodo")
    public String getCreateTodos() {
        user.findAll();
        System.out.println(user.findAll().stream().map(n->String.valueOf(n)).collect(Collectors.joining("-", "{", "}")));
        Todo temp = new Todo();
        temp.setTodoName("einkaufen");
        user.save(temp);
        System.out.println(user.findAll().stream().map(n->String.valueOf(n)).collect(Collectors.joining("-", "{", "}")));
        return "createtodo";
    }

    @PostMapping("/createtodo")
    public String postCreateTodos() {
        return "createtodo";
    }

/* Routen um ein Todo zu bearbeiten */
    @GetMapping("/updatetodo")
    public String getUpdateTodos() {
        return "updatetodo";
    }

    @PostMapping("/updatetodo")
    public String postUpdateTodos() {
        return "updatetodo";
    }

/* Routen um ein Todo zu löschen*/
    @GetMapping("/deletetodo")
    public String getDeleteTodos() {
        return "deletetodos";
    }

    @PostMapping("/deletetodo")
    public String postDeleteTodos() {
        return "deletetodos";
    }
}
