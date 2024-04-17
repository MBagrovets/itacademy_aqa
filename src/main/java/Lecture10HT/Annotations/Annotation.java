package Lecture10HT.Annotations;

import java.lang.annotation.*;

//@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited // для всех наследников класса, помеченного @Annotation
public @interface Annotation {
    boolean run() default true;
    int i() default 1;
    String value(); //обязательно прописывается в агументах класса, потому что нет default значения
}
