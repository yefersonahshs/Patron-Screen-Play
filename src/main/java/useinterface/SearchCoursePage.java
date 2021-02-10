package useinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage  {

    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE= Target.the("buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("da click para buscar el curso").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
    public static final  Target NAME_COURSE= Target.the("extrae el nombre del curso").located(By.xpath("//h1[]contains(text(),'Recursos Automatizacion Bancolombia')]"));

}
