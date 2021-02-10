package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import useinterface.SearchCoursePage;

public class Search implements Task{

    private String course;

    public static Search the(String course) {

    return Tasks.instrumented(Search.class);

    }

    public Search(String course) {
        this.course = course;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
        Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
        Click.on(SearchCoursePage.BUTTON_GO),
        Click.on(SearchCoursePage.SELECT_COURSE)
        );
    }
}
