package ch.bbw.modul_431_todo_application;


import ch.bbw.modul_431_todo_application.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepo extends JpaRepository<Todo,Integer> {

}

