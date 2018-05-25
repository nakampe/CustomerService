package com.razaractor.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Setter;

@Entity
public class Customer implements Serializable
{
   @Setter private Long id;
   @Setter private String name;
   @Setter private String surname;
   @Setter private Integer age;
   @Setter private String email;
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   public Long getId()
   {
      return id;
   }
 
   @Digits(fraction = 0, integer = 3)
   public Integer getAge()
   {
      return age;
   }

   @NotNull
   @Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
   public String getName()
   {
      return name;
   }

   @NotNull
   @Pattern(regexp = "[a-z-A-Z]*", message = "Surname has invalid characters")
   public String getSurname()
   {
      return surname;
   }
   
   @Pattern(regexp = "[A-Za-z0-9._%-+]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,4}", message = "Invalid email")
   public String getEmail()
   {
      return email;
   }

   /** Default value included to remove warning.  Remove or modify at will.  */  
   private static final long serialVersionUID = 1L;
}