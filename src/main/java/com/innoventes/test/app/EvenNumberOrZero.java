@Documented
@Constraint(validatedBy= EvenNumberOrZeroValidator.class)
@Retentatio(RetentationPolicy.RUNTIME)
public interface EvenNumberOrZero{
String message() default "value must be even or zero";
   Class<?>[] groups() default{};
    class<? extends Payload>[] payload() defaut{};
}
