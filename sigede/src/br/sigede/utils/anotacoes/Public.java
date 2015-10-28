package br.sigede.utils.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //verificação em tempo real
@Target({ ElementType.TYPE, ElementType.METHOD }) //interceptacao metodo a metodo
public @interface Public {

}
