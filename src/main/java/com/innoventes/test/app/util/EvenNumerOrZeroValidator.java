public class EvenNumberOrZeroValidator implements ConstraintValidator<EvenNumberOrZero, Number>{
  @Override
  public boolean isValid(Number value, ConstraintValidatorContext context){
    if(value==null return true;
    long num=value.longValue();
     return num==0 || num%2==0;
  }
}
  
