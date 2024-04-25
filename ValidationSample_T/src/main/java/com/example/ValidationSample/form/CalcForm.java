package com.example.ValidationSample.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
/*Model을 사용할 수 있게...*/
public class CalcForm {
    @NotNull
    @Range(min=1,max=10)
    private Integer leftNum;

    @NotNull
    @Range(min=1,max=10)
    private Integer rightNum;
}
