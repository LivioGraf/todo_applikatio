package ch.bbw.modul_431_todo_application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class todoController {

/* Routen um alle Todos zu sehen */
    @GetMapping("/")
    public String getTodos() {
        return "todo";
    }

/* Routen um ein Todo zu erstellen */
    @GetMapping("/createtodo")
    public String getCreateTodos() {
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
