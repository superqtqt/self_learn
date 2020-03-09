package com.web.jpa.entry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@ApiModel("jpa的例子")
public class ValidEntry {
    @NotNull
    @Length(min = 10,max = 100)
    @ApiModelProperty(name = "id")
    private String id;
    @ApiModelProperty(name = "name")
    private String name;

    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\\\d{8}$")
    @ApiModelProperty(name = "phtone")
    private String phoneNo;
}
