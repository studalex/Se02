import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
public @interface Info {
    String author();
    String date();
}
