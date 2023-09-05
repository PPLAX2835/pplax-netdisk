package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName hibernate_sequence
*/
public class HibernateSequence implements Serializable {

    /**
    * 
    */
    @ApiModelProperty("")
    private Long nextVal;

    /**
    * 
    */
    private void setNextVal(Long nextVal){
    this.nextVal = nextVal;
    }


    /**
    * 
    */
    private Long getNextVal(){
    return this.nextVal;
    }

}
