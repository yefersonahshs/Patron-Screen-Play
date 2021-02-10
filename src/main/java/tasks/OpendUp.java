package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import useinterface.ChoucairAcademyPage;

public class OpendUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;

    public static OpendUp thePage() {
        return Tasks.instrumented(OpendUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
 actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
